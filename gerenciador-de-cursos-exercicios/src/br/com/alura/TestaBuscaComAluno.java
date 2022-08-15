package br.com.alura;

public class TestaBuscaComAluno {

	public static void main(String[] args) {
	
		Curso javaColecoes = new Curso("Dominando as Coleções", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modeloando com Coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Maurício Anichel", 17645);
//		Aluno a4 = new Aluno("Paulo Silveira", 5617);
		
		
		
		
		
		
	}
	
}
