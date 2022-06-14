public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    double getBonificacao() {
        return this.salario * 0.05;
    }

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