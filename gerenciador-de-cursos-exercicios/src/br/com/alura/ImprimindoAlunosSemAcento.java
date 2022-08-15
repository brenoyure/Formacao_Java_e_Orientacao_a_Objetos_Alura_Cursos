package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcento {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");
		alunos.add("Pedro");
		alunos.add("Alberto");
		alunos.add("Nico");
		
		System.out.println(alunos.size());
		
		boolean adicionou = alunos.add("Pedro");
		System.out.println(adicionou);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
//		System.out.println(alunos);
		
		
		
		
	}
	
}
