package br.com.alura.aula3.exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Exercicio1 {
	
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("Alura Online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");

		Function<String, Integer> funcaoMethodReference = String::length;
		Function<String, Integer> functionLambda = s -> s.length();
		
		Comparator<String> comparadorMethodReference = Comparator.comparing(funcaoMethodReference);
		Comparator<String> comparadorLambda = Comparator.comparing(functionLambda);
		
		Consumer<String> consumerMethodReference = System.out::println;
		Consumer<String> consumerLambda = s -> System.out.println(s);
		
		palavras.sort((String s1, String s2) -> {return Integer.compare(s1.length(), s2.length());});
		palavras.sort((s1, s2) -> {return Integer.compare(s1.length(), s2.length());});
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.sort((s1, s2) -> s1.length() - s2.length());
		palavras.sort(Comparator.comparing(String::length));
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(comparadorMethodReference);
		palavras.sort(comparadorLambda);

		palavras.forEach(consumerLambda);
		palavras.forEach(consumerMethodReference);
		palavras.forEach(System.out::println);
		palavras.forEach(p -> System.out.println(p));
		
	}

}
