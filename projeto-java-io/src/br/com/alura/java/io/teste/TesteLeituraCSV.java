package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCSV {

	public static void main(String[] args) throws IOException {

		/**
		 * Scanner que lê linha por linha e devolve uma string, através do nextLine();
		 * @param scanner
		 */
		Scanner scanner = new Scanner(new File("contas.csv")); // <-- Ler linha por Linha

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			/**
			 * Recebe String como fonte, para analisar as linhas separadamente
			 * @param linhaScanner
			 */
			Scanner linhaScanner = new Scanner(linha);
	
			/**
			 * Forçar o linhaScanner a utilizar o US, 
			 * para separar os números decimais
			 */
			linhaScanner.useLocale(Locale.US);
			
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
			linhaScanner.close();
			
//			String[] valores = linha.split(","); <-- split() devolve um array
//			System.out.println(valores[3]);
			
		}

		scanner.close();

	}

}