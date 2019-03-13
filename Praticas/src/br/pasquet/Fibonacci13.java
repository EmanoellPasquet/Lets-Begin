package br.pasquet;

public class Fibonacci13 {

	public static void main(String[] args) {
		int last=1,cur=0,next,x=0;
		
		while(x<13) {
			next=cur+last;
			System.out.print(next+" ");
			last=cur;
			cur=next;
			x++;
		}
	}
}
