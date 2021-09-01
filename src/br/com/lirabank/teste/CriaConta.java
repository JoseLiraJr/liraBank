package br.com.lirabank.teste;

import br.com.lirabank.modelo.Cliente;
import br.com.lirabank.modelo.Conta;
import br.com.lirabank.modelo.ContaCorrente;
import br.com.lirabank.modelo.ContaPoupanca;
import br.com.lirabank.modelo.SaldoInsuficienteException;

public class CriaConta {

	public static void main(String[] args) throws SaldoInsuficienteException {
		Conta conta1 = new ContaPoupanca(1234, 00010);
		conta1.deposita(500);

		Conta conta2 = conta1;
		conta2.saca(130);
		conta1.deposita(100);
		conta1.saca(50);

		//System.out.println(conta2.getSaldo());

		Cliente cliente = new Cliente();
		cliente.setNome("Junior Lira");
		cliente.setCpf("012.023.221-16");
		cliente.setProfissão("programador");

		conta1.setCliente(cliente);

		System.out.println(conta2.getCliente().getNome());

		Conta contaJose = new ContaCorrente(1234, 00011);
		conta1.transfere(200, contaJose);
		System.out.println("Transferido com Sucesso!");
		System.out.println();
		System.out.println("Conta 1: " + conta1.getSaldo() + " - Conta do Jose: " + contaJose.getSaldo());

		System.out.println("Total de contas criadas: " + Conta.getTotal());
		
		System.out.println(conta1);
		System.out.println(contaJose);
	}

}
