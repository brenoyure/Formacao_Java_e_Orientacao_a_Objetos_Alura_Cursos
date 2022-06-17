package codigos;

public class ContaCorrente extends Conta {

    /*
     * Construtor explícito, pois a conta filha não herda o(s) construtor(res) da
     * Super Classe
     */
    public ContaCorrente(int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    boolean saca(double valorSaque) {
        double valorAsacar = valorSaque + 0.2;
        return super.saca(valorAsacar);
    }

}
