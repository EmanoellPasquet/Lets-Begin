package br.pasquet;
import java.math.BigDecimal;

public class Lista {

	public static void main(String[] args) {
		Canetas c1=new Canetas();
		Canetas c2=new Canetas();
		Cadernos cad1=new Cadernos();
		Cadernos cad2=new Cadernos();
		Mochila m1=new Mochila();
		Livros l1=new Livros();
		Livros l2=new Livros();
		
		c1.carga=79;
		c1.cor="StonerEyes Red";
		c1.marca="LumberJack";
		c1.modelo="Blood Red";
		c1.ponta=0.5;
		c1.valor=new BigDecimal("2.99");
		
		c2.carga=99;
		c2.cor="Grass Green";
		c2.marca="Lepper";
		c2.modelo="Green Edition";
		c2.ponta=1.0;
		c2.valor=new BigDecimal("1.79");
		
		cad1.capa="Dura";
		cad1.marca="Ruimzera";
		cad1.modelo="Espiral";
		cad1.paginas=278;
		cad1.materias=12;
		cad1.valor=new BigDecimal("60.00");
		
		cad2.capa="Sem capa";
		cad2.marca="God do God";
		cad2.modelo="Sem espiral";
		cad2.paginas=800;
		cad2.materias=32;
		cad2.valor=new BigDecimal("228.00");
		
		m1.cor="Batman Dark";
		m1.marca="Grandma Fabrics";
		m1.tamanho="Tamanho Itu";
		m1.valor=new BigDecimal("179.99");
		
		l1.autor="Steven Seagal";
		l1.editora="Leisure Life";
		l1.edicao="21°";
		l1.titulo="Dyeing properly your grey hair";
		l1.valor=new BigDecimal("0.99");
		
		l2.autor="Chuck Norris";
		l2.editora="GodChuck";
		l2.edicao="99°";
		l2.titulo="Spoon: Way lethal than the sharpest knife";
		l2.valor=new BigDecimal("999.99");
		
		c1.status();
		c2.status();
		cad1.status();
		cad2.status();
		l1.status();
		l2.status();
		m1.status();

	}

}
