package codigos;

public class ControleBonificacao {

    /*
     * Atributo "double soma" para armazenar
     * a soma da bonificação dos Funcionários
     */
    private double soma;

    public double getSoma() {
        /*
         * Método getSoma para devolver/que retorna o total de bonificação
         * dos tipos de funcionários
         */
        return this.soma;
    }

    public void registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma += boni;
    }

}