package br.pasquet;

import java.util.Random;

public class Sequencia1a100 {

	public static void main(String[] args) {

		Random rd=new Random();

		int n2=0;

		do {
			int num=rd.nextInt(100)+1;
			if(num%5!=0){
				System.out.print(num+" ");
				n2++;
			}
		}while(n2<10);
	}
}
