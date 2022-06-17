package codigos;

public class ContaPoupanca extends Conta {

    /*
     * Construtor explícito, pois a conta filha não herda o(s) construtor(res) da
     * Super Classe
     */
    public ContaPoupanca(int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }

}
