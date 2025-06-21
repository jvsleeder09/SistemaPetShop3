Skip to content
Navigation Menu
jvsleeder09
SistemaPetShop2

Type / to search
Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
Settings

Sorry, couldn’t delete that branch.
SistemaPetShop2
/
README.md
in
main

Edit

Preview
Indent mode

Spaces
Indent size

2
Line wrap mode

Soft wrap
Editing README.md file contents
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
# 🐾 Manual de Instruções - Sistema Pet Shop (Java Swing)

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
