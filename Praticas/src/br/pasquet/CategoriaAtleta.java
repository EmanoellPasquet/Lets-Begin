package br.pasquet;

import java.util.Scanner;

public class CategoriaAtleta {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);

		System.out.print("Digite a idade do atleta: ");
		int idd=scan.nextInt();
		if(idd>=5 && idd <=10) {
			System.out.println("Atleta da categoria infantil.");
		}else if(idd>10 && idd<18) {
			System.out.println("Atleta da categoria juvenil.");
		}else if(idd>17 && idd<31) {
			System.out.println("Atleta da categoria profissional.");
		}else if(idd>30) {
			System.out.println("Atleta da categoria sênior.");
		}else {
			System.out.println("Categoria inexistente para esta faixa etária.");
		}
		scan.close();
	}

}
