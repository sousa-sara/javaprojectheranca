package br.com.fiap.beans;

//Extends para chamar a classe herança
public class Touro extends Mamifero {
	
	//Subclasse Touro
	//Visibilidade, tipo de dado e nome da variável
	private double tamanhoChifre;

	//Construtor vazio
	public Touro() {
		super();
	}

	//Construtor cheio com herança da superclasse mamífero (source->generate construtor using fields), escolhe o const cheio da superclasse mamífero
	//Esse processo é mais simples e já adiciona as características próprias da subclasse Touro
	public Touro(String nome, int idade, double peso, double tamanhoChifre) {
		super(nome, idade, peso);
		this.tamanhoChifre = tamanhoChifre;
	}
	
	//Getters e setters
	public double getTamanhoChifre() {
		return tamanhoChifre;
	}

	public void setTamanhoChifre(double tamanhoChifre) {
		this.tamanhoChifre = tamanhoChifre;
	}
	
	//Sobrescrita
		public String comunicar() {
			return "Com um muu!";
		}

}
