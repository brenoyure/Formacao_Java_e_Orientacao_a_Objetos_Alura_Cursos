package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * Nesse exercício vamos utilizar uma classe Aula que possui um título e o tempo
 * em minutos, populados por um construtor. Crie uma lista com os três objetos
 * do tipo Aula presentes dentro do método main da classe TestaListaDeAula e
 * imprima a lista da mesma forma que estávamos fazendo na aula anterior. Qual
 * será o resultado? O nome das 3 aulas? Não deixe de executar o código para
 * descobrir a resposta.
 */

public class TesteListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisando ArrayLists", 23);
		Aula a2 = new Aula("A Classe Collections", 21);
		Aula a3 = new Aula("Métodos da classe Collections", 19);

		List<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		System.out.println(aulas);

		/**
		 * Diferente de uma String ou de tipos primitivos mais simples, o
		 * Collections.sort não sabe ordenar uma lista de Aula. De qual forma ele faria
		 * isso? Pelo nome da aula? Pela duração? Não daria para saber. Para que ele
		 * seja capaz de fazer isso, você precisa implementar a interface Comparable
		 * definindo um critério de comparação para os objetos desse tipo. Faça com que
		 * a classe Aula implemente essa interface e execute a classe TestaListaDeAula
		 * para verificar se a ordenação funcionou.
		 */

		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println("Depois da Ordenação: ");
		System.out.println(aulas);

		/**
		 * E se quisermos ordenar essa lista de acordo com o tempo de uma aula?
		 * Poderíamos alterar o método compareTo, mas assim todas as ordenações de aulas
		 * seriam afetadas. Há uma forma bastante enxuta de se fazer isso utilizando os
		 * recursos do Java 8:
		 */
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		
		
	}

}
