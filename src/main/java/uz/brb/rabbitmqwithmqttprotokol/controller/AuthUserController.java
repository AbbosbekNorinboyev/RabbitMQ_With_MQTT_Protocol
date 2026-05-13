package uz.brb.rabbitmqwithmqttprotokol.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.brb.rabbitmqwithmqttprotokol.dto.request.LoginRequest;
import uz.brb.rabbitmqwithmqttprotokol.dto.request.RegisterRequest;
import uz.brb.rabbitmqwithmqttprotokol.dto.response.Response;
import uz.brb.rabbitmqwithmqttprotokol.service.AuthUserService;

@RestController
@RequestMapping("/api/auths")
@RequiredArgsConstructor
public class AuthUserController {
    private final AuthUserService authUserService;

    @PostMapping("/register")
    public Response<?> register(@RequestBody RegisterRequest registerRequest) {
        return authUserService.register(registerRequest);
    }

    @PostMapping("/login")
    public Response<?> login(@RequestBody LoginRequest loginRequest) {
        return authUserService.login(loginRequest);
    }

}