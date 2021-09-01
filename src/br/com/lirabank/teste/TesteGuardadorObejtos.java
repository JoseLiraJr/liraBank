package br.com.lirabank.teste;

import br.com.lirabank.modelo.Cliente;
import br.com.lirabank.modelo.Conta;
import br.com.lirabank.modelo.ContaCorrente;
import br.com.lirabank.modelo.GuardadorDeObjetos;

public class TesteGuardadorObejtos {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("José Júnior");
		cliente.setProfissão("Professor");
		
		Conta cc = new ContaCorrente(1234, 4321);
		cc.setCliente(cliente);
	
		GuardadorDeObjetos go = new  GuardadorDeObjetos(7);
		go.adiciona(cliente);
		go.adiciona(cc);
		
		Cliente obj = (Cliente) go.getObjeto(0);
		
		System.out.println(obj.getNome());

	}

}
