# API de Comércio Eletrônico com Spring Boot e Hibernate
Este projeto é uma API para gerenciar produtos, categorias, usuários e pedidos de uma empresa. Ele fornece endpoints RESTful para realizar operações CRUD (Create, Read, Update, Delete) em cada uma dessas entidades.
Um conjunto de serviços web desenvolvidos utilizando Spring Boot e JPA/Hibernate, tecnologias poderosas para a construção de aplicativos Java robustos e escaláveis. Aqui está uma visão geral do que foi realizado:

## Estruturação do Projeto
A aplicação foi estruturada seguindo o padrão de arquitetura MVC (Model-View-Controller), com camadas distintas para recursos (controllers), serviços (services) e acesso a dados (repositories).
### Modelo de Domínio:
Foi definido um modelo de domínio consistente, com entidades representando os principais conceitos da aplicação e seus relacionamentos.
![DM](https://github.com/rodrigovalim07/webservices-springboot3-jpa/assets/109677118/52c0e7a4-cdf3-4473-ad5a-b2f2918c300f)
### Banco de Dados H2:
Para testes e desenvolvimento, foi utilizado o banco de dados H2, uma opção leve e fácil de configurar que permite a criação rápida de um ambiente de banco de dados.
### Operações CRUD:
Foi implementado as operações básicas de CRUD (Create, Retrieve, Update, Delete) para manipulação dos dados do banco por meio dos serviços web. Isso permite que os usuários criem, recuperem, atualizem e excluam registros conforme necessário.
### Povoamento do Banco de Dados:
Dados de teste foram inseridos no banco de dados para simular um ambiente real e permitir a validação dos serviços.
### Tratamento de Exceções:
Um mecanismo de tratamento de exceções foi implementado para lidar com situações de erro de forma eficaz, garantindo respostas claras e significativas para os usuários da aplicação.

## Como Executar

1. Clone este repositório.
2. Abra o projeto em sua IDE.
3. Certifique-se de ter o Java e o Maven instalados em sua máquina.
4. Execute a classe principal `CursoApplication`.
5. O servidor estará em execução em [http://localhost:8080](http://localhost:8080).

## Endpoints Disponíveis

- **`/categories`**: CRUD para categorias de produtos.
- **`/products`**: CRUD para produtos.
- **`/users`**: CRUD para usuários.
- **`/orders`**: CRUD para pedidos.

## Tecnologias usadas
- Spring Boot
- Spring Data JPA
- Apache Tomcat
- Maven
- Banco de Dados H2
- Postman

## Agradecimentos
Agradeço ao professor Nelio Alves e à equipe da DevSuperior por disponibilizarem o curso na Udemy, no qual adquiri os conhecimentos necessários para desenvolver este projeto.
