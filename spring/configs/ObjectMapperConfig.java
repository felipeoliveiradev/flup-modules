package com.task.manager.modules.spring.configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.task.manager.modules.spring.Json;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectMapperConfig {

    @Bean
    public ObjectMapper objectMapper() {
        return Json.mapper();
    }
}