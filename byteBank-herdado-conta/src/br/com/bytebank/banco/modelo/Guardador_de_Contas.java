package br.com.bytebank.banco.modelo;

public class Guardador_de_Contas {

    private Conta[] referencias;
    private int posicao;
    private int tamanho;
    private int posicoesLivres;

    /**
     * Construtor do Guardador de Contas
     * 
     * @param posicao        retorna a posição atual no vetor.
     * @param tamanho        retorna o tamanho do vetor.
     * @param posicoesLivres quantidade de Posições Livres, recebe o tamanho do
     *                       vetor, e subtrai um a cada elemento adicionado ao
     *                       vetor.
     */
    public Guardador_de_Contas(int tamanho) {
        try {
            this.referencias = new Conta[tamanho];
            this.posicao = 0;
            this.tamanho = referencias.length;
            this.posicoesLivres = referencias.length;
        } catch (NegativeArraySizeException negativeSizeException) {
            System.err.println("Não é permitido valor negativo para tamanho do Array.");
            return;
        }
    }

    public Guardador_de_Contas() {

    }

    /**
     * Método adiciona contas, recebe uma referência do tipo Conta
     * 
     * @param ref_tipo_Conta
     */
    public boolean adiciona(Conta ref_tipo_Conta) {
        try {
            this.referencias[this.posicao] = ref_tipo_Conta;
            this.posicao++;
            this.posicoesLivres--;
            return true;
        } catch (ArrayIndexOutOfBoundsException arrayIndexException) {
            System.err.println("Não há mais posições livres no Array. Tente aumentar o tamanho no constutor.");
            return false;
        } catch (NullPointerException nullException) {
            System.err.println("Usuário está tentando adicionar uma Conta num array null.");
            return false;
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }

    /**
     * Método que retorna quantos posições livres o array (ainda) possui.
     * 
     * @return
     */
    private int getPosicoesLivres() {
        return this.posicoesLivres;
    }

    private int getPosicao() {
        return this.posicao;
    }

    public Conta getReferencia(int posicao) {
        return this.referencias[posicao];
    }

    @Override
    public String toString() {
        return "Guardador de Contas => Posições: " + this.getTamanho() + ", Ocupadas: " + this.getPosicao()
                + ", Livres: " + this.getPosicoesLivres();
    }

}