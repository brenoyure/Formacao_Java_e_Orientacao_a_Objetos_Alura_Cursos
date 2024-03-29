package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * 
 * Classe abstrata que representa um modelo de Conta do byteBank
 * 
 * @author Breno Yuri
 * @version 0.2
 * @implNote método toString(),
 * @implNote método equals(), para comparar contas, adicionado à linha 117.
 *
 */

public abstract class Conta implements Comparable<Conta>, Serializable {

	protected double saldo;
	private int agencia;
	private int numeroConta;
	private Cliente titular; // <-- Se colocarmos transitent no Cliente, não vai ser gravado no .bin
	private static int total;

	/**
	 * 
	 * Construtor para inicializar o objeto Conta. A partir dos parâmentros agencia
	 * e número de conta
	 * 
	 * @param agencia
	 * @param numeroConta
	 * 
	 */

	public Conta(int agencia, int numeroConta) {
		Conta.total++;
		// System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		// System.out.println("Estou criando uma conta. - construtor padrão do Java");
	}

	/**
	 * Método abstrato deposita, que recebe um double valorDeposito como parâmetro.
	 * 
	 * @param valorDeposito
	 */

	public abstract void deposita(double valorDeposito);

	/**
	 * Método saca que recebe um double, que será subtraído do saldo, caso o saldo
	 * seja igual ou maior que o valor do saque. Saca, lançará uma exception do tipo
	 * Saldo Insuficiente caso o contrário.
	 * 
	 * @param valorSaque
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valorSaque) throws SaldoInsuficienteException {
		if (this.saldo < valorSaque) {
			throw new SaldoInsuficienteException("Saldo: R$" + this.saldo + ", Valor do Saque: R$" + valorSaque);
		}
		this.saldo -= valorSaque;
	}

	public void transfere(Conta destino, double valorTransferencia) throws SaldoInsuficienteException {
		this.saca(valorTransferencia);
		destino.deposita(valorTransferencia);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumeroConta() {
		return this.numeroConta;
	}

	void setNumeroConta(int novoNumeroConta) {
		if (novoNumeroConta <= 0) {
			System.err.println("Não é possível definir valor menor ou igual a zero");
			return;
		}
		this.numeroConta = novoNumeroConta;
	}

	public int getAgencia() {
		return this.agencia;
	}

	void setAgencia(int numeroAgencia) {
		if (agencia <= 0) {
			System.err.println("Não pode valor menor ou igual a zero");
			return;
		}

		this.agencia = numeroAgencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	protected static int getTotal() {
		return Conta.total;
	}

	/**
	 * Método equals() sobrescrito, da super classe Object, utilizado para comparar
	 * duas contas. Parâmetros de comparação: N° da Agência e Nº da Conta.
	 * 
	 * @param getAgencia()     retorna nº da agência.
	 * @param getNumeroConta() retorna nº da conta.
	 * 
	 */
	@Override
	public boolean equals(Object outraConta) {
		if (this.getAgencia() != ((Conta) outraConta).getAgencia()) {
			return false;
		}
		if (this.getNumeroConta() != ((Conta) outraConta).getNumeroConta()) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Conta outraConta) {
		return Double.compare(this.saldo, outraConta.saldo);
	}

	/**
	 * toString() que devolve números da Agência e da Conta.
	 * 
	 * @param getAgencia()     retorna nº da agência.
	 * @param getNumeroConta() retorna nº da conta.
	 */
	@Override
	public String toString() {
		return "Número: " + this.getNumeroConta() + ", Agência: " + this.getAgencia() + ", Saldo: R$" + this.getSaldo();
	}

}