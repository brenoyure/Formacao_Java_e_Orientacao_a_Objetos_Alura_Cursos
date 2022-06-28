package br.com.bytebank.banco.modelo;

public class SeguroDeVIda implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }

}
