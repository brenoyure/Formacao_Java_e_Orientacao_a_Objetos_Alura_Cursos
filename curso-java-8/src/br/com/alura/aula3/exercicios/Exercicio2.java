package br.com.alura.aula3.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("Alura Online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");

		palavras.sort(String.CASE_INSENSITIVE_ORDER); //Ordenando alfabeticamente
		palavras.forEach(System.out::println);

	}

}
