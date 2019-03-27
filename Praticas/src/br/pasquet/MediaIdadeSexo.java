package br.pasquet;

import java.util.Scanner;

public class MediaIdadeSexo {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		char sexo;
		int idd, maiorm=0, maiorf=0,soma=0;
		for(int x=0;x<=10;x++) {
			System.out.println("Digite sua idade: ");
			idd=scan.nextInt();
			soma=soma+idd;
			System.out.println("Digite seu sexo(M para masculino e F para feminino): ");
			sexo=scan.next().charAt(0);
			if(sexo=='F'&& idd>maiorf) {
				maiorf=idd;
			}else if(sexo=='M'&&idd>maiorm) {
				maiorm=idd;
			}
		}
		System.out.println("A média das idades digitadas é de: "+(soma/10)+
				"\nA maior idade feminina é: "+maiorf+
				"\nA maior idade masculina é: "+maiorm);
		scan.close();
	}
}
