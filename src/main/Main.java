package main;

import model.Banco;
import model.Cliente;
import model.conta.Conta;
import model.conta.ContaCorrente;
import model.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco XPTO");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Maria");
        cliente1.setSobrenome("Silva");

        Conta cc = new ContaCorrente(cliente1);
        ContaPoupanca poupanca = new ContaPoupanca(cliente1);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.imprimirDadosBancarios();
        cc.imprimirExtrato();

        poupanca.imprimirDadosBancarios();
        poupanca.imprimirExtrato();

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        poupanca.aplicarJuros();
        poupanca.imprimirExtrato();

        banco.imprimirRelatorioTransacoes(cliente1);
    }
}
