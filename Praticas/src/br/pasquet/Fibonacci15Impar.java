package br.pasquet;

public class Fibonacci15Impar {

	public static void main(String[] args) {

		int last=1,cur=0,next=0;

		for(int x=0;x<=15;x++) {
			next=cur+last;
			if(x==15) {
				System.out.print("0000"+next+".");
			}else{
				if(next<10) {
					System.out.print("000000"+next+", ");
				}else if(next>9 && next<100) {
					System.out.print("00000"+next+", ");
				}else {
					System.out.print("0000"+next+", ");
				}
			}
			if(x%5==0) {
				System.out.println("\n");
			}
			last=cur;
			cur=next;
		}
	}
}