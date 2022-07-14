package br.com.bytebank.banco.modelo;

/**
 * 
 * Classe que representa um cliente no byteBank.
 * 
 * @author Breno Yuri
 * @version 0.2
 * @implNote toString() method added at line 43.
 * @implNote adicionados construtores (vazio, nome, completo) a partir da linha
 *           19.
 */

public class Cliente {

	private String nome;
	private String cpf;
	private String profissao;

	public Cliente() {

	}

	public Cliente(String nome) {
		this.nome = nome;
	}

	public Cliente(String nome, String cpf, String profissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
	}

	public String getNome() {
		return this.nome;
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

	private String getProfissao() {
		return profissao;
	}

	protected void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome();
	}
}