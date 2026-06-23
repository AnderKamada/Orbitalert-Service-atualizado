package com.orbitalert.alert.service;

import com.orbitalert.alert.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class AlertaConsumer {

    @RabbitListener(
            queues = RabbitMQConfig.FILA_ALERTAS
    )
    public void receberMensagem(String mensagem) {

        System.out.println(
                "ALERTA RECEBIDO: " + mensagem
        );

    }
}