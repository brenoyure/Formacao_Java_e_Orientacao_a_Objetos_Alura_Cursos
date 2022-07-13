package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.*;

public class Teste {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        Conta cc = new ContaCorrente(22, 11);
        Conta cc2 = new ContaCorrente(22, 22);
        Conta cc3 = new ContaCorrente(33, 311);
        Conta cc4 = new ContaCorrente(33, 322);

        lista.add(cc);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Tamanho: " + lista.size());
        Conta ref = (Conta)lista.get(0);

        System.out.println(ref.getNumeroConta());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());
        
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for(Object o : lista) {
            System.out.println(o);
        }







    }

}
