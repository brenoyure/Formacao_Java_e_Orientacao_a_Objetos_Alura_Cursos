package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursoCollections {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as Coleções", "Paulo Silveira");

		List<Aula> aulas = javaColecoes.getAulas();

		System.out.println(aulas);

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		aulas = new ArrayList<>(aulasImutaveis);

		/**
		 * Util quando precisamos passar um único elemento para uma API que só aceita
		 * uma Collections daquele elemento.
		 */
		List<Aula> singletonList = Collections.singletonList(aulas.get(0));
		System.out.println(singletonList);

		List<List<Aula>> nCopies = Collections.nCopies(5, aulas);

	}

}
