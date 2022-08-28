package br.com.alura.aula2.exercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * 
2)	Faça o mesmo agora com o método sort.
	Transforme esse Comparator em uma expressão lambda.
	
	palavras.sort(new Comparator<String>() {
    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) 
            return -1;
        if(s1.length() > s2.length()) 
            return 1;
        return 0;
    }
	});
	
 * 
 * @author Breno Yuri
 *
 */

public class Exercicio2 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("Alura Online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");

//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length())); //Ordenando pelo tamanho da String
		palavras.sort((s1, s2) -> s1.length() - s2.length());
		
		palavras.forEach(p -> System.out.println(p));

	}

}
