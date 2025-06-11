package com.proyecto.marketsync.Seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // permite POST sin token CSRF
                .authorizeHttpRequests(auth -> auth
                .anyRequest().authenticated() // requiere autenticación
                )
                .httpBasic(); // permite usar Postman con Basic Auth

        return http.build();
    }
}
