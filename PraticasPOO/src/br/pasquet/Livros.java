package br.pasquet;

import java.math.BigDecimal;

public class Livros {
	String titulo;
	String editora;
	String autor;
	String edicao;
	BigDecimal valor;
	
	void status() {
		System.out.println("\nLivro");
		System.out.println("T�tulo: "+this.titulo);
		System.out.println("Autor: "+this.autor);
		System.out.println("Editora: "+this.editora);
		System.out.println("Edi��o: "+this.edicao);
		System.out.println("Pre�o: "+this.valor);
	}
}
