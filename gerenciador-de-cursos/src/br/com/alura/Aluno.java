package br.com.alura;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if (nome == null)
			throw new NullPointerException("Nome não pode ser nulo");
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return this.nome;
	}

	public int getNumeroMatricula() {
		return this.numeroMatricula;
	}

	/**
	 * Para comparar os objetos a partir de suas propriedades, no nosso caso usando
	 * nome e nº de matrícula, sobrescrevemos os métodos hashCode e equals. Para
	 * gerar o hashCode, podemos utilizar o método estático hash() da classe
	 * Objects.ó
	 */

	/**
	 * Verificamos se o objeto passado é nulo ou de outra instância (de outra
	 * classe), se sim, retorna false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.getNome());
	}

	/**
	 * Gera o hashCode baseado no nome && número de matrícula
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.nome, this.numeroMatricula);
	}
	
	@Override
	public int compareTo(Aluno outro) {
		return this.nome.compareTo(outro.getNome());
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}

}
