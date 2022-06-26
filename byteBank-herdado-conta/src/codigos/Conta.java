package codigos;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numeroConta;
    private Cliente titular;
    private static int total;

    Conta(int agencia, int numeroConta) {
        Conta.total++;
        // System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        // System.out.println("Estou criando uma conta. - construtor padrão do Java");
    }

    abstract void deposita(double valorDeposito);

    void saca(double valorSaque) throws SaldoInsuficienteException {
        if (this.saldo < valorSaque) {
            throw new SaldoInsuficienteException("Saldo: R$" + this.saldo + ", Valor do Saque: R$" + valorSaque);
        }
        this.saldo -= valorSaque;
    }

    void transfere(Conta destino, double valorTransferencia) throws SaldoInsuficienteException {
        this.saca(valorTransferencia);
        destino.deposita(valorTransferencia);
    }

    double getSaldo() {
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

}