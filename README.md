
---

## **README para [`microservico-consumer`](https://github.com/Lucasvdalves/microservico-consumer)**

```markdown
# Microserviço Consumer

Este microserviço é responsável por enviar mensagens para a fila RabbitMQ. Ele atua como **producer**, publicando pedidos que serão processados por outros serviços.

## Funcionalidades
- Recebe requisições HTTP para criação de pedidos.
- Publica mensagens na fila RabbitMQ.
- Utiliza DTOs para transporte estruturado de dados.

## Tecnologias utilizadas
- Java 17+
- Spring Boot
- Spring AMQP (RabbitMQ)
- Maven
- Docker (opcional, para executar o RabbitMQ localmente)

## Requisitos
- JDK 17 ou superior
- Maven 3.9+
- RabbitMQ em execução (local ou CloudAMQP)
- Acesso ao repositório do projeto

## Como rodar localmente
1. Clone este repositório:
   ```bash
   git clone https://github.com/Lucasvdalves/microservico-consumer.git
   cd microservico-consumer
