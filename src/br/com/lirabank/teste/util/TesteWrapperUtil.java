package br.com.lirabank.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperUtil {

	public static void main(String[] args) {
		Integer idadeRef = 29; //autoboxinng, é criado um objeto do tipo Integer
        int primitivo = new Integer(21); //que locura!! unboxing

        List<Integer> lista = new ArrayList<>();
        lista.add(idadeRef); //ok
        lista.add(primitivo); //autoboxing

        int i1 = lista.get(0);  //unboxing
        Integer i2 = lista.get(1);  //ok

        System.out.println(i1);  //29
        System.out.println(i2); //21
        
        Integer valorRef = Integer.valueOf(33); // delegando a criação para método valueOf
        int valorPri = valorRef.intValue(); //desembrulhando, pegando o valor primitivo do objeto wrapper

        System.out.println(valorPri);
        
        System.out.println(Integer.MAX_VALUE); // 2^31 - 1
        System.out.println(Integer.MIN_VALUE); //-2^31

        System.out.println(Integer.SIZE); // 32 bits
        System.out.println(Integer.BYTES); //4 Bytes
	}

}
