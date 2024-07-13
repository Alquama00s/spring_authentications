package com.alquama.auth.authentications;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class config {



    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.httpBasic(Customizer.withDefaults());
        http.authorizeHttpRequests(req->req.requestMatchers("/public/**").permitAll());
        http.authorizeHttpRequests(req->req.anyRequest().authenticated());
        return http.build();
    }
    


    @Bean
    public UserDetailsManager userDetailsManager(){
        var userDetailsManager = new InMemoryUserDetailsManager();
        var john = User.withUsername("john").password("{noop}doe").authorities("read")
        .build();
        userDetailsManager.createUser(john);
        return userDetailsManager;
    }

}
