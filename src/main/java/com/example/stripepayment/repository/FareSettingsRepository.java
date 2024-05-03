package com.example.stripepayment.repository;


import com.example.stripepayment.model.FareSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FareSettingsRepository extends JpaRepository<FareSettings, Long> {
    Optional<FareSettings> findTopByOrderByUpdatedAtDesc();
}