package com.creditcard.payment.service;
import com.creditcard.payment.dto.*;import java.util.List;
public interface PaymentService { PaymentDTO makePayment(CreatePaymentRequest req);PaymentDTO schedulePayment(CreatePaymentRequest req);PaymentDTO getPaymentById(String id);List<PaymentDTO> getPaymentsByAccountId(String accountId);List<PaymentDTO> getScheduledPayments(String accountId);PaymentDTO cancelPayment(String id);void processScheduledPayments(); }
