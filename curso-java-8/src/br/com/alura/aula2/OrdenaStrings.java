package br.com.alura.aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings ("unused")

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("Alura Online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");

		/**
		 * Que venham os lambdas
		 */
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(palavras);

		Consumer<String> impressor = s -> System.out.println(s);
		Consumer<String> impressor1 = System.out::println;
		
		palavras.forEach(impressor);

		palavras.forEach(p -> System.out.println(p));

	}

}
