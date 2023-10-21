package br.com.fiap.beans;

public class Mamifero {
	
	//Superclasse: mamífero
	//Visibilidade, tipo de dado e nome da variável
	private String nome;
	private int idade;
	private double peso;
	
	//Construtor vazio
	public Mamifero() {
		super();
	}

	//Construtor cheio
	public Mamifero(String nome, int idade, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	//Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//Sobrescrita
	public String comunicar() {
		return "Não definido";
	}
}
