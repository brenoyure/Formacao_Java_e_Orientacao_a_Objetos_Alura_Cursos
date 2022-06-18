package codigos;

public class CalculadoraImposto implements Tributavel {

    private double totalValorImposto;

    /*
     * Método registra para somar o valor do tributável ao total e dps devolver a
     * soma no método get
     */
    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalValorImposto += valor;
    }

    @Override
    public double getValorImposto() {
        return this.totalValorImposto;
    }

}
