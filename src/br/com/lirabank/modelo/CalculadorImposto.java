package br.com.lirabank.modelo;

public class CalculadorImposto {

	private double totalImposto;

	public void registra(Tributavel tributavel) {
		double valor = tributavel.getImposto();
		this.totalImposto += valor;
	}

	public double getTotalImposto() {
		return this.totalImposto;
	}
}
