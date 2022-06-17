package codigos;

public class Administrador extends Funcionario implements Autenticavel {

    private int senha;

    @Override
    double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Usuário autenticado com sucesso.");
            return true;
        } else {
            System.out.println("Falha na autenticação.");
            return false;
        }

    }

}
