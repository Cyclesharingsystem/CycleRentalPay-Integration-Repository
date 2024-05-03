package com.example.stripepayment.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data

public class User {
@Id
    private Long id;
    private String  plans;
   private  double estimatedAmount;
}

