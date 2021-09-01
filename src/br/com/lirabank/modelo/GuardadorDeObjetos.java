package br.com.lirabank.modelo;

public class GuardadorDeObjetos {

	private Object[] objetos;
	private int posLivre;

	public GuardadorDeObjetos(int qtdPosicoes) {
		this.objetos = new Object[qtdPosicoes];
        posLivre = 0;
	}
	
	public void adiciona(Object ref) {
		this.objetos[posLivre] = ref;
		this.posLivre++;
	}
	
	public int getQtdeElementos() {
		return this.posLivre;
	}

	public Object getObjeto(int pos) {
		return this.objetos[pos];
	}

}
