package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	/*
	 * Construtor explícito, pois a conta filha não herda o(s) construtor(res) da
	 * Super Classe
	 */
	public ContaCorrente(int agencia, int numeroConta) {
		super(agencia, numeroConta);
	}

	@Override
	public void deposita(double valorDeposito) {
		super.saldo += valorDeposito;
	}

	@Override
	public void saca(double valorSaque) throws SaldoInsuficienteException {
		double valorAsacar = valorSaque + 0.2;
		super.saca(valorAsacar);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}

	@Override
	public String toString() {
		return "ContaCorrente: " + super.toString();
	}

}