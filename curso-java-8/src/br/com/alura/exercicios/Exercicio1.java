package br.com.alura.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Neste exercício, devemos criar uma lista<String> de palavras e imprimir seus
 * valores utilizando o método forEach da lista, passando como parâmetro um "Consumidor"<String>
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

	}

}

class ImprimePalavras implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}

}
