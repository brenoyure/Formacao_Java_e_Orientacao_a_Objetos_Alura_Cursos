package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Classe para usar o .format() da String
 * 
 * @author Breno Yuri
 *
 */

public class TesteLeitura2 {

    public static void main(String[] args) throws IOException {

        /**
         * Scanner que lê linha por linha e devolve uma string, através do nextLine();
         * 
         * @param scanner
         */

        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

        while (scanner.hasNext()) {
            String linha = scanner.nextLine();
            // System.out.println(linha);

            /**
             * Recebe String como fonte, para analisar as linhas separadamente
             * 
             * @param linhaScanner
             */
            Scanner linhaScanner = new Scanner(linha);

            /**
             * Forçar o linhaScanner a utilizar o US, para separar os números decimais
             * useDelimiter() para separar os valores usando a vírgula
             */
            
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String valor1 = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numeroConta = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String valores = String.format(new Locale("pt", "br"), "%s: %04d-%04d %s %.2f",
                    valor1, agencia, numeroConta, titular, saldo);

            System.out.println(valores);

            linhaScanner.close();

            // String[] valores = linha.split(","); <-- split() devolve um array
            // System.out.println(valores[3]);

        }

        scanner.close();

    }

}