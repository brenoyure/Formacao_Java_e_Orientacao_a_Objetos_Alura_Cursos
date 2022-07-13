package br.com.bytebank.banco.modelo;

public class Guardador_de_Contas {

    private Conta[] referencias;
    private int posicaoAtual;
    private int posicoesLivres;

    public Guardador_de_Contas(int tamanho) {
        this.referencias = new Conta[tamanho];
        this.posicaoAtual = 0;
        this.posicoesLivres = referencias.length;
    }

    public void adiciona(Conta ref_do_tipo_Conta) {
        this.referencias[this.posicaoAtual] = ref_do_tipo_Conta;
        this.posicaoAtual++;
        this.posicoesLivres--;
    }

    public Conta getReferencia(int posicao) {
        return this.referencias[posicao];
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoAtual;
    }

    @Override
    public String toString() {
        return "Guardador=> Posições: " + referencias.length + ", Ocupadas: " + this.posicaoAtual + ", Livres: "
                + this.posicoesLivres;
    }

}