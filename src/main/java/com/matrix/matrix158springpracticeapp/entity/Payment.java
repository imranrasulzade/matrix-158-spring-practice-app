package com.matrix.matrix158springpracticeapp.entity;

import com.matrix.matrix158springpracticeapp.enums.Currency;
import com.matrix.matrix158springpracticeapp.enums.PaymentMethod;
import com.matrix.matrix158springpracticeapp.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "mj_payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    private String studentBankAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    private String companyBankAccount;

    private Integer amount;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;


}
