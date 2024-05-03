package com.example.stripepayment.service;


import com.example.stripepayment.dto.UserDTO;

public interface UserService {
public String getSubscriptionAmount(UserDTO userDTO, String type, double hours);
public double getestimatedAmount(Long id );

}
