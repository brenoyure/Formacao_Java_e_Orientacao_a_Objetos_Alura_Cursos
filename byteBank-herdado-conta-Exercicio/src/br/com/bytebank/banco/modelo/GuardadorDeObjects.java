package br.com.bytebank.banco.modelo;

public class GuardadorDeObjects {

    private Object[] referencias;
    private int posicoesLivres;
    private int posicao;

    public GuardadorDeObjects() {
        this.referencias = new Object[10];
        this.posicao = 0;
        this.posicoesLivres = referencias.length;
    }

    public void adiciona(Object obj) {
        this.referencias[this.posicao] = obj;
        this.posicao++;
        this.posicoesLivres--;
    }

    public Object getReferencias(int posicaoNoGuardador) {
        return referencias[posicaoNoGuardador];
    }

    @Override
    public String toString() {
        return "Guardador de Objetos: " + "Posições: " + referencias.length + ", Livres: " + this.posicoesLivres
                + ", Ocupadas: " + this.posicao;
    }

}