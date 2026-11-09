package com.naturepictureback.service;

import com.naturepictureback.models.User;
import com.naturepictureback.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class UserService {
    private UserRepository userRepository;

    public void register(User user){

        if (!user.getEmail().contains("@") || !user.getEmail().contains(".")) {
            throw new BadRequestException("Invalid email address");
        }
    }

}
