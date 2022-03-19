package com.miku.blog.controller;

import com.miku.blog.Vo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
public class LoginController {
    @PostMapping("/username")
    public ResponseEntity<User> test(@Param("username") String username){
        System.out.println(username);
        return ResponseEntity.status(200).build();
    }

}
