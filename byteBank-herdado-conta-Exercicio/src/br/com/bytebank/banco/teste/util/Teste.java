package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.*;

public class Teste {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();

		Conta conta1 = new ContaCorrente(22, 11);
		Conta conta2 = new ContaCorrente(22, 12);
		Conta conta3 = new ContaPoupanca(44, 21);
		Conta conta4 = new ContaPoupanca(44, 22);

		lista.add(conta1);
		lista.add(conta2);
		lista.add(conta3);
		lista.add(conta4);
		
		System.out.println("Tamanho da Lista: " + lista.size());
		lista.remove(0);
		lista.remove(conta4);
		System.out.println("Tamanho da Lista: " + lista.size());
		
		
		
		//Conta ref = (Conta)lista.get(0);
		//System.out.println(ref);
		//System.out.println(ref.getNumeroConta());

	}

}