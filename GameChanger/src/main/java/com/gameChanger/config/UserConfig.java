package com.gameChanger.config;

import com.gameChanger.repository.UserRepository;
import com.gameChanger.service.UserService;
import com.gameChanger.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    private final UserRepository userRepository;

    @Autowired
    public UserConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl(userRepository);
    }
}
