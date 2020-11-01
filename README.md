# Octo Events
Recebe eventos do GitHub via WebHooks e armazena na base de dados.

## Principais tecnologias e frameworks utilizados

- Maven
- PostgresSQL
- Ngrok
- Java 8
- Spring Boot 
- Hibernate

### Passo a passo

#### Excutando uma chamada pelo NGROK

$ sudo ./ngrok http 4000


#### Criar um reposit�rio e cadastrar o webhook no github.

Nas Configura��es do Reposit�rio, cadastrar o endpoint /events como webhook conforme exemplo abaixo:
* Payload URL = BASE_URL/events , onde BASE_URL � a URI informada pelo NGROK
* Content Type = application/json
* Na op��o "Selecionar eventos" e marcar somente a op��o `issues`


#### Funcionalidades
Realizar as opera��es que dever�o disparar eventos no reposit�rio do Github ao qual foi cadastrado o webhook:
 - Criar nova issue
 - Consultar issue a partir do ID
    

## Endpoints 


`GET /issues/{issueId}/events`

`POST /events`

