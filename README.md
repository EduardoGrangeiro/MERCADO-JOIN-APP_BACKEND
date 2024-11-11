# Backend Java - Projeto CRUD

Este projeto é um backend em Java utilizando Spring Boot para gerenciar os CRUDs de Produtos e Categorias.

## Pré-requisitos

- Java 17+
- Maven 3.8+
- PostgreSQL 14+
- IDE (IntelliJ, Eclipse, ou VS Code)

## Configuração

### 1. Adicionar Lombok ao Projeto

A dependência Lombok já está presente no projeto. 

Se você estiver utilizando Spring Tool Suite (STS), certifique-se de baixar e instalar o plugin Lombok diretamente do Eclipse Marketplace.

### 2. Habilitar CORS

Adicione `@CrossOrigin` nos controladores para permitir acesso do frontend.

Exemplo:

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/produtos")
public class ProdutoController { }

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/categorias")
public class CategoriaController { }

### 3. Configurar o Banco de Dados PostgreSQL

No arquivo `application.properties`, configure as credenciais:

spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=app_user
spring.datasource.password=senha123

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

Certifique-se de que o banco de dados PostgreSQL está em execução.

### 4. Executando o Projeto

1. Compile e execute com:

mvn spring-boot:run

2. O backend estará disponível em: http://localhost:8080

   Para mais informações: dev.eduardograngeiro@gmail.com
