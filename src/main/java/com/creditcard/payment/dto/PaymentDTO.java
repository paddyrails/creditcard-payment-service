package com.creditcard.payment.dto;
import com.creditcard.payment.model.*;import lombok.*;import java.math.BigDecimal;import java.time.LocalDateTime;
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class PaymentDTO { private String id;private String accountId;private String paymentReference;private BigDecimal amount;private PaymentMethod paymentMethod;private PaymentType paymentType;private PaymentStatus status;private String maskedSourceAccount;private String confirmationNumber;private LocalDateTime scheduledDate;private LocalDateTime processedDate;private LocalDateTime createdAt; }
