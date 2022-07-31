package br.com.bytebank.banco.teste.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Cliente cliente = new Cliente("Breno Yuri", "43523412309", "Dev");
		ContaCorrente cc = new ContaCorrente(222, 444, cliente);
		cc.deposita(100.0);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);

		oos.close();
	}

}