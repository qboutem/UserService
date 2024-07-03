package com.hromenko.userserviceroman.controller;

import com.hromenko.userserviceroman.model.User;
import com.hromenko.userserviceroman.repository.UserRepository;
import com.hromenko.userserviceroman.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainControllerRestApi {
    private final UserService userService;

    @GetMapping("/users")
    public List<User> showUsers(){
        return userService.getAll();
    }

    @GetMapping("/current")
    public String getCurrentUser(Principal principal){
        return "Now authorization is: "+principal.getName();
    }


}
