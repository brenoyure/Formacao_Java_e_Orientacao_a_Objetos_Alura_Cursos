package codigos;

public class Gerente extends Funcionario implements Autenticavel {

    private Autenticador autenticador;

    public Gerente() {
        this.autenticador = new Autenticador();
    }

    // Método (SobreEscrito) para devolver a Bonificação do Gerente
    double getBonificacao() {
        /*
         * Utilizamos o super.getBonificacao() para evitar
         * repetição de código, caso a bonificação padrão mude.
         */
        System.out.println("Método Bonificação do Gerente");
        return super.getSalario();

    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}