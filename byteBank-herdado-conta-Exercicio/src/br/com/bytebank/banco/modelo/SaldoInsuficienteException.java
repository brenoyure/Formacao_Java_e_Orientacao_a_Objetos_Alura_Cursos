package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = -764550148277606506L;

	public SaldoInsuficienteException() {

    }

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }

}