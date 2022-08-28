package br.com.alura.aula2.exercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Reescreva o forEach, abaixo, que fizemos no capítulo anterior utilizando a
 * nova sintaxe do lambda.
 * 
 * 
 * palavras.forEach(new Consumer<String>(){ public void accept(String palavra) {
 * System.out.println(palavra); } });
 * 
 * @author Breno Yuri
 *
 */

public class Exercicio1 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("Alura Online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");

		palavras.forEach(p -> System.out.println(p)); // ForEach com lambda

	}

}
