/**  
 * @author Júnior Lira 
 */

package br.com.lirabank.especial;

import br.com.lirabank.modelo.Conta;

/**
 * Conta Especial que herda da classe Conta;
 * @author jlira
 *
 */
public class ContaEspecial extends Conta {

	/**
	 * 
	 * @param agencia
	 * @param numero
	 */
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public void deposita(double valor) {       
		
	}

}
