package uz.brb.rabbitmqwithmqttprotokol.subscriber;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import uz.brb.rabbitmqwithmqttprotokol.config.RabbitMQConfig;
import uz.brb.rabbitmqwithmqttprotokol.dto.MessageDTO;

@Service
public class RabbitSubscriber {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consume(MessageDTO dto) {

        System.out.println("RabbitMQ received: " + dto);
    }
}