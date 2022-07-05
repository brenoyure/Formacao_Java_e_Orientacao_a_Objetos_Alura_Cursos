package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicoesLivre;
    private int posicao;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicao = 0;
        this.posicoesLivre = referencias.length;
    }

    public void adiciona(Conta ref) {
        this.referencias[this.posicao] = ref;
        this.posicao++;
        this.posicoesLivre--;
    }

    @Override
    public String toString() {
        return "Guardador de Contas: " + "Posições: " + referencias.length + ", Livres: " + this.posicoesLivre
                + ", Ocupadas: " + this.posicao;
    }

}