package br.com.alura;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class Curso {

	private String nome;
	private int tempoTotal;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
		this.tempoTotal = 0;
	}

	public String getNome() {
		return this.nome;
	}

	public String getInstrutor() {
		return this.instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		this.tempoTotal += aula.getTempo();
	}

	public int getTempoTotal() {
		return this.tempoTotal;
	}

	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", duração: " + this.tempoTotal + ", profº: " + this.instrutor + "aulas: "
				+ this.aulas +"]";
	}

}
