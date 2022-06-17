package codigos;

public class SistemaInterno {

    private int senha = 2222;

    protected void autentica(Autenticavel fa) {
        boolean autenticou = fa.autentica(this.senha);
        if (autenticou) {
            System.out.println("Pode Entrar no Sistema.");
        } else {
            System.out.println("Falha na autenticação.");
        }
    }

}
