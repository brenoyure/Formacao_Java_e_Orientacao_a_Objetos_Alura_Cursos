package codigos;

public class Autenticador {

    private int senha;

    protected void setSenha(int senha) {
        this.senha = senha;
    }

    protected boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Sucesso na autenticação.");
            return true;
        } else {
            System.out.println("Falha na Autenticação.");
            return false;
        }
    }

}