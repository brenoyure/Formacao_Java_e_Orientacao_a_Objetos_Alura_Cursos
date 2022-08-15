package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {

		/**
		 * EmptySet da Collections devolve uma coleção vazia imutável Por exemplo,
		 * imagina que você precisa representar um curso que foi cancelado pois não teve
		 * matriculas. Nesse caso faria todo sentido devolver um Collections.emptySet()
		 */
		Set<String> nomes = Collections.emptySet();
		System.out.println(nomes);

//		nomes.add("Breno");

	}

}
