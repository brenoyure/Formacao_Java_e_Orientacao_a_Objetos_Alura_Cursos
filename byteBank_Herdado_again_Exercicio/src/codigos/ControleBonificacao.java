package codigos;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f) {
        this.soma += f.getBonificacao();
    }

    public double getSoma() {
        return this.soma;
    }

}