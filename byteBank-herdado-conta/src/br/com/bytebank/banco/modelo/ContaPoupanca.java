package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

    /*
     * Construtor explícito, pois a conta filha não herda o(s) construtor(res) da
     * Super Classe
     */
    public ContaPoupanca(int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    public void deposita(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "ContaPoupanca: " + super.toString();
    }

}
