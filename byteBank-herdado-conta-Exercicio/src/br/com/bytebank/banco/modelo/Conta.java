package br.com.bytebank.banco.modelo;

/**
 * Classe abstrata que representa o modelo Conta do byteBank.
 * 
 * @author Breno Yuri
 * @version 0.1
 *          revisado por Thiago Vasconcelos
 */

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numeroConta;
	private Cliente titular;
	private static int total;

	/**
	 * Construtor (protected) da classe Conta, recebe como parâmetros número da
	 * agência e número da conta.
	 * 
	 * Caso nConta ou nAgência seja menor que 1, joga exceção ArgumentIllegal.
	 * 
	 * @param agencia
	 * @param numeroConta
	 * @exception IllegalArgumentException
	 */
	protected Conta(int agencia, int numeroConta) {

		// System.out.println("O total de contas é " + Conta.total);

		if (agencia < 1) {
			throw new IllegalArgumentException("Número da Agência Inválido.");
		}

		if (numeroConta < 1) {
			throw new IllegalArgumentException("Número da Conta Inválido.");
		}

		this.agencia = agencia;
		this.numeroConta = numeroConta;
		Conta.total++;
		// System.out.println("Estou criando uma conta. - construtor padrão do Java");
	}

	/**
	 * Método deposita será implementado nas subclasses: Poupança & Corrente
	 */
	protected abstract void deposita(double valorDeposito);

	/**
	 * Método Saca "lançará" uma exceção de Saldo Insuficiente, caso usuário passe,
	 * como parâmetro, um valor de saque maior que o saldo atual.
	 * 
	 * @param valorSaque
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valorSaque) throws SaldoInsuficienteException {
		if (this.saldo < valorSaque) {
			throw new SaldoInsuficienteException("Saldo Insuficiente." + "\n" + "Saldo atual: R$" + this.saldo
					+ ", Valor do Saque: R$" + valorSaque + ".");
		} else {
			this.saldo -= valorSaque;
		}

	}

	/**
	 * Método de Transferência: recebe como parâmetros a contaDestino(Objeto) e um
	 * double valorTransferência. Este método "chama" o saca, e em seguida realiza o
	 * depósito na conta destino.
	 * 
	 * @param destino
	 * @param valorTransferencia
	 * @throws SaldoInsuficienteException
	 */
	public void transfere(Conta destino, double valorTransferencia) {
		try {
			
			if (this.saldo >= valorTransferencia) {
				this.saca(valorTransferencia);
				destino.deposita(valorTransferencia);
			}
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo insuficiente, transferência não realizada." + "\n" +
					"Saldo: R$" + this.saldo + ", Valor do Saque: R$" + valorTransferencia + ".");
		}
	}

	/**
	 * Método getSaldo para devolver o saldo de uma conta.
	 * 
	 * @return
	 */
	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * Método para retornar o número de uma conta.
	 * 
	 * @return
	 */
	int getNumeroConta() {
		return this.numeroConta;
	}

	/**
	 * Método setNumeroConta que define o número da conta.
	 * 
	 * @param novoNumeroConta
	 */
	void setNumeroConta(int novoNumeroConta) {
		if (novoNumeroConta < 1) {
			throw new IllegalArgumentException("Número de Conta inválido.");
		}
		this.numeroConta = novoNumeroConta;
	}

	/**
	 * Método para devolver o número da agência.
	 * 
	 * @return
	 */
	int getAgencia() {
		return this.agencia;
	}

	/**
	 * Método para definir/alterar número da agência
	 * 
	 * @param numeroAgencia
	 */
	void setAgencia(int numeroAgencia) {
		if (agencia < 1) {
			throw new IllegalArgumentException("Número de Agência Inválido.");
		}

		this.agencia = numeroAgencia;
	}

	/**
	 * Método para devolver definir/alterar o titular (tipo Cliente) da conta.
	 * 
	 * @param titular
	 */
	void setTitular(Cliente titular) {
		this.titular = titular;
	}

	/**
	 * Método para devolver o titular da conta, com métodos, por exemplo: ver Nome->
	 * titular.getNome
	 * 
	 * @return
	 */
	Cliente getTitular() {
		return this.titular;
	}

	/**
	 * Método estático que retorna a quantidade de contas criadas no byteBank. obs:
	 * Esse valor aumenta a medida que um construtor novo é chamado
	 * 
	 * @return
	 */
	static int getTotal() {
		return Conta.total;
	}

}