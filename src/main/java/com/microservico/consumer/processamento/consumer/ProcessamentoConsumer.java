package com.microservico.consumer.processamento.consumer;

import com.microservico.consumer.processamento.dto.PedidoDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ProcessamentoConsumer {

    @RabbitListener(queues = "${broker.queue.processamento.name}")
    public void listenerProcessamentoQueue(PedidoDTO pedidoDTO){

        System.out.println(pedidoDTO.getDescricao());

    }

}
