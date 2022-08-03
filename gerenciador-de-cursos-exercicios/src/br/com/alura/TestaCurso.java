package br.com.alura;

import java.util.List;

public class TestaCurso {
    
    public static void main(String[] args) {

        Curso colecoesJava = new Curso("As coleções do Java", "Leonardo Silveira Neto");
        List<Aula> aulas = colecoesJava.getAulas();
        
        colecoesJava.adiciona(new Aula("Logica de Programação", 40));
        colecoesJava.adiciona(new Aula("Paradigmas de Linguans de Programação", 45));
        colecoesJava.adiciona(new Aula("Programação Orientada a Objetos", 50));

        System.out.println(aulas);


    }

}
