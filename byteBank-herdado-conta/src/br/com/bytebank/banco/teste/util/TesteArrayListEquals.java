package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		// Generics
		ArrayList<Conta> lista = new ArrayList<>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 22);
		/**
		 * Método contains() está utilizando o método equals() da classe Conta para
		 * verificar a igualdade dos elementos, por isso agora ele está retornando true.
		 * Está verificando a igualdade caso o numeroConta e numeroAgencia sejam iguais.
		 */
		boolean existe = lista.contains(cc3);

		System.out.println("Já existe? " + existe);

		for (Conta conta : lista) {
			if (conta.equals(cc3)) {
				System.out.println("Já tenho essa conta.");
			}
		}

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}