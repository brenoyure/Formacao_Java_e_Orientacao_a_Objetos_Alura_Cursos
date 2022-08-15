package br.com.alura.treeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExercicioMap {

	public static void main(String[] args) {

		/**
		 * String é a chave, Integer é o valor
		 */
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);

		/**
		 * Utilizamos esse forEach que itera sobre um keySet, nos devolvendo os valores
		 * das chaves, no caso Strings
		 */
		for (String nome : nomesParaIdade.keySet()) {
			System.out.println(nome);
		}

		/**
		 * forEach que itera sobre uma coleção de valores do nosso Mapa e imprime seus
		 * valores. Coleção essa que é retornada através do método .values()
		 */
		for (int valor : nomesParaIdade.values()) {
			System.out.println(valor);
		}

		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		for (Entry<String, Integer> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}

	}
}