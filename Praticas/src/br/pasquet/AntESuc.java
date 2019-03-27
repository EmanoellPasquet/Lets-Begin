package br.pasquet;

import java.util.Scanner;

public class AntESuc {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Digite um número qualquer: ");
		int n=scan.nextInt();
		for(int x=1;x<=4;x++) {
			System.out.println("O "+x+"° sucessor ao número digitado é: "+(n+1));
			n++;
		}System.out.println("============================================");
		for(int x=1;x<=3;x++) {
			System.out.println("O "+x+"° antecessor ao número digitado("+n+") é: "+(n-5));
			n--;
		}
		scan.close();
	}
}
