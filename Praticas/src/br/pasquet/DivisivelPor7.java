package br.pasquet;

import java.util.Scanner;

public class DivisivelPor7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Digite um número qualquer: ");
		int n=scan.nextInt();
		if(n%7==0) {
			System.out.println("Número digitado é divisivel por 7.");
		}else {
			System.out.println("Número digitado não é divisivel por 7.");
		}
		scan.close();
	}
}
