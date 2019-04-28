package br.pasquet;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		AgendaMap agenda = new AgendaMap();

		String nome="",Opt="",phone="",KeepGoing="", again="\nOutra operação?\n SIM  NÃO";
		do {
			do {
				System.out.println("Escreva:"
						+ "\n'NEW'    >para novo contato"
						+ "\n'REMOVE' >para remover contato"
						+ "\n'LIST'   >para ver a lista completa");
				Opt=scan.nextLine();	
			}while(!Opt.equalsIgnoreCase("new")&&(!Opt.equalsIgnoreCase("remove"))&&
					(!Opt.equalsIgnoreCase("list")));
			if(Opt.equalsIgnoreCase("NEW")) {
				System.out.println("Nome: ");
				nome=scan.nextLine();
				System.out.println("Telefone: ");
				phone=scan.nextLine();
				agenda.addNew(nome, phone);
				System.out.println("Contato adicionado com sucesso!");
				System.out.println(again);
				KeepGoing=scan.nextLine();
			}else if(Opt.equalsIgnoreCase("REMOVE")) {
				System.out.println("Nome a ser removido: ");
				agenda.remove(nome);
				System.out.println("Contato removido com sucesso!");
				System.out.println(again);
				KeepGoing=scan.nextLine();
			}else {
				System.out.println(agenda);

				System.out.println(again);
				KeepGoing=scan.nextLine();
			}
		}while(KeepGoing.equalsIgnoreCase("SIM"));
		scan.close();
	}

}
