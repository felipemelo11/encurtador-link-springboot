# 🌐 Encurtador de Links - Java Spring Boot

Este é um projeto de encurtador de URLs desenvolvido com **Java Spring Boot** e **MySQL**. Ele permite criar URLs curtas e redirecionar para o link original. 🚀

## 🛠️ Tecnologias Utilizadas:
- **Java Spring Boot 3.4.1** ⚡
- **MySQL** 🟢
- **Maven** 📦

---

## ⚙️ Configuração do Projeto

### Pré-requisitos:
1. **Java 17** ou superior
2. **MySQL** instalado
3. **Maven** configurado

### Configuração do Banco de Dados:
1. Crie um banco de dados chamado `encurtador`.
2. Atualize as credenciais no arquivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/encurtador?useTimezone=true&serverTimezone=UTC
   spring.datasource.username=SEU_USUARIO
   spring.datasource.password=SUA_SENHA
   ```

---

## 🚀 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/felipemelo11/encurtador-link-springboot.git
   cd encurtador-link-springboot
   ```

2. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

3. Acesse o projeto no navegador:  
   - **http://localhost:8080**

---

## 🖍️ Endpoints da API

### Encurtar URL
- **POST /encurtar**
- Exemplo de Request:
  ```json
  {
    "urlOriginal": "https://exemplo.com/long-url"
  }
  ```
- Exemplo de Response:
  ```json
  {
    "id": 1,
    "urlLong": "https://exemplo.com/long-url",
    "urlEncurtada": "http://localhost:8080/r/abc123",
    "urlCreationTimeStamp": "2025-01-09T15:00:00Z"
  }
  ```

### Redirecionar URL
- **GET /r/{urlEncurtada}**
- Exemplo:  
  - Acesse **http://localhost:8080/r/abc123** para redirecionar ao link original.

---

## 📌 Funcionalidades
- **Encurtar URLs** 🌟
- **Redirecionar links curtos** ↪️
- **Salvar links no banco de dados** 📺

---

## Autor
Felipe de Melo Brito

https://www.linkedin.com/in/felipemelo1106
---
