package br.pasquet;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int l1,l2,l3;
		System.out.println("Digite o primeiro lado do triângulo: ");
		l1=scan.nextInt();
		System.out.println("Digite o segundo lado do triângulo: ");
		l2=scan.nextInt();
		System.out.println("Digite o terceiro lado do triângulo: ");
		l3=scan.nextInt();
		if(l1+l2>l3 && l2+l3>l1 && l1+l3>l2) {
			if(l1==l2&&l2==l3) {
				System.out.println("Equilátero.");
			}else if(l1!=l2 && l2!= l3 && l3!= l1) {
				System.out.println("Isósceles.");
			}else {
				System.out.println("Escaleno.");
			}
		}else {
			System.out.println("Não é possível formar um triângulo.");
		}
		scan.close();
	}
}
