package model.interfaces;

import model.conta.Conta;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirDadosBancarios();

    void imprimirExtrato();
}
