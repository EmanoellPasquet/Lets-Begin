package br.pasquet;

import java.math.BigDecimal;

public class Mochila {
	String cor;
	String modelo;
	String marca;
	String tamanho;
	BigDecimal valor;
	boolean inteira;

	void status() {
		
		System.out.println("\nMochila");
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Cor: "+this.cor);
		System.out.println("Tamanho: "+this.tamanho);
		System.out.println("Preço: "+this.valor);
	}
	void estadoBom() {
		inteira=true;
	}
	void estadoRuim() {
		inteira=false;
	}
}
