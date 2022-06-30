package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {

    }

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }

}