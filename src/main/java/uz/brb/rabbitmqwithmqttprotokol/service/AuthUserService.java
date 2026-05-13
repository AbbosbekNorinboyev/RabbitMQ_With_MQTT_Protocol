package uz.brb.rabbitmqwithmqttprotokol.service;

import uz.brb.rabbitmqwithmqttprotokol.dto.request.LoginRequest;
import uz.brb.rabbitmqwithmqttprotokol.dto.request.RegisterRequest;
import uz.brb.rabbitmqwithmqttprotokol.dto.response.Response;

public interface AuthUserService {
    Response<?> register(RegisterRequest registerRequest);

    Response<?> login(LoginRequest loginRequest);
}