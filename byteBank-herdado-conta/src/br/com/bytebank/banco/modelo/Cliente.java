package br.com.bytebank.banco.modelo;

/**
 * 
 * Classe que representa um cliente no byteBank.
 * 
 * @author Breno
 * @version 0.1
 *
 */


public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected String getCpf() {
        return cpf;
    }

    void setCpf(String cpf) {
        this.cpf = cpf;
    }

    String getProfissao() {
        return profissao;
    }

    void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}