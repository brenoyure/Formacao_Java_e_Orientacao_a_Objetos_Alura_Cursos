package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Object[] referencias = new Object[5];

		System.out.println("Tamanho do Array: " + referencias.length);

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;

		// Criando a(o) referência(objeto) cc2 do tipo ContaPoupança
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);

		// posição 1 recebe cc2, que é do tipo ContaPoupança
		referencias[1] = cc2;

		Cliente cliente = new Cliente();
		referencias[2] = cliente;

		ContaPoupanca ref = (ContaPoupanca) referencias[1];

		System.out.println(((ContaPoupanca)referencias[1]).getNumeroConta());
		System.out.println(cc2.getNumeroConta());
		System.out.println(ref.getNumeroConta());

	}

}