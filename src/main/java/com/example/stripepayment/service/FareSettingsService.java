package com.example.stripepayment.service;

import com.example.stripepayment.dto.FareSettingsDTO;
import com.example.stripepayment.model.FareSettings;

public interface FareSettingsService {
    double getHourlyRate();
    double getDailyRate();
    double getWeeklyRate();
    double getMonthlyRate();

    FareSettings updateFareSettings(FareSettingsDTO fareSettingsDTO);

    FareSettings createFareSettings(FareSettingsDTO fareSettingsDTO);
}