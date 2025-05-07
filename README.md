# 🧸 Brinquedos - API REST com Spring Boot e Oracle

Este projeto consiste em uma aplicação Java usando **Spring Boot** conectada ao **banco de dados Oracle**, desenvolvida como parte do Checkpoint 2 da disciplina de Java e Arquitetura de Sistemas da FIAP.

A aplicação tem como objetivo **cadastrar, listar, atualizar e excluir brinquedos**, com persistência dos dados no banco de dados Oracle usando Spring Data JPA.

## 🔧 Tecnologias Utilizadas

- Java 17+
- Spring Boot 3.4.5
- Spring Web
- Spring Data JPA
- Banco de Dados Oracle
- HikariCP
- Postman (testes)
- IntelliJ IDEA

---

## 🚀 Como Executar o Projeto

### 1. Clonar o repositório
```bash
git clone https://github.com/luvieirasantos/brinquedosJava
```

### 2. Importar no IntelliJ como projeto Maven

### 3. Configurar o `application.properties`:
Exemplo:
```properties
spring.datasource.url=jdbc:oracle:thin:@//localhost:1521/XE
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.OracleDialect
```

### 4. Rodar o projeto

Execute a classe `BrinquedosApplication.java`.

---

## 🧪 Endpoints Testados no Postman

### POST `/brinquedos`  
Cadastrar um novo brinquedo:  
```json
{
  "nome": "Carrinho Hot Wheels",
  "tipo": "Carrinho",
  "classificacao": "3+",
  "tamanho": "Pequeno",
  "preco": 19.90
}
```

### GET `/brinquedos`  
Retorna todos os brinquedos cadastrados.

### PUT `/brinquedos/{id}`  
Atualiza um brinquedo existente.

### DELETE `/brinquedos/{id}`  
Remove um brinquedo do banco de dados.

---

## 📸 Capturas de Tela

### Screenshot do Spring Initializr com as dependências utilizadas
![image](https://github.com/user-attachments/assets/00b4b595-e307-4583-99ba-26d511f32445)


### Screenshot do Postman - POST `/brinquedos`
![image](https://github.com/user-attachments/assets/5783035d-7d1a-416a-b2a4-7a0547a9e942)


### Screenshot do Postman - GET `/brinquedos`
![image](https://github.com/user-attachments/assets/c1ca2589-b2d2-4397-ab36-fc40ebb42ace)


### Screenshot do Banco de Dados Oracle com `SELECT * FROM TB_BRINQUEDO`
![image](https://github.com/user-attachments/assets/85de8e97-b6cb-4cc4-840b-4b32a653feb7)


---

## 👤 Integrantes

- **Lu Vieira Santos**  
  RM: 558935
  
- **Melissa Pereira**  
  RM: 555656

- **Diego Furigo do Nascimento**  
  RM: 558935

---

## 📁 Link do Repositório

[https://github.com/luvieirasantos/brinquedosJava](https://github.com/luvieirasantos/brinquedosJava)
