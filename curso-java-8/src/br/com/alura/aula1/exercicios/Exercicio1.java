package br.com.alura.aula1.exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Neste exercício, 1)devemos criar uma lista<String> de palavras e imprimir
 * seus valores utilizando o método forEach da lista, passando como parâmetro um
 * "Consumidor"<String>
 * 
 * 2) Ordenar a lista de Strings utilizando o tamanho da palavra como critério
 * de comparação.
 * 
 * @author Breno Yuri
 *
 */

public class Exercicio1 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("Alura Online");
		palavras.add("Casa do Código");
		palavras.add("Caelum");

		Consumer<String> comedorDeStrings = new ImprimePalavras();
		palavras.forEach(comedorDeStrings);

		System.out.println("#### Ordenando Strings pelo tamanho VV ####");
		Comparator<String> ordenaPeloTamanho = new OrdenaPalavrasPeloTamanho();
		palavras.sort(ordenaPeloTamanho);
		palavras.forEach(comedorDeStrings);

	}

}

class OrdenaPalavrasPeloTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int tamanhoDaS1 = s1.length();
		int tamanhoDaS2 = s2.length();

		if (tamanhoDaS1 < tamanhoDaS2)
			return -1;
		else if (tamanhoDaS1 > tamanhoDaS2)
			return 1;
		else
			return 0;
	}

}

class ImprimePalavras implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}

}
