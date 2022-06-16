package codigos;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    // getBonificação

    public double getBonificacao() {
        return this.salario * 0.1;
    }

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