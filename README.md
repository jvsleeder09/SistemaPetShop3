# 🐾 Manual de Instruções - Sistema Pet Shop (Java Swing)

## 📌 Introdução ao Projeto

Este é um sistema gráfico de gerenciamento para Pet Shop, desenvolvido em Java utilizando **Swing**. O sistema permite o cadastro de **clientes**, **pets** e o **agendamento de serviços** como:

- Banho e Tosa  
- Consulta Veterinária  
- Hospedagem  
- Adestramento

Agora com **validação de campos**, **interface visual estilizada** e **tela de listagem de agendamentos**.

---

## 🛠️ Tecnologias Utilizadas

- Java 11+  
- JOptionPane para confirmação na validação dos dados
- Swing (JFrame, JPanel, JButton, JTextField etc.)  
- IDE: Eclipse com WindowBuilder  
- Armazenamento em memória (`BancoDeDadosFake`)

---

## 🧩 Funcionalidades

- 📇 Cadastro de clientes com validação de e-mail e telefone  
- 🐶 Cadastro de pets associados aos donos  
- 📅 Agendamento de serviços com verificação de data válida  
- 📋 Listagem de agendamentos em formato de tabela (cliente, pet, serviço, data/hora)  
- ❌ Cancelamento de agendamentos  
- 🔍 Busca facilitada na tela de listagem  

---

## 🚀 Como Executar o Projeto

1. Clone o repositório no GitHub:
   ```bash
   git clone https://github.com/seu-usuario/SistemaPetShop3.git

2. Importe o projeto na sua IDE Java (Eclipse recomendado).

3. Navegue até a classe `MenuPrincipal.java` (localizada em `br.shop.main`).

4. Clique com o botão direito e selecione `Run As -> Java Application`.

---

## 💻 Interface do Sistema

A interface foi construída com **Java Swing**, utilizando o `WindowBuilder` para facilitar o layout visual. As telas seguem um padrão com:

* Cabeçalho intercalado entre cores de azul e preto
* Fundo escuro
* Campos validados com `JOptionPane` para alertas e confirmações 

---

## 📂 Estrutura de Pacotes

```text
br.shop.model
├── BanhoETosa.java
├── Cliente.java
├── ConsultaVeterinaria.java
├── Hospedagem.java
├── PacoteServicos.java
├── Pet.java
├── Servico.java
├── BancoDeDadosFake.java

br.shop.agendamento
└── Agendamento.java

br.shop.main
├── MenuPrincipal.java
├── TelaCliente.java
├── TelaPet.java
├── TelaServico.java
├── TelaCancelarServico.java
└── TelaListarAgendamentos.java
```

---

## ✍️ Exemplo de Uso

```text
> Cadastro de Cliente
Nome: Jon
Telefone: 6199990000
Email: jon@email.com

> Cadastro de Pet
Nome do Pet: Max
Espécie: Cachorro
Raça: SRD
Idade: 5
Peso: 4.0
Nome do Cliente: Jon

> Agendamento
Nome do Cliente: Jon
Nome do Pet: Max
Serviço: Banho e Tosa
Data: 20/06/2025
Hora: 10:30

> Tela de Listagem
🐾 Max - Banho e Tosa em 20/06/2025 10:30
```

---

## 📃 Observações

* O sistema **não usa banco de dados**: os dados são mantidos temporariamente em memória.
* Inclui validações para:

  * Campos obrigatórios vazios
  * E-mails e telefones inválidos
  * Datas inexistentes ou mal formatadas
* Para localizar informações, basta utilizar a **tela de listagem de agendamentos**, que exibe todos os dados cadastrados com clareza.

---

## 🎓 Fontes de Estudo

Materiais que auxiliaram no desenvolvimento do projeto:

* [Java Eclipse IDE: WindowBuilder + Gerenciadores de Layout](https://youtu.be/aiVe49TfciM?si=EDheTsdCOjDW3-eH)
* [Primeira Aplicação Java Window Builder](https://youtu.be/o7LMCjINOMo?si=Z2PhzkQpVZPZoARl)
* [Swing Acionamento de Botões](https://youtu.be/mFj4JCLFmqg?si=7hYsKespSljF8nnP)
* Slides de Interface Gráfica

---

🖤🕷️

