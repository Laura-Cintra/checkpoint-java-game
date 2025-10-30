# 🎮 Game Challenge - Java Spring Boot

Este projeto foi desenvolvido como parte do **desafio "Game Challenge"** da disciplina **Java Advanced (FIAP)**.

O desafio consistia em **corrigir erros** no código original da aplicação e fazer com que o sistema rodasse corretamente, exibindo as páginas de forma funcional.  
Além disso, havia um **desafio extra**, que envolvia adicionar **proteção de rotas com Spring Security**.

---

## 🧩 Descrição do Projeto

A aplicação possui duas páginas principais:

### 🖥️ Dashboard (`/`)
- Página inicial acessível a todos.
- Exibe informações da data e hora atuais, além de uma lista de itens.
- Contém um botão **“Executar ação”**, que envia um `POST` para `/do-something`.
- Esta rota altera o estado do servidor e, portanto, **é protegida por autenticação**.

### 🔐 Login (`/login`)
- Página customizada com **Thymeleaf**.
- Exibe mensagens dinâmicas para:
    - Login bem-sucedido
    - Erro de autenticação
    - Logout realizado com sucesso

### 🚪 Logout (`/logout`)
- Disponível apenas para usuários autenticados, uma chamada via POST realizada por um botão na tela de dashboard.
- Serve para encerrar a sessão de usuários autenticados.
- Após o logout, o usuário é redirecionado para `/login?logout`.

---

## 🔒 Segurança com Spring Security

Foi implementada autenticação simples com **Spring Security**, protegendo apenas as rotas que **alteram o estado do servidor**.

**Rotas livres:**
- `/`
- `/login`

**Rotas protegidas:**
- `/do-something` (necessita login)

A autenticação foi feita com um **usuário em memória** para fins de teste:

- **Usuário:** admin
- **Senha:** 123

---
## 👩‍💻 Integrantes
- Maria Eduarda (RM558832)
- Laura Cintra (RM558843)