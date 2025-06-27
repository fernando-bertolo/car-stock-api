# 🚗 CAR STOCK API

> ### API REST para gerenciamento de estoque automotivo

Uma API robusta desenvolvida em **Spring Boot** seguindo os princípios da **Arquitetura Hexagonal** para gerenciar estoque de veículos de forma eficiente e escalável.

## 🚀 Tecnologias

- **Java 21+**
- **Spring Boot 3.4.5**
- **Spring Data JPA**
- **Spring Web**
- **Spring Boot DevTools**
- **PostgreSQL** (via Docker)
- **Maven**
- **Docker & Docker Compose**

## 📋 Funcionalidades

### 👥 Gerenciamento de Usuários
- ✅ Criar usuário
- ✅ Listar todos os usuários
- ✅ Buscar usuário por ID
- ✅ Buscar usuário por email
- ✅ Deletar usuário
- ✅ Validação de email único

### 🚗 Gerenciamento de Veículos *(em desenvolvimento)*
- 🔄 Cadastrar veículos
- 🔄 Controlar estoque
- 🔄 Consultar disponibilidade

## 🏗️ Arquitetura

O projeto segue os princípios da **Clean Architecture** com a seguinte estrutura:

```
src/main/java/br/com/bertolo/carstockapi/
├── shared/                          # Recursos compartilhados
│   ├── exceptions/                  # Exceções globais
│   ├── handlers/                    # Tratamento global de exceções
│   └── dtos/                       # DTOs compartilhados
├── users/                          # Módulo de usuários
│   ├── adapters/
│   │   ├── inbound/                # Controllers e DTOs
│   │   └── outbound/               # Repositórios e implementações
│   └── core/
│       ├── domain/                 # Entidades de domínio
│       ├── usecases/              # Casos de uso
│       └── ports/                 # Interfaces/Contratos
└── cars/                          # Módulo de veículos (futuro)
```

## 🐳 Executando com Docker

### Pré-requisitos
- Docker
- Docker Compose

### Iniciar o projeto
```bash
docker compose up -d
```

A API estará disponível em: `http://localhost:8080`

## 📚 Endpoints da API

### 👥 Usuários

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `POST` | `/api/v1/users` | Criar usuário |
| `GET` | `/api/v1/users` | Listar todos os usuários |
| `GET` | `/api/v1/users/{id}` | Buscar usuário por ID |
| `GET` | `/api/v1/users?email={email}` | Buscar usuário por email |
| `DELETE` | `/api/v1/users/{id}` | Deletar usuário |

### 📝 Exemplos de Uso

#### Criar Usuário
```bash
curl -X POST http://localhost:8080/api/v1/users \
  -H "Content-Type: application/json" \
  -d '{
    "name": "João Silva",
    "email": "joao@email.com",
    "password": "123456"
  }'
```

#### Listar Usuários
```bash
curl http://localhost:8080/api/v1/users
```

#### Buscar por Email
```bash
curl "http://localhost:8080/api/v1/users?email=joao@email.com"
```


## 🛠️ Desenvolvimento Local

### Pré-requisitos
- Java 21+
- Maven 3.6+
- PostgreSQL (ou usar Docker)

### Configuração
1. Clone o repositório:
```bash
git clone https://github.com/fernando-bertolo/car-stock-api.git
cd car-stock-api
```

2. Configure o banco de dados no `application.properties`

3. Execute a aplicação:
```bash
mvn spring-boot:run
```

## 🔧 Tratamento de Erros

A API possui tratamento global de exceções com respostas padronizadas:

```json
{
  "status": 404,
  "message": "Usuário não encontrado",
  "timestamp": "2025-01-26T23:18:04"
}
```

### Códigos de Status
- `200` - Sucesso
- `201` - Criado com sucesso
- `400` - Dados inválidos
- `404` - Recurso não encontrado
- `409` - Conflito (ex: email duplicado)
- `500` - Erro interno do servidor

## 📖 Documentação Adicional

Para mais informações, consulte:

- [Spring Boot Documentation](https://docs.spring.io/spring-boot/3.4.5/reference/)
- [Spring Data JPA Guide](https://spring.io/guides/gs/accessing-data-jpa/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)



## 👨‍💻 Autor

**Fernando Bertolo**
- GitHub: [@fernando-bertolo](https://github.com/fernando-bertolo)
