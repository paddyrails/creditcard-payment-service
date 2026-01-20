package com.creditcard.payment.controller;
import com.creditcard.payment.dto.*;import com.creditcard.payment.service.PaymentService;import jakarta.validation.Valid;import lombok.RequiredArgsConstructor;import org.springframework.http.*;import org.springframework.web.bind.annotation.*;import java.util.List;
@RestController @RequestMapping("/api/payments") @RequiredArgsConstructor
public class PaymentController {
    private final PaymentService svc;
    @PostMapping public ResponseEntity<PaymentDTO> make(@Valid @RequestBody CreatePaymentRequest req){return ResponseEntity.status(HttpStatus.CREATED).body(svc.makePayment(req));}
    @PostMapping("/schedule") public ResponseEntity<PaymentDTO> schedule(@Valid @RequestBody CreatePaymentRequest req){return ResponseEntity.status(HttpStatus.CREATED).body(svc.schedulePayment(req));}
    @GetMapping("/{id}") public ResponseEntity<PaymentDTO> getById(@PathVariable String id){return ResponseEntity.ok(svc.getPaymentById(id));}
    @GetMapping("/account/{accountId}") public ResponseEntity<List<PaymentDTO>> getByAccount(@PathVariable String accountId){return ResponseEntity.ok(svc.getPaymentsByAccountId(accountId));}
    @GetMapping("/account/{accountId}/scheduled") public ResponseEntity<List<PaymentDTO>> getScheduled(@PathVariable String accountId){return ResponseEntity.ok(svc.getScheduledPayments(accountId));}
    @PostMapping("/{id}/cancel") public ResponseEntity<PaymentDTO> cancel(@PathVariable String id){return ResponseEntity.ok(svc.cancelPayment(id));}
}
