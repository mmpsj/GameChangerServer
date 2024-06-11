package com.gameChanger.config;

import com.gameChanger.repository.ClothesRepository;
import com.gameChanger.service.ClothesService;
import com.gameChanger.service.ClothesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClothesConfig {

    private final ClothesRepository clothesRepository;

    @Autowired
    public ClothesConfig(ClothesRepository clothesRepository) {
        this.clothesRepository = clothesRepository;
    }

    @Bean
    public ClothesService clothesService() {
        return new ClothesServiceImpl(clothesRepository);
    }
}
