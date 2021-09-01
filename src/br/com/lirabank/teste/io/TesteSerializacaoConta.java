package br.com.lirabank.teste.io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.lirabank.modelo.Cliente;
import br.com.lirabank.modelo.Conta;
import br.com.lirabank.modelo.ContaCorrente;

public class TesteSerializacaoConta {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Cliente cliente = new Cliente();
		cliente.setNome("José Júnior");
		cliente.setProfissão("Desenvolvedor");
		cliente.setCpf("034.254.433-05");
		
		Conta cc = new ContaCorrente(11, 22);
		cc.deposita(500);
		cc.setCliente(cliente);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();	

	}

}
