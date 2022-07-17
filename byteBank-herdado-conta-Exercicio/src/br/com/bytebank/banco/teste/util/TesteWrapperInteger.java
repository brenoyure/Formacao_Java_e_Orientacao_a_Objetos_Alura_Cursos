package br.com.bytebank.banco.teste.util;

import java.util.List;
import java.util.ArrayList;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        Integer numeroConta = Integer.parseInt("224");
        Integer literalNumberReference = 29;
        Integer objNumberReference = Integer.valueOf(30);
        int primitivoInt = 32;
        Integer objPrimitivoInt = Integer.valueOf(primitivoInt);

        List<Integer> listaNumerica = new ArrayList<>();
        listaNumerica.add(numeroConta);
        listaNumerica.add(literalNumberReference);
        listaNumerica.add(objNumberReference);
        listaNumerica.add(primitivoInt);
        listaNumerica.add(objPrimitivoInt);

        int i1 = listaNumerica.get(0);
        System.out.println("Indice da Referência: " + i1);

        Integer i2 = listaNumerica.get(1);
        System.out.println("Integer indice: " + i2);

        Integer valorRef = Integer.valueOf(33);
        int valorPri = valorRef.intValue();

        System.out.println(valorPri);

        // Usando o valueOf() e o parseInt() para devolver referência e primitivo a partir da String.
        Integer iParseado1 = Integer.valueOf("42"); // Parseando e devolvendo a referência.
        int iParseado2 = Integer.parseInt("44"); // Parseando e devolvendo primitivo int.
        System.out.println("Soma: " + (iParseado1 + iParseado2));

        for (Number n : listaNumerica) {
            System.out.println(n);
        }

        System.out.println("Enums do Integer");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

    }

}