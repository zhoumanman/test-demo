package com.demo.config;

import com.demo.service.UserClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfigure {

    @Bean
    public UserClient userClient(UserProperties userProperties) {
        System.out.println("create userClient:" + userProperties.getName());
        return new UserClient(userProperties);
    }
}
