package codigos;

public class Gerente extends Funcionario {

    private int senha;

    void setSenha(int novaSenha) {
        this.senha = novaSenha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha)
            return true;
        else
            return false;
    }

    // Método (SobreEscrito) para devolver a Bonificação do Gerente
    double getBonificacao() {
        /*
         * Utilizamos o super.getBonificacao() para evitar
         * repetição de código, caso a bonificação padrão mude.
         */
        System.out.println("Método Bonificação do Gerente");
        return super.getBonificacao() + super.getSalario();

    }
}