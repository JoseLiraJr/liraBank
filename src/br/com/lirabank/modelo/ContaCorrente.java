package br.com.lirabank.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		// sobrescrita do método saca, onde será adicionado taxa para saque na conta
		// corrente.
		super.saca(valor + 0.2);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getImposto() {
		return super.saldo * 0.05;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente: " + super.toString();
	}

}
