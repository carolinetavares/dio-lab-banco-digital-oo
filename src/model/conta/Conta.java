package model.conta;

import model.Cliente;
import model.Transacao;
import model.interfaces.IConta;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<Transacao> transacoes;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.transacoes = new ArrayList<>();
    }

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Transacao> getTransacoes() {
		return transacoes;
	}

	@Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            transacoes.add(new Transacao(LocalDateTime.now(), "Saque", valor));
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        transacoes.add(new Transacao(LocalDateTime.now(), "Depósito", valor));
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            transacoes.add(new Transacao(LocalDateTime.now(), "Transferência", valor));
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
    }

    public void imprimirExtrato() {
        System.out.println("***** Extrato *****");
        System.out.printf("Saldo atual: R$%.2f%n", this.saldo);
        if (!transacoes.isEmpty()) {
            System.out.println("***** Transações *****");
            for (Transacao transacao : transacoes) {
                System.out.println(transacao);
            }
        } else {
            System.out.println("Transações não encontradas.");
        }
    }

    public void imprimirDadosBancarios() {
        System.out.println("***** Dados bancários *****");
        System.out.printf("Titular: %s %s%n", this.cliente.getNome(), this.cliente.getSobrenome());
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Número: %d%n", this.numero);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }
}
