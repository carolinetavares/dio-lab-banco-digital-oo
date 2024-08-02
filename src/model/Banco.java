package model;

import model.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Transacao> getTransacoesPorCliente(Cliente cliente) {
        List<Transacao> transacoesCliente = new ArrayList<>();
        for (Conta conta : contas) {
            if (conta.getCliente().equals(cliente)) {
                transacoesCliente.addAll(conta.getTransacoes());
            }
        }
        return transacoesCliente;
    }

    public void imprimirRelatorioTransacoes(Cliente cliente) {
        System.out.println("***** Relatório de Transações *****");
        List<Transacao> transacoes = getTransacoesPorCliente(cliente);
        if (!transacoes.isEmpty()) {
            for (Transacao transacao : transacoes) {
                System.out.println(transacao);
            }
        } else {
            System.out.println("Nenhuma transação encontrada para o cliente " + cliente.getNome() + " " + cliente.getSobrenome());
        }
    }
}