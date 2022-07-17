package br.com.bytebank.banco.teste.util;

import java.util.*;
import br.com.bytebank.banco.modelo.*;

public class TesteComparadorNumeroConta {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
            System.out.println(conta);
        }

        lista.sort(new ComparatorNumeroConta());
        System.out.println("-----");

        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }
}

class ComparatorNumeroConta implements Comparator<Conta> {

    @Override
    public int compare(Conta conta1, Conta conta2) {

        return Integer.compare(conta1.getNumeroConta(), conta2.getNumeroConta());

    }

}