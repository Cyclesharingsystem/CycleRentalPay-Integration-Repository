package com.example.stripepayment.repository;

import com.example.stripepayment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
