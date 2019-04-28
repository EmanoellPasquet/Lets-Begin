package br.pasquet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

	public static void main(String[] args) {
		
		Set<Integer> C1= new HashSet<>(Arrays.asList(0,2,3,5,8,13,21));
		Set<Integer> C2= new HashSet<>(Arrays.asList(5,6,7,8,9,10));
		
			
		
		Set<Integer>Uniao=new HashSet<>(C1);
		Uniao.addAll(C2);
		System.out.println("União: "+Uniao);
		
		
		Set<Integer>Inter=new HashSet<>(C1);
		Inter.retainAll(C2);
		System.out.println("Interseção: "+Inter);
	
		
		Set<Integer>Dif=new HashSet<>(C1);
		Dif.removeAll(C2);
		System.out.println("Diferença: "+Dif);
	}

}
