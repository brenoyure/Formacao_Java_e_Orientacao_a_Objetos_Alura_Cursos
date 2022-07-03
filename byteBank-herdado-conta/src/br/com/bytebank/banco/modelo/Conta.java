package br.com.bytebank.banco.modelo;

/**
 * 
 * Classe abstrata que representa um modelo de Conta do byteBank
 * 
 * @author Breno
 * 
 *
 */

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numeroConta;
    private Cliente titular;
    private static int total;

    /**
     * 
     * Construtor para inicializar o objeto Conta.
     * A partir dos parâmentros agencia e número de conta
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
     * Método saca que recebe um double, que será subtraído do saldo,
     * caso o saldo seja igual ou maior que o valor do saque.
     * Saca, lançará uma exception do tipo Saldo Insuficiente caso o contrário.
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

    int getNumeroConta() {
        return this.numeroConta;
    }

    void setNumeroConta(int novoNumeroConta) {
        if (novoNumeroConta <= 0) {
            System.out.println("Náo é possível definir valor menor ou igual a zero");
            return;
        }
        this.numeroConta = novoNumeroConta;
    }

    int getAgencia() {
        return this.agencia;
    }

    void setAgencia(int numeroAgencia) {
        if (agencia <= 0) {
            System.out.println("Não pode valor menor ou igual a zero");
            return;
        }

        this.agencia = numeroAgencia;
    }

    void setTitular(Cliente titular) {
        this.titular = titular;
    }

    Cliente getTitular() {
        return this.titular;
    }

    static int getTotal() {
        return Conta.total;
    }

    @Override
    public String toString() {
        return "Número: " + this.getNumeroConta() + ", Agência: " + this.getAgencia();
    }

}