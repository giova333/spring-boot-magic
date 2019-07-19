package com.example.customspringboot.app;

import com.example.customspringboot.config.core.EnableMagicProperties;
import com.example.customspringboot.config.core.MagicApplication;
import com.example.customspringboot.config.web.ServerProperties;
import org.springframework.boot.SpringApplication;

@MagicApplication
@EnableMagicProperties(ServerProperties.class)
public class CustomSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomSpringBootApplication.class, args);
    }

}
