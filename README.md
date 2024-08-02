# Simulador de Operações Bancárias

Este projeto é uma simulação de operações bancárias básicas, implementada em Java. Ele permite a criação de contas correntes e poupança, realização de depósitos, saques, transferências e aplicação de juros em contas poupança. Além disso, o projeto gera relatórios de transações para os clientes.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **model**: Contém todas as classes do modelo, como `Banco`, `Cliente`, `Conta`, `ContaCorrente`, `ContaPoupanca`, `Transacao` e a interface `IConta`.
- **Main.java**: Contém o método principal (`main`) que demonstra a funcionalidade do simulador.

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

## Requisitos

- Java 8 ou superior
- IDE de sua preferência (IntelliJ, Eclipse, etc.)

## Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/simulador-banco.git

    Navegue até o diretório do projeto:

    bash

    cd simulador-banco

    Importe o projeto em sua IDE de preferência.

    Compile e execute a classe Main para ver a simulação em ação.