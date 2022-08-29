package br.com.alura.aula5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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
		return "[Curso: " + this.nome + ", Alunos= " + this.alunos + "]";
	}

}

public class ExemploCursos {
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
//		cursos.forEach(c -> System.out.println(c.getNome()));
		
		/*
		 *  Usando o Stream do cursos para filtrar os cursos com 100 ou mais alunos. 
		 * 	E em seguida somando o total de alunos desses cursos que foram filtrados.
		 */
		 int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(c -> c.getAlunos()).sum();
		 System.out.println(sum);
		
		/*
		 * Vantagem de retornar um Optional no lugar de retornar um curso.
		 * Ganhamos muito com essa nova introdução. Assim não precisamos escrever aqueles diversos ifs, 
		 * garantindo que o objeto não é nulo, temos uma forma muito mais interessante de representar nossas intenções. 
		 */
		
		Optional<Curso> cursoOptional = cursos.stream().filter(c -> c.getAlunos() > 1000).findFirst();
		System.out.println(cursoOptional);
		double mediaAlunos = cursos.stream().mapToInt(c -> c.getAlunos()).average().getAsDouble();
		System.out.println((int) mediaAlunos);
		
		Stream<Curso> streamCurso = cursos.stream().filter(c -> c.getAlunos() > 50);
		List<Curso> listaFiltrada = streamCurso.collect(Collectors.toList());
		
		listaFiltrada.forEach(System.out::println);
		listaFiltrada.forEach(c -> System.out.println(c.getNome()));
		
		cursos = listaFiltrada;
		
		System.out.println(cursos);
		
	}
	
}
