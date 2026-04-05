package com.finance.dashboard.finance.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class FinancialRecord {

    @Id
    @GeneratedValue
    private Long id;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private RecordType type;

    private String category;
    private LocalDate date;
    private String description;

    // getters and setters
}