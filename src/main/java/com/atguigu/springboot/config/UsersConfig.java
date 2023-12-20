package com.atguigu.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class UsersConfig {

    @Bean
    public UserDetailsService vip(PasswordEncoder passwordEncoder){
        UserDetails vip1 = User
                .withUsername("vip1")
                .password(passwordEncoder.encode("password1"))
                .roles("VIP1")
                .build();
        UserDetails vip2 = User.withUsername("vip2")
                .password(passwordEncoder.encode("password2"))
                .roles("VIP2")
                .build();
        UserDetails vip3 = User.withUsername("vip3")
                .password(passwordEncoder.encode("password3"))
                .roles("VIP3")
                .build();
        return new InMemoryUserDetailsManager(vip1, vip2, vip3);
    }

    @Bean(name = "passwordEncoder")
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
