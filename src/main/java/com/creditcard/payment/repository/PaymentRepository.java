package com.creditcard.payment.repository;
import com.creditcard.payment.model.*;import org.springframework.data.jpa.repository.JpaRepository;import java.time.LocalDateTime;import java.util.*;
public interface PaymentRepository extends JpaRepository<Payment,String> { List<Payment> findByAccountIdOrderByCreatedAtDesc(String accountId);List<Payment> findByAccountIdAndStatus(String accountId,PaymentStatus status);List<Payment> findByScheduledDateBeforeAndStatus(LocalDateTime date,PaymentStatus status); }
