# 🏢 Sistema de Gestão de Funcionários (POO em Java)

Este projeto foi desenvolvido como parte dos meus estudos de **Programação Orientada a Objetos** na **UFERSA**. O objetivo principal é demonstrar a aplicação prática de conceitos avançados de POO em um cenário real de folha de pagamento.

## 🚀 Tecnologias Utilizadas
* **Java 17** (ou superior)
* **VS Code** com Extension Pack for Java
* **Conceitos de POO:** Herança, Polimorfismo, Classes Abstratas e Interfaces.

## 🧠 O que este projeto demonstra?

### 1. Herança e Abstração
A classe `Employee` é definida como **abstract**, servindo como um modelo base que impede a criação de funcionários genéricos. Classes como `Manager` e `Salesman` herdam seus atributos e métodos.

### 2. Polimorfismo
Utilização de uma lista única de funcionários (`List<Employee>`) que percorre diferentes tipos de objetos e executa o método `calculateSalary()` específico de cada cargo em tempo de execução.

### 3. Interfaces
Implementação da interface `Authenticable` para gerenciar permissões de acesso (login/senha) de forma independente da hierarquia de classes, garantindo um código mais limpo e modular.

### 4. Encapsulamento
Proteção de dados sensíveis e validação de regras de negócio (como impedir idade negativa) através de modificadores de acesso e métodos assessores.

## 🛠️ Como rodar o projeto
1. Clone o repositório:
   ```bash
   git clone https://github.com/pauloartur-dev/employee-management-system.git