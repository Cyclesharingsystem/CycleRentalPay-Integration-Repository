package com.example.stripepayment.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FareSettingsDTO {
    private double hourlyRate;
    private double dailyRate;
    private double weeklyRate;
    private double monthlyRate;

}