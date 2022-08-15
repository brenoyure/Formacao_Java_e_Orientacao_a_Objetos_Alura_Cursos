package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AlunosSincronizados {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Breno", 1234);
		Aluno a2 = new Aluno("Yuri", 5678);
		Aluno a3 = new Aluno("Freire", 91011);
		Aluno a4 = new Aluno("Brito", 121314);
		Aluno a5 = new Aluno("Zenaide", 151617);
		Set<Aluno> alunos = new HashSet<>();
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(new HashSet<>(alunos));
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunosSincronizados.add(a5);

		System.out.println(alunos);
		System.out.println(alunosSincronizados);
	}

}
