package br.com.alura.aula4.exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Curso {

	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return this.nome;
	}

	public int getAlunos() {
		return this.alunos;
	}

	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", Quantidade de Alunos: " + this.alunos + "]";
	}

}

public class Exercicio {
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 133));
		cursos.add(new Curso("C", 55));
		
		/*
		 * Ordenando pela quantidade de alunos
		 */
		cursos.sort(Comparator.comparing(Curso::getAlunos));		// Method Reference
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));	// Lambda
		cursos.forEach(System.out::println);						//forEach com println (MethodReference)
		cursos.forEach(c -> System.out.println(c));
		

		/*
		 * Filtrando os cursos com mais de 50 alunos e imprimindo a partir do stream.
		 */
		Stream<Curso> filter = cursos.stream().filter(c -> c.getAlunos() > 50); 	// Filtrando usando Lambda
		filter.forEach(c -> System.out.println(c.getNome()));						// Imprimindo usando Lambda
		

		/*
		 * Usando apenas uma linha de código, para:
		 * Filtrar os cursos com mais de 50 alunos e imprimir apenas o nome deles.
		 */
		cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));
		

		/*
		 * Para criarmos um Stream<String> usamos o método map() do stream() da List<Curso>
		 * "Mapeamos" o retorno do método getNome() da classe Curso, que criará um novo Stream de Strings.
		 */
		Stream<String> streamDeNomes = cursos.stream().map(Curso::getNome); 
		streamDeNomes.forEach(System.out::println);
		
		
		/*
		 * Criando um Stream<Integer> com a quantidade de alunos dos cursos e em seguida imprimindo.
		 * Utilizamos o methodReference
		 */
		Stream<Integer> streamDeAlunos = cursos.stream().map(Curso::getAlunos); // Criamos um stream de integer, com o retorno do getAlunos
		streamDeAlunos.forEach(System.out::println);							// Depois, usamos o forEach do stream para imprimir seus valores.

				/*
				 * 		ou
				 */

		cursos.stream().map(Curso::getAlunos).forEach(System.out::println);		// Podemos fazer tudo utilizando uma linha de código também.

	}
	
}