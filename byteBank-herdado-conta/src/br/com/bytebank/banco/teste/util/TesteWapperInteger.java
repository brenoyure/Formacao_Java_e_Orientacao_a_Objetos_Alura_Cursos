package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWapperInteger {

	public static void main(String[] args) {

		// int[] idades = new int[5];
		// String[] nomes = new String[5];

		// int idade = 29;

		Integer numeroRef = new Integer(29);

		Integer idadeRef = Integer.valueOf("29");
		idadeRef++;
		System.out.println(idadeRef);

		List<Integer> numeros = new ArrayList<>();
		numeros.add(29);

	}

}
