## **README para [`microservico-consumer`](https://github.com/Lucasvdalves/microservico-consumer)**

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

2. Configure as credenciais do RabbitMQ no arquivo application.properties:
spring.rabbitmq.host=SEU_HOST
spring.rabbitmq.port=5671
spring.rabbitmq.username=SEU_USUARIO
spring.rabbitmq.password=SUA_SENHA
spring.rabbitmq.virtual-host=SEU_VHOST
spring.rabbitmq.ssl.enabled=true


3. Compile e rode o projeto:
mvn spring-boot:run


4. Envie uma requisição de exemplo:

curl -X POST http://localhost:8081/pedidos \
-H "Content-Type: application/json" \
-d '{"id": 1, "descricao": "Pedido de teste"}'

## Arquitetura geral
Este projeto faz parte de uma arquitetura de microserviços, onde:
microservico-consumer atua como produtor de mensagens (envia pedidos para a fila).
microservico-processamento atua como consumidor (lê e processa os pedidos).
Os serviços se comunicam de forma assíncrona via RabbitMQ.
