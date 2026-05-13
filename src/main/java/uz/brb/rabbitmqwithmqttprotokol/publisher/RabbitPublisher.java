package uz.brb.rabbitmqwithmqttprotokol.publisher;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import uz.brb.rabbitmqwithmqttprotokol.config.RabbitMQConfig;
import uz.brb.rabbitmqwithmqttprotokol.dto.MessageDTO;

@Service
@RequiredArgsConstructor
public class RabbitPublisher {
    private final RabbitTemplate rabbitTemplate;

    public void send(MessageDTO dto) {

        rabbitTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE,
                RabbitMQConfig.ROUTING_KEY,
                dto
        );

        System.out.println("Message sent: " + dto);
    }
}
