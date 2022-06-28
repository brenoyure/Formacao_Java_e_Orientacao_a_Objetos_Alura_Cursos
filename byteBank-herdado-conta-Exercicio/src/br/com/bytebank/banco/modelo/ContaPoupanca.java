package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    public void deposita(double valorDeposito) {
        super.saldo += valorDeposito;
    }

}
