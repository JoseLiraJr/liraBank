package br.com.lirabank.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int posLivre;

	public GuardadorDeContas(int qtdPosicoes) {
		this.referencias = new Conta[qtdPosicoes];
		this.posLivre = 0;
	}

	public void adiciona(Conta conta) {
		this.referencias[posLivre] = conta;
		this.posLivre++;
	}

	public int getQtdeElementos() {
		return this.posLivre;
	}

	public Conta getReferenciaConta(int pos) {
		return this.referencias[pos];
	}

}
