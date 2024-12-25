package com.example.SecurityImplementation.config;

import com.example.SecurityImplementation.service.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig
{
    @Autowired
    private MyUserDetailService userDetailService;
@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
{
http.authorizeHttpRequests(request->request.anyRequest().authenticated());
http.httpBasic(Customizer.withDefaults());
http.csrf(AbstractHttpConfigurer::disable);
return http.build();
}

}
