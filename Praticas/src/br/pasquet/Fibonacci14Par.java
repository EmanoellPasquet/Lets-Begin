package br.pasquet;

public class Fibonacci14Par {

	public static void main(String[] args) {

		int last=1,cur=0,next=0;

		for(int x=0;x<=15;x++) {
			next=cur+last;
			if (next%2==0) {
				if(x==15) {
					System.out.print(next+".");
				}else{ 
					System.out.print(next+", ");
				}
				if(x%5==0) {
					System.out.println("\n");
				}
			}else {
				x--;
			}
			last=cur;
			cur=next;
		}
	}
}




