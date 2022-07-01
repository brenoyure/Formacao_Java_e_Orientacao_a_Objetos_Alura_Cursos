package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

import br.com.bytebank.banco.modelo.Cliente;

import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste extends Object {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(3);
		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(123, 321);
		ContaPoupanca cp = new ContaPoupanca(123, 322);

		cc.deposita(100.0);
		cp.deposita(100.0);

		// Cliente cliente = new Cliente();

		System.out.println(cc.toString());
	}

	static void println() {

	}

	static void println(int a) {

	}

	static void println(boolean valor) {

	}

	static void println(Object obj) {

	}

}