package codigos;

public class ContaCorrente extends Conta {

    ContaCorrente(int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    boolean saca(double valorSaque) {
        return super.saca(valorSaque + 0.2);
    }

}
