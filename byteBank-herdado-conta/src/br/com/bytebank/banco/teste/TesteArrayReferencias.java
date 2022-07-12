package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Object[] referencias = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;

		ContaPoupanca cp1 = new ContaPoupanca(22, 22);
		referencias[1] = cp1;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		Cliente cliente2 = new Cliente();
		referencias[3] = cliente2;
		
		System.out.println(((ContaPoupanca)referencias[1]).getNumeroConta());

		System.out.println(cp1.getNumeroConta());

		ContaPoupanca ref = (ContaPoupanca)referencias[1];
		System.out.println(cp1.getNumeroConta());
		System.out.println(ref.getNumeroConta());

	}

}