package br.com.alura.treeset;

public class Funcionario implements Comparable<Funcionario> {

	private String nome;
	private int idade;

	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Funcionario f) {
		return Integer.compare(this.idade, f.getIdade());
	}
	
	@Override
	public String toString() {
		return "[Funcionário: " + this.nome + ", idade: " + this.idade + "]";
	}
	
}