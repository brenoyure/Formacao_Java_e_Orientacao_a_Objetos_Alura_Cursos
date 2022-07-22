package br.com.bytebank.banco.modelo;

/**
 * pt-br {Classe Abstrata que representa o modelo Conta do byteBank.) en-us
 * {Abstract Class that represents byteBank's Account model.)
 * 
 * @author Breno Yuri
 * @version 0.3
 * @implNote added toString() at line 194.
 * @implNote added equals() at line 170.
 */

public abstract class Conta implements Comparable<Conta> {

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

		if (agencia < 1 || numeroConta < 1) {
			throw new IllegalArgumentException("Número da Agência Inválido.");
		}

		this.agencia = agencia;
		this.numeroConta = numeroConta;
		Conta.total++;
		// System.out.println("Estou criando uma conta. - construtor padrão do Java");
	}

	/**
	 * Método deposita será implementado nas subclasses: Poupança & Corrente
	 */
	public abstract void deposita(double valorDeposito);

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
			this.saca(valorTransferencia);
			if (this.saldo >= valorTransferencia) {
				destino.deposita(valorTransferencia);
			}
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo insuficiente, transferência não realizada." + "\n" + "Saldo: R$" + this.saldo
					+ ", Valor do Saque: R$" + valorTransferencia + ".");
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
	public int getNumeroConta() {
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
	public int getAgencia() {
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
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	/**
	 * Método para devolver o titular da conta, com métodos, por exemplo: ver Nome->
	 * titular.getNome
	 * 
	 * @return
	 */
	public Cliente getTitular() {
		return this.titular;
	}

	/**
	 * Método estático que retorna a quantidade de contas criadas no byteBank. obs:
	 * Esse valor aumenta a medida que um novo construtor é chamado.
	 * 
	 * @return
	 */
	static int getTotal() {
		return Conta.total;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Conta other = (Conta) obj;
		return agencia == other.agencia && numeroConta == other.numeroConta;
	}

	/**
	 * Comparação Natural utilizando o nome do titular para ordem.
	 * 
	 * @param conta
	 * @return
	 */
	// @Override
	// public int compareTo(Conta conta) {
	// return this.getTitular().getNome().compareTo(conta.getTitular().getNome());
	// }

	@Override
	public int compareTo(Conta outraConta) {
		return Double.compare(this.saldo, outraConta.saldo);
	}

	@Override
	public String toString() {
		return "Nº da Conta: " + this.getNumeroConta() + ", Agência: " + this.getAgencia() + ", Saldo: R$"
				+ this.getSaldo();
	}

}