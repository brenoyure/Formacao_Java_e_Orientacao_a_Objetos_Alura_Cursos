package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteMatriculaDeAlunos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Conhecendo os SETs", "Inácio da Paz");
		javaColecoes.adiciona(new Aula("Introdução aos SETs", 20));
		javaColecoes.adiciona(new Aula("Diferenças entre SET e List", 18));
		javaColecoes.adiciona(new Aula("Criando um SET apenas de leitura", 22));

		Aluno a1 = new Aluno("Thiago Silva", 204703);
		Aluno a2 = new Aluno("Amanda Lacerda", 209996);
		Aluno a3 = new Aluno("Washington Brasileiro", 143086);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});

		for (Aluno aluno : javaColecoes.getAlunos()) {
			System.out.println(aluno);
		}

		Set<Aluno> novoNaoModificavel = javaColecoes.getAlunos();
//		novoNaoModificavel.add(new Aluno("Breno Yuri", 204704));
		
		HashSet<Aluno> hashSet = new HashSet<>(novoNaoModificavel); 
		
		hashSet.add(new Aluno("Breno Yuri", 204704));
	}

}
