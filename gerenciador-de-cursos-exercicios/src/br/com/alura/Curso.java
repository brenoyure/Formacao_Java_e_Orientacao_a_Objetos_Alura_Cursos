package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	private String nome;
	private int tempoTotal;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
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

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		this.tempoTotal += aula.getTempo();
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Aluno buscaAlunoPelaMatricula(int numeroMatricula) {
		return this.matriculaParaAluno.get(numeroMatricula);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public int getTempoTotal() {
		return this.tempoTotal;
	}

	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", duração: " + this.tempoTotal + ", profº: " + this.instrutor + "aulas: "
				+ this.aulas + "]";
	}

}
