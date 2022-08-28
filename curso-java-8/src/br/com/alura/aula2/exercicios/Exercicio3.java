package br.com.alura.aula2.exercicios;

public class Exercicio3 {

	public static void main(String[] args) {
		
		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
	}
	
}
