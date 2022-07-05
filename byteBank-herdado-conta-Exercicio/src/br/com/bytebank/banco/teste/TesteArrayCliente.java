package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayCliente {

	public static void main(String[] args) {

		Cliente clienteNormal = new Cliente();
		clienteNormal.setNome("Flávio");
		
		Cliente clienteVIP = new Cliente();
		clienteVIP.setNome("Rômulo");
		
		Object[] refs = new Object[5];
		
		refs[0] = clienteNormal;
		refs[1] = clienteVIP;
		
		System.out.println(((Cliente)refs[1]).getNome());
		
		
	}

}