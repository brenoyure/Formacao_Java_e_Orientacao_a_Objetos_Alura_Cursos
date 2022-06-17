package codigos;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    // Método Abstrato para devolver a bonificação dos funcionários (objetos)
    public abstract double getBonificacao();

    // Getters & Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

}