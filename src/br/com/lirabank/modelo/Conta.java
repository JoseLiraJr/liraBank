package br.com.lirabank.modelo;

import java.io.Serializable;

/**
 * 
 * @author jlira
 * @version 1.0.0
 * @category Classe abstrata que cria as demais classes do Projeto.
 */
public abstract class Conta implements Comparable<Conta>, Serializable {

	private int agencia;
	private int numero;
	protected double saldo;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		if (agencia < 1) {
			throw new IllegalArgumentException("Agência Inválida");
		}
		if (numero < 1) {
			throw new IllegalArgumentException("Número da Conta Inválido");
		}
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(
					"ERRO: O valor do saque: " + valor + " é maior do que o saldo disponível: " + this.saldo);
		}

		this.saldo -= valor;
	}

	public void transfere(double valor, Conta contaDestino) throws SaldoInsuficienteException {
		this.saca(valor);
		contaDestino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setCliente(Cliente novoCliente) {
		this.titular = novoCliente;
	}

	public Cliente getCliente() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agência: " + this.agencia;
	}

	@Override
	public boolean equals(Object ref) {
		Conta conta = (Conta) ref;
		if (this.agencia != conta.agencia || this.numero != conta.numero) {
			return false;
		}
		return true;
	}
	
	public Integer getNumero() {
		return this.numero;
	}
	
	@Override
	public int compareTo(Conta conta) {
		return Double.compare(this.saldo, conta.saldo);
	}

}
