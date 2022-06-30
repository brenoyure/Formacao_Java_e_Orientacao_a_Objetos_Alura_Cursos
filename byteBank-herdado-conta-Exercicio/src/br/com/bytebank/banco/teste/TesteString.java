package br.com.bytebank.banco.teste;

public class TesteString {

    public static void main(String[] args) {

        /**
         * Exercício para testar os métodos da Classe String do Java
         */
        
        String nome = "Breno ";

        int tamanho = nome.length();
        System.out.println("Tamanho da String nome: " + tamanho);

        char c = nome.charAt(2);
        System.out.println("Caractere na posição 2: " + c);

        int pos = nome.indexOf("re");
        System.out.println("Index de re: " + pos);

        String sub = nome.substring(2);
        System.out.println(sub);

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

    }

}