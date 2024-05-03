package com.example.stripepayment.service;

import com.example.stripepayment.dto.UserDTO;
import com.example.stripepayment.model.User;
import com.example.stripepayment.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService {


@Autowired
private FareSettingsService fareSettingsService;

@Autowired
private UserRepository userRepository;
    @Override
    public String getSubscriptionAmount(UserDTO userDTO, String type, double hours) {

            switch (type) {
                case "DAILY":
                    userDTO.setPlan("Daily");
                    userDTO.setEstimatedAmount(fareSettingsService.getDailyRate());
                case "WEEKLLY":
                    userDTO.setPlan("Weekly");
                    userDTO.setEstimatedAmount(fareSettingsService.getWeeklyRate());
                case "MONTHLY":
                    userDTO.setPlan("Monthly");
                    userDTO.setEstimatedAmount(fareSettingsService.getMonthlyRate());
                default:
                    double PayASYouGo=fareSettingsService.getHourlyRate()*hours;
                    userDTO.setHours(hours);
                  userDTO.setEstimatedAmount(PayASYouGo);
            }
              User user=new User();
            BeanUtils.copyProperties(userDTO,user);
userRepository.save(user);
        return "success";
    }

    @Override
    public double getestimatedAmount(Long id) {
        User user= userRepository.findById(id).get();
        return user.getEstimatedAmount();
    }
}
