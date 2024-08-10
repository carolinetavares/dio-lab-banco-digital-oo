# Banco Digital

Este projeto é uma simulação de operações bancárias básicas, implementada em Java. Ele faz parte do exercício prático do curso 
"Criando um Banco Digital com Java e Orientação a Objetos" oferecido pela plataforma DIO. O objetivo do projeto é reforçar o conhecimento em 
Programação Orientada a Objetos (POO) e permitir a criação de um banco digital com funcionalidades básicas.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **model**: Contém classes de modelo e entidades principais.
   - `Banco.java`
   - `Cliente.java`
   - `Transacao.java`
- **model.conta**: Contém classes relacionadas a contas bancárias.
   - `Conta.java`
   - `ContaCorrente.java`
   - `ContaPoupanca.java`
- **interface**: Contém interfaces.
   - `IConta.java`
- **main**: Contém a classe principal.
   - `Main.java`

## Classes e Funcionalidades

### Banco
Classe responsável por gerenciar as contas e gerar relatórios de transações.

- `getNome()`, `setNome(String nome)`: Getters e setters para o nome do banco.
- `getContas()`, `setContas(List<Conta> contas)`: Getters e setters para as contas do banco.
- `adicionarConta(Conta conta)`: Adiciona uma conta ao banco.
- `getTransacoesPorCliente(Cliente cliente)`: Retorna as transações de um cliente.
- `imprimirRelatorioTransacoes(Cliente cliente)`: Imprime o relatório de transações de um cliente.

### Cliente
Classe que representa um cliente do banco.

- `getNome()`, `setNome(String nome)`: Getters e setters para o nome do cliente.
- `getSobrenome()`, `setSobrenome(String sobrenome)`: Getters e setters para o sobrenome do cliente.
- `toString()`: Retorna o nome completo do cliente.

### Conta
Classe abstrata que representa uma conta bancária.

- `sacar(double valor)`: Realiza um saque na conta.
- `depositar(double valor)`: Realiza um depósito na conta.
- `transferir(double valor, Conta contaDestino)`: Transfere um valor para outra conta.
- `imprimirExtrato()`: Imprime o extrato da conta.
- `imprimirDadosBancarios()`: Imprime os dados bancários da conta.
- `getAgencia()`, `getNumero()`, `getSaldo()`: Getters para agência, número e saldo da conta.
- `getCliente()`: Retorna o cliente da conta.
- `getTransacoes()`: Retorna as transações da conta.

### ContaCorrente
Classe que representa uma conta corrente. Herda de `Conta`.

### ContaPoupanca
Classe que representa uma conta poupança. Herda de `Conta`.

- `aplicarJuros()`: Aplica juros à conta poupança.

### Transacao
Classe que representa uma transação bancária.

- `getData()`, `getTipo()`, `getValor()`: Getters para data, tipo e valor da transação.
- `toString()`: Retorna uma string com os detalhes da transação.

### IConta
Interface que define os métodos para operações básicas de uma conta bancária.

## Requisitos

- Java 8 ou superior
- IDE de sua preferência (IntelliJ, Eclipse, etc.)

## Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/dio-lab-banco-digital-oo.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd dio-lab-banco-digital-oo
   ```

3. Importe o projeto em sua IDE de preferência.

4. Compile e execute a classe Main para ver a simulação em ação.
