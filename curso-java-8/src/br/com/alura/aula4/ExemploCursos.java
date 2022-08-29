package br.com.alura.aula4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.map(Curso::getAlunos)
			.forEach(System.out::println);
		
		
		
		
		
		
		
		
	}
	
}
