package br.com.bytebank.banco.modelo;

public class Guardador_de_Contas {

    private Conta[] referencias;
    private int posicaoLivre;

    public Guardador_de_Contas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Conta ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeElementos() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }

}