package org.zerocool.securityservice.controller;

import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerocool.securityservice.domain.service.UserServiceImpl;
import org.zerocool.securityservice.dto.TokenDTO;
import org.zerocool.securityservice.dto.UserDTO;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserServiceImpl userService;

    public AuthController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("login")
    public Mono<TokenDTO> login(@RequestBody UserDTO user){
        return Mono.just(userService.login(user));
    }

    @GetMapping("registry")
    public Mono<TokenDTO> registry(@RequestBody UserDTO user){
        return Mono.just(userService.registry(user));
    }
}
