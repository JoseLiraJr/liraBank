package br.com.lirabank.modelo;

public class SaldoInsuficienteException extends Exception{

	public SaldoInsuficienteException() {
		
	}
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
