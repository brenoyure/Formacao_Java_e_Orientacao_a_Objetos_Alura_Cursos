package br.com.alura.aula3.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("Alura Online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");

		/*
		 * Usar MethodReference para imprimir os valores, ao invés do Lambda
		 */
		palavras.forEach(System.out::println);

	}
}