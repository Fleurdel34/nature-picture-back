package com.naturepictureback.service;

import com.naturepictureback.enumeration.TypeRole;
import com.naturepictureback.exception.RequestException;
import com.naturepictureback.models.Role;
import com.naturepictureback.models.User;
import com.naturepictureback.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {
    private UserRepository userRepository;

    @SneakyThrows
    public void register(User user){

        if (!user.getEmail().contains("@") || !user.getEmail().contains(".")) {
            throw new RequestException(RequestException.ErrorRequest.BAD_REQUEST_EXCEPTION, "Invalid email address");
        }

        Optional<User> userExists= userRepository.findByEmail(user.getEmail());

        if(userExists.isPresent()){
            throw new RequestException(RequestException.ErrorRequest.BAD_REQUEST_EXCEPTION, "mail is already in use");
        }

        Role role = new Role();
        role.setRole(TypeRole.USER);
        user.setRole(role);

        userRepository.save(user);
    }

}
