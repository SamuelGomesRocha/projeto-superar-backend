# projeto-superar-backend

## Deploy

Fora realizado o deploy deste projeto no Heroku (já com o banco de dados relacionado), portanto, para testar a execução de seus endpoints, será necessário utilizar a URL: "https://microservice-cliente.herokuapp.com"

## Links

Outrossim, os endpoints utilizados, estão presentes no controller (https://github.com/SamuelGomesRocha/projeto-superar-backend/blob/main/src/main/java/br/com/maximatech/controller/ClienteController.java) e no frontend (https://github.com/SamuelGomesRocha/projeto-superar-fronend). No entanto, caso queira testar em alguma plataforma de testes de API, como Postman, os endpoints são os seguintes:

* Cadastro: https://microservice-cliente.herokuapp.com/cliente/cadastra
* Listagem: https://microservice-cliente.herokuapp.com/cliente/listar
* Busca unitária: https://microservice-cliente.herokuapp.com/cliente/4
* Deleção: https://microservice-cliente.herokuapp.com/cliente/cliente/del/4
* Busca de cliente por latitude e longitude: https://microservice-cliente.herokuapp.com/cliente/-49.337506589270966/-16.64685974918195
