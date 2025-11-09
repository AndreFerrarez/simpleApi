#  SimpleAPI – Spring Boot + Docker

Aplicação simples desenvolvida com **Spring Boot** e empacotada em **Docker** para fins acadêmicos.  
O objetivo do projeto é demonstrar o processo completo de criação, empacotamento e execução de uma aplicação Java dentro de um container.

---

## 🚀 Objetivo
Desenvolver uma aplicação Spring Boot com **5 endpoints REST**, gerar o arquivo `.jar` com o **Maven** e executar a aplicação em um **container Docker** personalizado.

---

## 🛠️ Tecnologias utilizadas
- **Java 17 (Eclipse Temurin JDK)**
- **Spring Boot 3.5.7**
- **Maven**
- **Docker Desktop (Windows 11)**
- **PowerShell**

| Endpoint   | Método | Descrição                    |
|------------|---------|------------------------------|
| `/hello`   | GET | Retorna uma saudação simples |
| `/author`  | GET | Exibe o nome do autor        |
| `/time`    | GET | Mostra data e hora atuais    |
| `/status`  | GET | Mostra o status da API       |
| `/version` | GET | Mostra a versao utilizada.   |

📍 **Exemplo de resposta:**

GET /author
→ "Developed by André Ferrarez"


## Como executar localmente

### Gerar o arquivo `.jar`

Construir a imagem Docker
docker build -t ferrarez/simpleapi:1.0 .

No diretório do projeto, execute:

```bash
mvn clean package

