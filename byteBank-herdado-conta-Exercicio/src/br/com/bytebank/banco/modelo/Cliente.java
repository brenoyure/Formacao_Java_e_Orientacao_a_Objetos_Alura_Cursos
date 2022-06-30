package br.com.bytebank.banco.modelo;

/**
 * Classe que representa um Cliente do byteBank.
 * 
 * @author Breno
 * @version 0.1
 */

public class Cliente {

	private String nome;
	private String cpf;
	private String profissao;

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	String getCpf() {
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