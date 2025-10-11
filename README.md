# 🚀 Primeiro Projeto do Curso de Backend do SENAI

---

### 💡 Descrição do Projeto

Neste projeto simulamos uma API para um Ecommerce, os endpoints do projeto pode ser visto abaixo em "Endpoints da API".

Nele desenvolvi o básico de uma **API**, usando as camadas de **Model**, **Repository**, **Service** e **Controller**.  
Implementei as funções de **criar, ler, atualizar e deletar (CRUD)**.  

## 🧰 Tecnologias Utilizadas
- **Java 24**
- **Spring Boot**
- **PostgreSQL**
- **Swagger (OpenAPI)**
- **IntelliJ IDEA**

---

## 🔗 Endpoints da API

A API foi estruturada seguindo o padrão REST e possui endpoints para gerenciamento de **pagamentos, clientes, pedidos, itens de produto** e **produtos**.

---

### 💳 Pagamentos

| Método | Endpoint | Descrição |
|:------:|:----------|:-----------|
| `GET` | `/api/pagamento/{id}` | Retorna um pagamento pelo ID |
| `PUT` | `/api/pagamento/{id}` | Atualiza os dados de um pagamento existente |
| `DELETE` | `/api/pagamento/{id}` | Remove um pagamento do sistema |
| `GET` | `/api/pagamento` | Lista todos os pagamentos |
| `POST` | `/api/pagamento` | Cadastra um novo pagamento |

---

### 👤 Clientes

| Método | Endpoint | Descrição |
|:------:|:----------|:-----------|
| `GET` | `/api/clientes/{id}` | Retorna um cliente pelo ID |
| `PUT` | `/api/clientes/{id}` | Atualiza os dados de um cliente existente |
| `DELETE` | `/api/clientes/{id}` | Remove um cliente do sistema |
| `GET` | `/api/clientes` | Lista todos os clientes |
| `POST` | `/api/clientes` | Cadastra um novo cliente |

---

### 📦 Pedidos

| Método | Endpoint | Descrição |
|:------:|:----------|:-----------|
| `GET` | `/api/pedidos/{id}` | Retorna um pedido pelo ID |
| `PUT` | `/api/pedidos/{id}` | Atualiza as informações de um pedido |
| `DELETE` | `/api/pedidos/{id}` | Remove um pedido do sistema |
| `GET` | `/api/pedidos` | Lista todos os pedidos |
| `POST` | `/api/pedidos` | Cadastra um novo pedido |

---

### 🧾 Itens do Produto

| Método | Endpoint | Descrição |
|:------:|:----------|:-----------|
| `GET` | `/api/ItemdoProduto/{id}` | Retorna um item do produto pelo ID |
| `PUT` | `/api/ItemdoProduto/{id}` | Atualiza as informações de um item do produto |
| `DELETE` | `/api/ItemdoProduto/{id}` | Remove um item do produto do sistema |
| `GET` | `/api/ItemdoProduto` | Lista todos os itens de produto |
| `POST` | `/api/ItemdoProduto` | Cadastra um novo item de produto |

---

### 🛍️ Produtos

| Método | Endpoint | Descrição |
|:------:|:----------|:-----------|
| `GET` | `/api/produtos/{id}` | Retorna um produto pelo ID |
| `PUT` | `/api/produtos/{id}` | Atualiza os dados de um produto existente |
| `DELETE` | `/api/produtos/{id}` | Remove um produto do sistema |
| `GET` | `/api/produtos` | Lista todos os produtos |
| `POST` | `/api/produtos` | Cadastra um novo produto |

---

## ⚙️ Como acessar?

Para o projeto funcionar corretamente, é importante ter as seguintes ferramentas instaladas:

- 🧠 **IntelliJ IDEA** (ou outra IDE compatível com Java)  
- 🐘 **PostgreSQL**

### 🔧 Passos para executar o projeto:

1. Faça o **git clone** do repositório para sua máquina local.  
2. Na primeira vez que for rodar o projeto, altere a propriedade:  
   ```properties
   spring.jpa.hibernate.ddl-auto=validate
   ```
   para:  
   ```properties
   spring.jpa.hibernate.ddl-auto=create
   ```
   Isso fará com que o **banco de dados seja criado automaticamente pelo JPA**.
3. Verifique se o **usuário e senha do banco de dados** no arquivo `application.properties` estão corretos, conforme configurado no seu PostgreSQL.
4. Rode a aplicação.  
5. Após iniciar, acesse o **Swagger** através do link:  
   👉 [http://localhost:8080/swagger-ui/index.html#/](http://localhost:8080/swagger-ui/index.html#/)
6. Todas as funcionalidades estarão disponíveis para testar o fluxo completo das operações.

---

### ⚠️ Possíveis problemas

- **Erro de conexão com o banco de dados:**  
  Verifique o usuário e a senha.  
  Certifique-se de que o PostgreSQL está instalado corretamente e que o **schema** está criado conforme indicado no arquivo `application.properties` (por exemplo: `ecommerce`).

---

## 📚 O que aprendi?

Durante o desenvolvimento desse projeto, aprendi e pratiquei vários conceitos importantes:

- 💾 Trabalhar com **banco de dados PostgreSQL**, criando tabelas no **pgAdmin 4** e integrando-as ao projeto via IntelliJ.  
- 🌱 Tive meu **primeiro contato com o framework Spring Boot**, entendendo suas funcionalidades e estrutura.  
- 🔁 Implementei o **CRUD completo** das classes.  
- 🧩 Aprendi sobre **camadas (Model, Repository, Service, Controller)** para uma melhor organização do código.  
- 🏷️ Entendi o funcionamento das **Annotations**, essenciais para o fluxo do Spring.  
- 📄 Aprendi a **documentar e testar** endpoints usando o **Swagger**.

---

🧠 *Esse foi meu primeiro passo na jornada como desenvolvedor backend — um projeto simples, mas fundamental para entender a base do desenvolvimento com Java e Spring Boot.* 💻

![Java + Spring Boot + PostgreSQL](https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg)


Este é um projeto educacional. Você pode usá-lo como quiser e fazer todas as modificações que desejar.
Obrigado.
Raphael.
