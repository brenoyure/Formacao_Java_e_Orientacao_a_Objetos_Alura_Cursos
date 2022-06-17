package codigos;

public class ContaPoupanca extends Conta {

    ContaPoupanca(int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    void deposita(double valorDeposito) {
        super.saldo += valorDeposito;
    }

}
