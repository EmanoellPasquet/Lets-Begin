package br.pasquet;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenar10a500 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int []nuser=new int[4];
		int x=1,num,v=0;

		do {
			do {
				System.out.print("Digite 4 n�meros entre 10 e 500.\n"+x+"� n�mero: ");
				num=scan.nextInt();
				if(num<10||num>500) {
					System.out.print("N�mero fora do intervalo esperado, tente novamente!\n");
				}
			}while(num<10||num>500);
			nuser[v]=num;
			v++;
			x++;
		}while(x<5);
		Arrays.sort(nuser);
		System.out.print("O n�meros que voc� digitou ordenados s�o: ");
		for(int i=0;i<nuser.length;i++) {
			if(i==3) {
				System.out.print(nuser[i]+".");
			}else {
			System.out.print(nuser[i]+", ");
			}
		}
		scan.close();
	}
}
