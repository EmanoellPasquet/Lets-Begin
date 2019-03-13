package br.pasquet;

public class MediaSequencial {

	public static void main(String[] args) {
		double n1=3,n2=5,n3;

		for(int x=1;x<=10;x++) {

			n3=(n1+n2)/2+5;
			if(x==10) {
				System.out.print(n1+".");
			}else {
				System.out.print(n1+", ");
			}	
			n1=n2;
			n2=n3;	
		}
	}
}
