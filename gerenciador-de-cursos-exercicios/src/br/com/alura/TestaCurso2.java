package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso colecoesJava = new Curso("As coleções do Java", "Leonardo Silveira Neto");
		List<Aula> aulasImutaveis = colecoesJava.getAulas();

		colecoesJava.adiciona(new Aula("Logica de Programação", 60));
		colecoesJava.adiciona(new Aula("Paradigmas de Linguans de Programação", 45));
		colecoesJava.adiciona(new Aula("Orientação a Objetos", 50));

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println("Após a ordenação: ");
		System.out.println(aulas);

		System.out.println(colecoesJava.getTempoTotal());
		colecoesJava.adiciona(new Aula("Estruturas de Dados", 30));
		System.out.println(colecoesJava.getTempoTotal());

		System.out.println(colecoesJava);

	}

}
