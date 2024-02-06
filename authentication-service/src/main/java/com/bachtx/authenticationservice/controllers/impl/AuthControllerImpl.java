package com.bachtx.authenticationservice.controllers.impl;

import com.bachtx.authenticationservice.controllers.AuthController;
import com.bachtx.authenticationservice.dto.request.RegisterRequest;
import com.bachtx.authenticationservice.dto.response.UserResponse;
import com.bachtx.authenticationservice.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@CrossOrigin
@RestController
@RequestMapping(value = "/")
@RequiredArgsConstructor
public class AuthControllerImpl implements AuthController {
    Logger logger = LoggerFactory.getLogger(AuthController.class);
    private final AuthService authService;

    @Override
    public Mono<String> helloWorld() {
        return Mono.just("Hello world");
    }

    @Override
    public Mono<UserResponse> register(RegisterRequest registerRequest) {
        return authService.register(registerRequest);
    }
}
