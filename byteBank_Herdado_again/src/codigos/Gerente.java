package codigos;

public class Gerente extends Funcionario {

    private int senha;

    public boolean autentica (int senha) {
        if (this.senha == senha) return true;
        else return false;
    }

    void setSenha(int novaSenha) {
        this.senha = novaSenha;
    }

    // Método para devolver a Bonificação dos Funcionários
//    double getBonificacao() {
//        return this.getSalario() * 0.1;
//    }
}