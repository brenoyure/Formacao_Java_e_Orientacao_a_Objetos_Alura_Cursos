package br.com.bytebank.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContaEspecial(int agencia, int numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    public void deposita(double valorDeposito) {
        super.saldo = +valorDeposito;
    }

}