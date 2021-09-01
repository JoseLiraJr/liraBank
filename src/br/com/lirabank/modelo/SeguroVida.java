package br.com.lirabank.modelo;

public class SeguroVida implements Tributavel {

	private double valorSeguro;
	private double taxa;

	@Override
	public double getImposto() {
		return this.valorSeguro * this.taxa;
	}

	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}
