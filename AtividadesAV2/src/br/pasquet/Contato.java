package br.pasquet;
import java.util.ArrayList;


public class Contato {
	
	private String nome, phone;
	private ArrayList<String> numeros =new ArrayList<String>();
	
	public Contato(String nome, String phone) {
		this.setNome(nome);
		this.numeros.add(phone);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ArrayList<String> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<String> numeros) {
		this.numeros = numeros;
	}

	@Override
	public String toString() {
		return "Telefone: " + numeros+"\n";
	}
	
}

