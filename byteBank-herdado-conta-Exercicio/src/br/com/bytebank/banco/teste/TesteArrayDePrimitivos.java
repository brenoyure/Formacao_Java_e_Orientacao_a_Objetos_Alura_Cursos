package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5];

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
            System.out.print(idades[i] + ", ");
        }

        /*
         * idades[0] = 29;
         * idades[1] = 39;
         * idades[2] = 49;
         * idades[3] = 59;
         * idades[4] = 69;
         * 
         * int referencia = idades[3];
         * System.out.println(referencia);
         * 
         * System.out.println("Vetor idade possui " + idades.length + " posições.");
         */

    }

}