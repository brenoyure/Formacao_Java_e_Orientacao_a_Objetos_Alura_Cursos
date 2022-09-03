package br.com.alura.aula6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		});

//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		Function<String, Integer> funcao = String::length;
		Function<String, Integer> funcao2 = s -> s.length();
		
		
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		System.out.println(palavras);

		Consumer<String> impressorLambda = s -> System.out.println(s);
		Consumer<String> impressorMethodReference = System.out::println;
		palavras.forEach(impressorLambda);

		palavras.forEach(p -> System.out.println(p));

	}

}

class ImprimeNaLinha implements Consumer<String> {
	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return Integer.compare(s1.length(), s2.length());
	}

}

class Funcao implements Function<String, Integer> {
	
	@Override
	public Integer apply(String s) {
		return s.length();
	}
	
}
