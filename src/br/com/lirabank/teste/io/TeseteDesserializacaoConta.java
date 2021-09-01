package br.com.lirabank.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.lirabank.modelo.ContaCorrente;

public class TeseteDesserializacaoConta {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

	  ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
	  ContaCorrente cc = (ContaCorrente) ois.readObject();
	  ois.close();
	  
	  System.out.println(cc + " - " + cc.getCliente().getNome());
	  
	}

}
