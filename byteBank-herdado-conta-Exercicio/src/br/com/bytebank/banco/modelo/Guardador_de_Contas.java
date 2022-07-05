package br.com.bytebank.banco.modelo;

public class Guardador_de_Contas {

    private Conta[] referencias;
    private int posicao;
    private int posicoesLivres;

    public Guardador_de_Contas() {
        this.referencias = new Conta[10];
        this.posicao = 0;
        this.posicoesLivres = referencias.length;
    }

    public void adiciona(Conta ref) {
        this.referencias[this.posicao] = ref;
        this.posicao++;
        this.posicoesLivres--;
    }

    @Override
    public String toString() {
        return "Guardador de Contas => Posições: " + this.referencias.length + ", Livres: " + this.posicoesLivres
                + ", Ocupadas: " + this.posicao;
    }

}