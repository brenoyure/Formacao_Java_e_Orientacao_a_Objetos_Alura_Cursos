package codigos;

public class ContaCorrente extends Conta implements Tributavel {

    ContaCorrente(int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    void deposita(double valorDeposito) {
        super.saldo += valorDeposito;
    }

    /*
     * valor do saque mais 20 centavos (0.2) de taxa
     */
    @Override
    boolean saca(double valorSaque) {
        return super.saca(valorSaque + 0.2);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

}
