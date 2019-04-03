package br.pasquet;

import java.math.BigDecimal;

public class Canetas {
	String modelo;
	String marca;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	BigDecimal valor;

	void status() {
		System.out.println("Caneta: "+this.cor);
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Tamanho da ponta: "+this.ponta);
		System.out.println("Carga: "+this.carga);
		System.out.println("Pre�o: "+this.valor);
	}
	void tampar(){
		tampada=true;
	}
	void destampar() {
		tampada=false;
	}
	void testar() {
		if(tampada==true) {
			System.out.println("N�o � poss�vel escrever, a caneta est� tampada!");
		}else if(tampada==false && carga>80){
			System.out.println("Escreveu bem");
		}else {
			System.out.println("Escreveu, mas falhou um pouco");
		}	
	}
}
