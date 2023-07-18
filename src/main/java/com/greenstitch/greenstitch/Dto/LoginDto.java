package com.greenstitch.greenstitch.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestBody;

@Getter
@Setter
@RequiredArgsConstructor
public class LoginDto {
    private String email;
    private String password;
}
