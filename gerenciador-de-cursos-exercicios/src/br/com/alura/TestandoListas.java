package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {

		/**
		 * Essa classe deverá ter uma lista de Strings com 3 nomes de cursos que você
		 * gosta do Alura e em seguida imprimí-los.
		 */	
		String curso1 = "Java e Orientação a Objetos";
		String curso2 = "Introdução à Linguagem Python";
		String curso3 = "C# Entendendo a Linguagem";
		
		List<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);

		System.out.println(cursos); // <-- Imprimindo a lista, após o add()

		/**
		 * Qual método precisaríamos chamar no código a seguir para remover o segundo
		 * item da lista?
		 */
		cursos.remove(1); // <--Removendo curso (elemento) do segundo index(1)
		System.out.println(cursos); // --> Imprimindo a lista para verificar se foi removido

		
		/**
		 * E se quiséssemos saber apenas o nome do primeiro curso, qual método utilizar?
		 */
		String primeiroCurso = cursos.get(0); // --> Usando o get() para pegar o valor
		System.out.println("Primeiro curso é o: " + primeiroCurso);
		
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("Curso: " + cursos.get(i));
		}
		
		/**
		 * Ordenando a lista com o static sort()
		 */
		Collections.sort(cursos);
		System.out.println("Após a ordenação: ");
		for (String curso : cursos) {
			System.out.println("Curso: " + curso);
		}
		
			
		
		
		
		
		
	}

}