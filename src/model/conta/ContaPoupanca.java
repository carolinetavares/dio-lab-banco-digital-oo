package model.conta;

import model.Cliente;

public class ContaPoupanca extends Conta {

    private static final double TAXA_JUROS = 0.01;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void aplicarJuros() {
        double juros = this.saldo * TAXA_JUROS;
        this.depositar(juros);
        System.out.printf("Juros aplicados de R$%.2f%n", juros);
    }
}
