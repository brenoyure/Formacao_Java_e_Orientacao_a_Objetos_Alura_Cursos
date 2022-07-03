package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class Teste {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(3);
		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		Cliente cliente = new Cliente();

		System.out.println(cc.toString());
		System.out.println(cp.toString());

		println(cc);
		println(cp);
		println(cliente);

	}

	private static void println() {

	}

	private static void println(int a) {

	}

	private static void println(boolean valor) {

	}

	private static void println(Conta conta) {

	}

	private static void println(Object referencia) {

	}

}