package com.kpoma.gtams.controller;

import com.kpoma.gtams.model.AuthenticationResponse;
import com.kpoma.gtams.model.RolesUser;
import com.kpoma.gtams.model.Users;
import com.kpoma.gtams.service.RolesUserService;
import com.kpoma.gtams.service.UsersService;
import jakarta.persistence.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UsersController {


    private final UsersService usersService;

    @GetMapping
    public List<Users> findAllUsers(){
        return usersService.findAllUsers();
    }

    @GetMapping("/{userId}")
    public Optional<Users> findOneUsersById(@PathVariable long userId){
        return usersService.findOneUserUserById(userId);
    }

    @GetMapping("/{username}/list")
    public Users findAllUsersByUserName(@PathVariable String username){
        return usersService.findUsersByUsername(username);
    }

}
