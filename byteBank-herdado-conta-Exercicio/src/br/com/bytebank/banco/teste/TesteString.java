package br.com.bytebank.banco.teste;

public class TesteString {

    public static void main(String[] args) {

        String nome = "Breno";
        String sub = nome.substring(0, 5);
        System.out.println(sub);

        System.out.println(" =============== Exercício isEmpty ==========");
        System.out.println(nome);
        if (nome.isEmpty()) {
            System.out.println("String está vazia");
        } else {
            System.out.println("String contém " + nome.length() + " caracteres.");
        }
        System.out.println("======================================" + "\n");

        System.out.println("========== Exercício String.trim =========");

        String comEspaco = "       A Steam é a melhor plataforma de jogos         .";
        System.out.println(comEspaco);
        String semEspaco = comEspaco.trim();
        System.out.println(semEspaco);

        System.out.println("\n" + "=======================");

        System.out.println("\n" + "============== Exercício Contanis ===========");

        String busca = "Pesquisa";
        if (busca.contains("es")) {
            System.out.println("Cadeira de caracteres encontrados na posição " + busca.indexOf("es"));
        } else {
            System.out.println("Not Found");
        }
        System.out.println("\n" + "=======================");

        System.out.println("\n" + "============== Exercício String.split() ===========");
        String splitTeste = "200600200601";

        System.out.println(splitTeste.split("6", 1));

        System.out.println("======================================" + "\n");

        /*
         * 
         * 
         * String upperNome = nome.toUpperCase();
         * System.out.println("Maiúsculo: " + upperNome);
         * 
         * String lowerNome = nome.toLowerCase();
         * System.out.println("Minúsculo: " + lowerNome);
         * 
         * int tamanho = nome.length();
         * System.out.println("Tamanho da String nome: " + tamanho);
         * 
         * char c = nome.charAt(2);
         * System.out.println("Caractere na posição 2: " + c);
         * 
         * int pos = nome.indexOf("re");
         * System.out.println("Index de re: " + pos);
         * 
         * String sub = nome.substring(2);
         * System.out.println(sub);
         * 
         * for (int i = 0; i < nome.length(); i++) {
         * System.out.println(nome.charAt(i));
         * }
         * 
         * for (int i = 0; i < nome.length(); i++) {
         * System.out.print(nome.charAt(i));
         * }
         */

    }

}