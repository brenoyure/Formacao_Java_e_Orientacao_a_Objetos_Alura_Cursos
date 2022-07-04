package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteObject {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);

		System.out.println(cc.toString());
		System.out.println(cp.toString());

	}

}