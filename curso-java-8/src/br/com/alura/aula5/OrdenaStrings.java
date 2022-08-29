package br.com.alura.aula5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

@SuppressWarnings ("unused")

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("Alura Online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");

//		palavras.sort((s1, s2) -> s1.length() - s2.length());

		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));

		Function<String, Integer> smallFunction = String::length; // method reference
		Function<String, Integer> smallFunction1 = s -> s.length(); // lambda

//		Função lambda, que dada uma String, retorna um Integer
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao); //Aceita Função ou Method Reference
		palavras.sort(comparador);

		System.out.println(palavras);

		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);

		palavras.forEach(System.out::println);

	}

}
