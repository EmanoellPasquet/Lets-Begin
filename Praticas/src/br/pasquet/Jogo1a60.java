package br.pasquet;

import java.util.Random;
import java.util.Scanner;

public class Jogo1a60 {

	public static void main(String[] args) {
		Random rd=new Random();
		Scanner scan=new Scanner (System.in);


		int []num=new int[6];
		int nuser,tent=0, erro=0;
		do {
			erro=0;
			for(int x=0;x<6;x++) {
				num[x]=rd.nextInt((60)+1);
			}
			do {
				System.out.print("Digite um n�mero maior que 1 e menor que 60: ");
				nuser=scan.nextInt();
				if(nuser<1||nuser>60) {
					System.out.println("N�mero digitado fora do intervalo solicitado. Tente novamente!");
				}
			}while(nuser<1||nuser>60);
			tent++;
			for(int x=0;x<6;x++) {
				num[x]=rd.nextInt((60)+1);
				if(nuser==num[x]) {
					System.out.println("Parab�ns! Voc� acertou este n�mero: "+num[x]+"\nTotal de tentativas: "+tent);
				}
				else {
					erro++;
				}
			}
			if(erro==6) {
				System.out.print("Voc� n�o acertou nenhum n�mero. Tente novamente!\n\n");
			}
		}while(erro==6);
		scan.close();
	}
}
