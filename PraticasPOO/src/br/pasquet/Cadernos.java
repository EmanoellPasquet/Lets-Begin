package br.pasquet;

import java.math.BigDecimal;

public class Cadernos {
	String capa;
	int materias;
	int paginas;
	String modelo;
	String marca;
	BigDecimal valor;
	boolean completo;

	void status() {
		System.out.println("\nCaderno");
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Matérias: : "+this.materias);
		System.out.println("Páginas: "+this.paginas);
		System.out.println("Capa: "+this.capa);
		System.out.println("Preço: "+this.valor);
	}
	void completo() {
		completo=true;
	}
	void incompleto() {
		completo=false;
	}
}
