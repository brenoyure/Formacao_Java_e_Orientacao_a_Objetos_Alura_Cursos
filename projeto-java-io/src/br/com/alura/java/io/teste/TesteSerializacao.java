package br.com.alura.java.io.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException {

		
		Cliente cliente = new Cliente("Breno Yuri", "05432345680", "Dev");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		
		
//		String nome = "Breno Yuri";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();

	}

}