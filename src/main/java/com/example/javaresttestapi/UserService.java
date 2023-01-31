package com.example.javaresttestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Users createUserService() {
        Users users = new Users();
//        users.setBirthDate(new Date());
        users.setEmail("sdgff@gmail.com");
        users.setFirstName("John");
        users.setLastName("Johnson");
        userRepository.save(users);
        return users;
    }
}
