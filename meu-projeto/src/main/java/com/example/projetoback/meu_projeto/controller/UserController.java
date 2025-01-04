package com.example.projetoback.meu_projeto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoback.meu_projeto.entity.User;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping(value = "/users")
public class UserController {


    @GetMapping()
    public ResponseEntity<List<User>> findAll (){

        User maria = new User("1","maria","maria@gmail.com");
        User alex = new User("2","alex","alex@gmail.com");
            List<User> list = new ArrayList<>();
            list.addAll(Arrays.asList(maria,alex));
            
            return ResponseEntity.ok().body(list);
        
    }
}
