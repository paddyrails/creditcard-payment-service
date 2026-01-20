package com.creditcard.payment.dto;
import com.creditcard.payment.model.*;import jakarta.validation.constraints.*;import lombok.*;import java.math.BigDecimal;import java.time.LocalDateTime;
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class CreatePaymentRequest { @NotBlank private String accountId;@NotNull @DecimalMin("0.01") private BigDecimal amount;@NotNull private PaymentMethod paymentMethod;@NotNull private PaymentType paymentType;private String sourceAccount;private LocalDateTime scheduledDate; }
