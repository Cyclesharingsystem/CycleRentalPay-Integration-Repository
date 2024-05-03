package com.example.stripepayment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data

public class UserDTO {
    private double hours ;
    private String Plan;
private double estimatedAmount;


}
