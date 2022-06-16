package codigos;

public class Gerente extends Funcionario {

    private int senha;

    double getBonificacao() {
        System.out.println("Chamando Método de Bonificação do Gerente");
        return super.getBonificacao() + super.getSalario();
    }

    void setSenha(int senha) {
        this.senha = senha;
    }

    boolean autentica(int senha) {
        if (this.senha == senha)
            return true;
        else
            return false;
    }

}