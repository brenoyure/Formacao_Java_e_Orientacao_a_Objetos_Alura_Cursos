package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * ContaPoupança herdando a classe abstrata Conta.
     * 
     * Método toString() adicionado na linha 23.
     * 
     * @param agencia
     * @param numeroConta
     */

    public ContaPoupanca(int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    public void deposita(double valorDeposito) {
        super.saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "ContaPoupança: " + super.toString();
    }

}