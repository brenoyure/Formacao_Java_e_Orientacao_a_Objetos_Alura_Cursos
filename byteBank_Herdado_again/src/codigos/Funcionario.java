package codigos;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    // Construtor padrão
    public Funcionario() {

    }

    /*
     * Método Abstrato para devolver a Bonificação dos Funcionários
     * Abstract é necessário pois não há método de bonificação padrão.
     */

    abstract double getBonificacao();

    // Métodos Getters & Setters
    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return this.nome;
    }

    void setCPF(String cpf) {
        this.cpf = cpf;
    }

    String getCPF() {
        return this.cpf;
    }

    void setSalario(double salario) {
        this.salario = salario;
    }

    double getSalario() {
        return this.salario;
    }

}