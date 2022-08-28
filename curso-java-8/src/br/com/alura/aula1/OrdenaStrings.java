package br.com.alura.aula1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("Alura Online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");

		Comparator<String> comparadorDeStrings = new ComparadorPorTamanho();
//		Collections.sort(palavras, comparadorDeStrings);
		palavras.sort(comparadorDeStrings);
		System.out.println(palavras);

//		forEach pré Java 8
//		for (String p : palavras) {
//			System.out.println(p);
//		}

		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);

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

		if (s1.length() < s2.length())
			return -1;
		else if (s1.length() == s2.length())
			return 0;
		else
			return 1;

	}

}
