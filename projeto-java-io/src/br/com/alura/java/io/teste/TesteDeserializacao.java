package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
//		String nome = (String) ois.readObject();
//		System.out.println(nome);
//
//		ois.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		System.out.println(cliente.getProfissao());
		
		ois.close();
	}

}