package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * 
 * Classe que representa um cliente no byteBank.
 * 
 * @author Breno Yuri
 * @version 0.2
 * @implNote toString() method added at line 43. <-- updated 31/07/2022
 * @implNote adicionados construtores (vazio, nome, completo) a partir da linha
 *           19.
 * @implNote adicionada a interface Serializable
 */

public class Cliente implements Serializable {

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		if (this.nome != null && this.cpf == null && this.profissao == null) {
			return "Nome: " + this.getNome();
		} else
			return "Nome: " + this.getNome() + ", CPF: " + this.getCpf() + ", Profissão: " + this.getProfissao();
	}
}