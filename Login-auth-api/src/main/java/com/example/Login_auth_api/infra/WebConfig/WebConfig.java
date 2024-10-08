package com.example.Login_auth_api.infra.WebConfig;

import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            CorsRegistration corsRegistration = registry.addMapping("/**")
                    .allowedOrigins("http://localhost:4200")
                    .allowedMethods("GET", "POST", "DELETE", "PUT")
                    .allowedHeaders("*")
                    .allowCredentials(true);

        }
    }

