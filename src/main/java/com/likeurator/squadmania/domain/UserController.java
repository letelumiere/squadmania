package com.likeurator.squadmania.domain;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

//로그인, 회원가입, 권한부여 등의 controller
@RestController
@RequestMapping("/api") @AllArgsConstructor
public class UserController {

    
    @PostMapping ("/addToRoleToUser")
    public void addToRoleToUser(){}
    
}
