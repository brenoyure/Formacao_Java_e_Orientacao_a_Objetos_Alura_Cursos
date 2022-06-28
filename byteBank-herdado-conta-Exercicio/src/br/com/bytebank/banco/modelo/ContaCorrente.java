package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    public void deposita(double valorDeposito) {
        super.saldo += valorDeposito;
    }

    /*
     * valor do saque mais 20 centavos (0.2) de taxa
     */
    @Override
    public void saca(double valorSaque) {
        double valorAsacar = valorSaque + 0.2;
        try {
            super.saca(valorAsacar);
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

}