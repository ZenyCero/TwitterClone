package org.zerocool.securityservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerocool.securityservice.dto.UserDTO;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("login")
    public Mono<String> login(@RequestBody UserDTO auth){
        return Mono.just("HOLA: "+auth.getUsername());
    }

    @GetMapping("registry")
    public Mono<String> registry(){
        return Mono.just("HOLA");
    }
}
