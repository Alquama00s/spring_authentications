package com.alquama.oauth.resource.resource_server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Config {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(req->req.requestMatchers("/api/**")
            .authenticated())
            .oauth2ResourceServer(res->res.jwt(Customizer.withDefaults()));
        
        return http.build();
    }
    
}