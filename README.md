
## 🐾 Manual de Instruções - Sistema Pet Shop (Java Swing)

## 📌 Introdução ao Projeto

Este é um sistema gráfico de gerenciamento para Pet Shop, desenvolvido em Java utilizando **Swing**.
O sistema permite o cadastro de **clientes**, **pets** e o **agendamento de serviços** como:

- Banho e Tosa  
- Consulta Veterinária  
- Hospedagem  
- Adestramento

Agora com **validação de campos**, **interface visual estilizada** e **tela de listagem de agendamentos**.

---

## 🛠️ Tecnologias Utilizadas

- Java 11+  
- Swing (JFrame, JPanel, JButton, JTextField etc.)
- JOptionPane para complementação simples no momento de confirmação de dados.
- IDE: Eclipse 2025 com WindowBuilder
- Armazenamento em memória, utilizando a class: (`BancoDeDadosFake`)

---

## 🧩 Funcionalidades

- 📇 Cadastro de clientes com validação de e-mail e telefone  
- 🐶 Cadastro de pets associados aos donos  
- 📅 Agendamento de serviços com verificação de data válida  
- 📋 Listagem de agendamentos em formato de tabela (cliente, pet, serviço, data/hora)  
- ❌ Cancelamento de agendamentos  
- 🔍 Identificação facilitada através da tela de listagem  

---

## 🚀 Como Executar o Projeto

1. Clone o repositório no GitHub:
   ```bash
   git clone https://github.com/seu-usuario/SistemaPetShop2.0.git

2. Importe o projeto na sua IDE Java (Eclipse foi utilizada para construção).

3. Navegue até a classe `MenuPrincipal.java` (localizada em `br.shop.main`).

4. Clique com o botão direito e selecione `Run As -> Java Application`.

---

## 💻 Interface do Sistema

A interface foi construída com **Java Swing**, utilizando o `WindowBuilder` para facilitar o layout visual. As telas seguem um padrão com:

* Cabeçalho com cores variadas entre cada janela, podendo ser azul ou preta.
* Fundo escuro
* Campos validados com `JOptionPane` para alertas

---


## 📂 Estrutura de Pacotes

```text
br.shop.model
├── BanhoETosa.java
├── Cliente.java
├── ConsultaVeterinaria.java
├── Hospedagem.java
├── PacoteServicos.java

Use Control + Shift + m to toggle the tab key moving focus. Alternatively, use esc then tab to move to the next interactive element on the page.
Nenhum arquivo escolhido
Attach files by dragging & dropping, selecting or pasting them.
Editing SistemaPetShop2/README.md at main · jvsleeder09/SistemaPetShop2
