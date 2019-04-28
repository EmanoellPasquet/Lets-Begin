package br.pasquet;

import java.util.Map;
import java.util.TreeMap;

public class AgendaMap {

	Map<String, Contato> Agenda = new TreeMap<>();

	public AgendaMap() {

	}
	public void addNew(Contato contato) {
		this.Agenda.put(contato.getNome(), contato);
	}	
	public void addNew(String nome, String phone) {
		this.addNew(new Contato(nome,phone));
	}
	public void remove(String nome) {
		Agenda.remove(nome);
	}
	@Override
	public String toString() {
		return  "Contatos\n"+Agenda+"\n";
	}
	
}


