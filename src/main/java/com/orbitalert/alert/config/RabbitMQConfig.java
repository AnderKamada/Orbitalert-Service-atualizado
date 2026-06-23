package com.orbitalert.alert.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String FILA_ALERTAS = "fila.alertas";

    @Bean
    public Queue filaAlertas() {
        return new Queue(FILA_ALERTAS, true);
    }
}