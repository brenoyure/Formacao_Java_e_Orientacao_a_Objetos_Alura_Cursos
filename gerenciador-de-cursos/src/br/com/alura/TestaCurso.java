package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {

		Curso colecoesJava = new Curso("Dominando as Coleções", "Paulo Silveira");

		colecoesJava.adiciona(new Aula("Trabalhando com ArrayList", 21));
		colecoesJava.adiciona(new Aula("Criando uma Aula", 20));
		colecoesJava.adiciona(new Aula("Modeloando com Coleções", 24));

		System.out.println(colecoesJava.getAulas());

	}

}
