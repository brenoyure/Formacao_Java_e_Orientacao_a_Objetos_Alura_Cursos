package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.*;

public class Teste {

	public static void main(String[] args) {

        // Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
        // ArrayList lista1 = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        // Cliente cliente = new Cliente("Breno Yuri");
        // lista.add(cliente);
        Conta cc2 = new ContaCorrente(22, 22);
        Conta cc3 = new ContaCorrente(33, 311);
        Conta cc4 = new ContaCorrente(33, 322);

        lista.add(cc);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        System.out.println("Tamanho: " + lista.size());
        
        Conta ref = lista.get(0);
        
        System.out.println(lista.get(0).toString());

        System.out.println(ref.getNumeroConta());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("=======");

        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }

}
