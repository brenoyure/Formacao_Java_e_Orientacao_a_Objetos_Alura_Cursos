package br.com.alura;

import java.util.*;

public class TestaAlunos {

	public static void main(String[] args) {

		/**
		 * Conjundo set não garante a ordem ao inserir os elementos<Aluno>
		 */
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Sousa");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Sousa");  // <- SET não aceita duplicados, não adiciona nem aumenta o valor do size()
		alunos.add("Renan Saggio");
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos);
		
		
		
		List<String> alunosEmLista = new LinkedList<>(alunos);
		System.out.println(alunosEmLista);
		Collections.sort(alunosEmLista);
		
		System.out.println(alunosEmLista);
		
		System.out.println(alunosEmLista.get(4));
		
		
		
		
		
		
	}

}
