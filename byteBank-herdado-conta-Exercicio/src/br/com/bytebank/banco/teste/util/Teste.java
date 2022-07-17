package br.com.bytebank.banco.teste.util;

import java.util.*;
import br.com.bytebank.banco.modelo.*;

public class Teste {

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

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

        // Collections.sort(lista, new ComparadorTitularDaConta());
        lista.sort(null);
        System.out.println("-----");

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

    }
}

class ComparadorTitularDaConta implements Comparator<Conta> {

    @Override
    public int compare(Conta conta1, Conta conta2) {
        String nomeCliente1 = conta1.getTitular().getNome();
        String nomeCliente2 = conta2.getTitular().getNome();
        return nomeCliente1.compareTo(nomeCliente2);
    }
}

class ComparadorNumeroConta implements Comparator<Conta> {

    @Override
    public int compare(Conta conta1, Conta conta2) {
        return Integer.compare(conta1.getNumeroConta(), conta2.getNumeroConta());
    }

}