package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(22, 22);
		Conta cc2 = new ContaCorrente(22, 22);

		lista.add(cc1);
		
		boolean igual = cc1.equals(cc2);
		System.out.println(igual);
		
		boolean contem = lista.contains(cc2);
		System.out.println("Já existe? "+ contem);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		
		
		// System.out.println("Tamanho: " + lista.size());

		/**
		 * Conta ref = (Conta) lista.get(0); Ao usar o generics, não precisamos mais do
		 * cast no método lista.get();
		 */
//		Conta ref = lista.get(0);
//		System.out.println(ref.getNumeroConta());
//
//		lista.remove(0);
//		System.out.println("Tamanho: " + lista.size());
//
//		Conta cc3 = new ContaCorrente(33, 311);
//		lista.add(cc3);
//
//		Conta cc4 = new ContaCorrente(33, 322);
//		lista.add(cc4);
//
//		for (int i = 0; i < lista.size(); i++) {
//			Object oRef = lista.get(i);
//			System.out.println(oRef);
//		}
//
//		System.out.println("----------");
//
//		for (Object oRef : lista) {
//			System.out.println(oRef);
//		}

	}
}