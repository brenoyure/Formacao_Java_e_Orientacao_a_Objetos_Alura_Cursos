package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		// ComparadorNumeroConta comparadorNumeroConta = new ComparadorNumeroConta();
		// ComparadorTitularConta comparadorTitularConta = new ComparadorTitularConta();

		for (Conta conta : lista) {
			System.out.println(conta + conta.getTitular().getNome());
		}

		System.out.println("======");
		// lista.sort(null);
		// Utilizando o método estático sort() da classe Collections
		Collections.rotate(lista, 2);

		for (Conta conta : lista) {
			System.out.println(conta + conta.getTitular().getNome());
		}

	}

}

class ComparadorTitularConta implements Comparator<Conta> {
	@Override
	public int compare(Conta conta1, Conta conta2) {
		return conta1.getTitular().getNome().compareTo(conta2.getTitular().getNome());
	}
}

class ComparadorNumeroConta implements Comparator<Conta> {
	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getNumeroConta(), c2.getNumeroConta());
		// Como os nº das contas são inteiros, ao subtraí-los, retorna os respectivos
		// valores de comparação.
		// return conta1.getNumeroConta() - conta2.getNumeroConta();
		// if (conta1.getNumeroConta() < conta2.getNumeroConta()) {
		// return -1;
		// } else if (conta1.getNumeroConta() == conta2.getNumeroConta()) {
		// return 0;
		// }
		// return 1;
	}
}