package uz.brb.rabbitmqwithmqttprotokol.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.brb.rabbitmqwithmqttprotokol.dto.MessageDTO;
import uz.brb.rabbitmqwithmqttprotokol.publisher.RabbitPublisher;

@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class MessageController {

    private final RabbitPublisher producer;

    @PostMapping
    public String publish(
            @RequestBody MessageDTO dto
    ) {

        producer.send(dto);

        return "Message published!";
    }
}