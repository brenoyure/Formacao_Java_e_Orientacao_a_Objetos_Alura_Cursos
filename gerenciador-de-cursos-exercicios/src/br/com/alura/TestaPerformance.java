package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {

		Collection<Integer> numeros = new HashSet<>();

		long inicioGeral = System.currentTimeMillis();

		for (int i = 1; i <= 1000000; i++) {
			numeros.add(i);
		}

		long fimAdiciona = System.currentTimeMillis();
		long tempoAdiciona = fimAdiciona - inicioGeral;

		long tempoInicioBusca = System.currentTimeMillis();
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fimBusca = System.currentTimeMillis();
		long tempoBusca = fimBusca - tempoInicioBusca;

		long fimGeral = System.currentTimeMillis();

		long tempoDeExecucaoTotal = fimGeral - inicioGeral;

		System.out.println("Tempo gasto no Total: " + tempoDeExecucaoTotal);
		System.out.println("Tempo Adiciona: " + tempoAdiciona);
		System.out.println("Tempo Busca: " + tempoBusca);

	}

}