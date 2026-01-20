package com.creditcard.payment.exception;
import org.springframework.http.*;import org.springframework.web.bind.annotation.*;import java.util.*;
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(PaymentNotFoundException.class) public ResponseEntity<Map<String,Object>> h1(PaymentNotFoundException e){return build(HttpStatus.NOT_FOUND,e.getMessage());}
    @ExceptionHandler(InvalidPaymentException.class) public ResponseEntity<Map<String,Object>> h2(InvalidPaymentException e){return build(HttpStatus.BAD_REQUEST,e.getMessage());}
    private ResponseEntity<Map<String,Object>> build(HttpStatus s,String m){Map<String,Object> r=new HashMap<>();r.put("message",m);return ResponseEntity.status(s).body(r);}
}
