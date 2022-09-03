package br.com.alura.aula6.exercicio;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {

		DateTimeFormatter formatadorDataAtual = DateTimeFormatter.ofPattern("dd/MM/yyyy");	// Criando o Formatador
		LocalDate dataAtual = LocalDate.now();												// Pegando data atual do S.O
		String dataAtualFormatada = dataAtual.format(formatadorDataAtual);					// Formatando data atual
		System.out.println(dataAtualFormatada);												// Imprimindo a data atual

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");			// Criando o Formatador
		LocalDate data2099 = LocalDate.of(2099, Month.JANUARY, 25);							// Definindo a data de 2099
		String data2099Formatada = data2099.format(formatador);								// Formatando a data de 2099
		System.out.println(data2099Formatada);												// Imprimindo a data de 2099
		
		Period periodoEntreData = Period.between(dataAtual, data2099);						// Criando o período entre as datas
		System.out.println(periodoEntreData);												// Imprimindo o período (raw format)
		
		int dias = periodoEntreData.getDays();												// Pegando os dias do período 
		int meses = periodoEntreData.getMonths();											// Pegando os meses do período
		int anos = periodoEntreData.getYears();												// Pegando os anos do período
		
		// Imprimindo período entre as datas formatado.
		System.out.println("O periodo entre " + dataAtualFormatada + " e " + data2099Formatada + " é de " + anos + " anos, " + meses + " meses e " + dias + " dias.");

	}

}
