package br.pasquet;

import java.util.Scanner;

public class TestePosNegNull {

	public static void main(String[] args) {
		int n;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Digite um número qualquer: ");
		n=scan.nextInt();
		if(n>0) {
			System.out.println("Número digitado é positivo!");
		}else if(n<0) {
			System.out.println("Número digitado é negativo!");
		}else {
			System.out.println("Número digitado é nulo (0)!");
		}
		scan.close();
	}
}
