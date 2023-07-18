package com.greenstitch.greenstitch.controller;

import com.greenstitch.greenstitch.Dto.LoginDto;
import com.greenstitch.greenstitch.Service.UsersService;
import com.greenstitch.greenstitch.model.Users;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return new ResponseEntity<>("<h1>Hello from GreenStitch</h1>", HttpStatus.OK);
    }


}
