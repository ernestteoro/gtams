package com.kpoma.gtams.controller.auth;

import com.kpoma.gtams.model.AuthenticationResponse;
import com.kpoma.gtams.model.Users;
import com.kpoma.gtams.service.UsersService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {


    private final UsersService usersService;

    @PostMapping("/signup")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody Users user){
        var userExist = this.usersService.findUsersByUsername(user.getUsername());
        if(userExist == null){
            return ResponseEntity.ok(this.usersService.register(user));
        }
        return ResponseEntity
                .badRequest()
                .body(AuthenticationResponse.builder()
                .accessToken("This user already exist")
                .username(user.getUsername())
                .refreshToken("")
                .build());
    }

    @PostMapping("/signin")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody Users user) {
        return ResponseEntity.ok(usersService.authenticate(user));
    }

    @PostMapping("/refresh-token")
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
        usersService.refreshToken(request, response);
    }
}
