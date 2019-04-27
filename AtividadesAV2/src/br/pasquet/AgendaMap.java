package br.pasquet;

import java.util.Map;
import java.util.TreeMap;

public class AgendaMap {

	public static void main(String[] args) {


		Map<String, String> contatos = new TreeMap<>();
		
		contatos.put("José "," 5555555");
		contatos.put("Maria","6669874");
		contatos.put("Carlos","88875964");
		contatos.put("Marcos","666059942");
		contatos.put("Paulo","87459638");
		contatos.put("Aílton","234851678");
		contatos.put("Bianca","555987258");
		contatos.put("Alice","5485216464");
		contatos.put("Maria Casa","23854962");
		System.out.println("Contatos");
		for(String key : contatos.keySet()) {
			System.out.println(key+ ": "+contatos.get(key));
		}
		
	}

}
