package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Conta[] contas = new Conta[5];

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaCorrente cc2 = new ContaCorrente(22, 22);

		contas[0] = cc1;
		contas[1] = cc2;
		Conta ref = (ContaCorrente) contas[0];

		System.out.println(contas[1].getNumeroConta());
		System.out.println(cc2.getNumeroConta());
		System.out.println(ref.getNumeroConta());

	}

}