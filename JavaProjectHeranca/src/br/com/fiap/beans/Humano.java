package br.com.fiap.beans;

//Extends para chamar a classe herança
public class Humano extends Mamifero {
	
	//Subclasse Humano
	//Visibilidade, tipo de dado e nome da variável
	private String rg;

	//Construtor vazio
	public Humano() {
		super();
	}

	//Construtor cheio
	public Humano(String rg) {
		super();
		this.rg = rg;
	}
	
	//Construtor cheio com herança da superclasse mamífero (source->generate construtor from superclass)
	public Humano(String nome, int idade, double peso, String rg) {
		super(nome, idade, peso);
		//Chamar o rg (String rg) depois de 'double peso' e colocar abaixo 'this.rg = rg'
		this.rg = rg;
	}
	

	//Getters e setters
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	//Sobrescrita
	public String comunicar() {
		return "Através de um idioma";
	}
}
