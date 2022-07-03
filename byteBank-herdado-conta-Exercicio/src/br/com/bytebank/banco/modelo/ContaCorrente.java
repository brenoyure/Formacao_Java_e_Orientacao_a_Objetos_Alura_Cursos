package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    /**
     * Class ContaCorrent inherited from Abstract Conta
     * toString() method added in line 42.
     * 
     * @param agencia
     * @param numeroConta
     */

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
            if (super.saldo >= valorAsacar) {
                super.saca(valorAsacar);
            }
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString() {
        return "ContaCorrente: " + super.toString();
    }

}