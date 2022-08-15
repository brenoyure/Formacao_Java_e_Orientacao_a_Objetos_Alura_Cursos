package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as Coleções", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modeloando com Coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Maurício Anichel", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");

		Set<Aluno> alunos = javaColecoes.getAlunos();
		
		/**
		 * Usando o Iterator para iterar pelos elementos da coleção
		 */
		Iterator<Aluno> iterador = alunos.iterator();	
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
//		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
//		System.out.println(javaColecoes.estaMatriculado(a1));
//		
//		
//		Aluno turini = new Aluno("Rodrigo Turini", 34672);
//		System.out.println("E esse turini, está matriculado?");
//		System.out.println(javaColecoes.estaMatriculado(turini));
//		
//		System.out.println("o a1 é equals o turini");
//		System.out.println(a1.equals(turini));
//		
//		System.out.println(a1.hashCode() + " <- hash code do a1");
//		System.out.println(turini.hashCode() + " <- hash code do turini");
//		
//		System.out.println("O hashcode do a1 é igual ao do turini?");
//		System.out.println(a1.hashCode() == turini.hashCode());
//		
		
		
		
		
		
	}

}
