package com.cpan252.clotheswarehouse.model.form;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.cpan252.clotheswarehouse.model.User;

import lombok.Data;


// Annotate to indicate that this class is a form object that will be used to collect user input from the registration form

@Data
public class RegistrationForm {
    private String username;
    private String password;

    public User toUser(PasswordEncoder passwordEncoder) {
        return User.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .build();
    }
}
