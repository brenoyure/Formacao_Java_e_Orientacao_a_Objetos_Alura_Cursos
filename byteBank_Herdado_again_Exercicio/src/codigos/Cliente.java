package codigos;

public class Cliente implements Autenticavel {

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Cliente autenticado com sucesso.");
            return true;
        } else {
            System.out.println("Falha na autenticação do cliente.");
            return false;
        }
    }

}
