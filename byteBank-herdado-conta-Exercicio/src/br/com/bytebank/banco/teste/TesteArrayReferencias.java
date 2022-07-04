package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Conta[] contas = new Conta[5];

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;

		ContaPoupanca cp1 = new ContaPoupanca(22, 22);
		contas[1] = cp1;

		System.out.println(cp1.getNumeroConta());

		ContaCorrente ref = (ContaCorrente) contas[0];
		System.out.println(cp1.getNumeroConta());
		System.out.println(ref.getNumeroConta());

	}

}