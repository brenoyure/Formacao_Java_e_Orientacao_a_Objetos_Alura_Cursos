package codigos;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    // Construtor padrão
    public Funcionario() {

    }

    // Método para devolver a Bonificação dos Funcionários
    double getBonificacao() {
        /*
         * Bonificação padrão dos Funcionários: 5% do salário.
         */
        return this.salario * 0.05;
    }

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