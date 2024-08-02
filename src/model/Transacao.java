package model;

import java.time.LocalDateTime;

public class Transacao {
    private LocalDateTime data;
    private String tipo;
    private double valor;

    public Transacao(LocalDateTime data, String tipo, double valor) {
        this.data = data;
        this.tipo = tipo;
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Data: " + data + ", Tipo: " + tipo + ", Valor: " + valor;
    }
}

