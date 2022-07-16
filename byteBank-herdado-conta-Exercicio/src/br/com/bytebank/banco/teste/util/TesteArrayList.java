package br.com.bytebank.banco.teste.util;

// import java.util.Collection;
import java.util.List;
// import java.util.ArrayList;
import java.util.Vector;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayList {

	public static void main(String[] args) {

		List<Conta> lista = new Vector<>();

		// Cliente cliente = new Cliente();
		// lista.add(cliente);

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());

		/**
		 * Conta ref = (Conta) lista.get(0); Ao usar o generics, não precisamos mais do
		 * cast no método lista.get();
		 */
		Conta ref = lista.get(0);
		System.out.println(ref.getNumeroConta());

		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);

		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("----------");

		for (Object oRef : lista) {
			System.out.println(oRef);
		}

	}
}