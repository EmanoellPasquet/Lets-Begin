package br.pasquet;

import java.util.Scanner;

public class MediaAltura {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double soma=0, alt,maior=0,menor=100;
		for(int x=1;x<=10;x++) {
			System.out.print("Digite a "+x+"° altura: ");
			alt=scan.nextDouble();
			soma=soma+alt;
			if(alt>maior) {
				maior=alt;
			}
			else if(alt<menor) {
				menor=alt;
			}
		}
		System.out.println("A média das alturas é: "+(soma/10)+"\nA maior altura é: "+maior+"\nA menor altura é: "+menor);
		scan.close();
	}
}
