package com.creditcard.payment.model;
import jakarta.persistence.*;import lombok.*;import java.math.BigDecimal;import java.time.LocalDateTime;
@Entity @Table(name="payments") @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Payment {
    @Id @GeneratedValue(strategy=GenerationType.UUID) private String id;
    private String accountId;@Column(unique=true) private String paymentReference;
    @Column(precision=15,scale=2) private BigDecimal amount;
    @Enumerated(EnumType.STRING) private PaymentMethod paymentMethod;
    @Enumerated(EnumType.STRING) private PaymentType paymentType;
    @Enumerated(EnumType.STRING) private PaymentStatus status;
    private String sourceAccount;private String confirmationNumber;
    private LocalDateTime scheduledDate;private LocalDateTime processedDate;private String failureReason;private LocalDateTime createdAt;
    @PrePersist void onCreate(){createdAt=LocalDateTime.now();if(status==null)status=PaymentStatus.PENDING;}
}
