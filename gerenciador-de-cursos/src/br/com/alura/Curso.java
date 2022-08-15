package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	
	private Set<Aluno> alunos = new LinkedHashSet<>(); // <- Se for TreeSet, vai adicionar baseado na ordem natural do Comparable<T>
	
	/**
	 * Mapa utilizado para associar uma chave Integer(K), 
	 * no nosso caso o número de matrícula, à uma referência(a um value) do tipo Aluno(V).
	 * Essa estrutura será utilizada no caso de buscarmos um aluno pela matrícula(chave K).
	 */
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return this.nome;
	}

	public String getInstrutor() {
		return this.instrutor;
	}

	/**
	 * Método para devolver uma lista imutável de aulas.
	 * @return lista de aulas ReadOnly
	 */
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	/**
	 * Método para devolver uma lista imutável de alunos.
	 * @return devolve uma lista imutável de alunos.
	 */
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	/**
	 * Matricula(adiciona) o aluno no Set de alunos.
	 * Após a adição, esse aluno também é adicionado na HashMap, através do método put(),tendo como chave seu número de matrícula.
	 * @param aluno recebe uma referência do tipo Aluno
	 */
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	/**
	 * Utiliza o contains() do Set<T> para verificar se o aluno está matriculado ou não. 
	 * @param aluno recebe uma referência do tipo Aluno.
	 * @return true se o aluno estiver no Set<Aluno> de alunos. 
	 */
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numeroMatricula) {
		if(!matriculaParaAluno.containsKey(numeroMatricula)) 
			throw new NoSuchElementException();		
		return matriculaParaAluno.get(numeroMatricula);
	}

	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", Instrutor: " + this.instrutor + ", Tempo Total: " + this.getTempoTotal()
				+ " minutos. [Aulas: " + this.aulas + " ]";
	}

}
