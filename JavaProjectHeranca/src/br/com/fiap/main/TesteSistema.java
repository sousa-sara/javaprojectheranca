package br.com.fiap.main;
import javax.swing.JOptionPane;
import br.com.fiap.beans.Humano;
import br.com.fiap.beans.Touro;

public class TesteSistema {
	
	//Função static para facilitação (usado antes do método de execução Main)
	//String
	static String texto(String j) { //parâmetro 'j' de 'joption pane' (representa o buscador do joptionpane) vai buscar dentro do texto do input por isso 'String'
		return JOptionPane.showInputDialog(j);
	}
	
	//int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	//double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		//Instanciar objetos
		//Não instancia a superclasse mamífero, ela é apenas uma 'referência' para utilizar as subclasses
		
		//Subclasse Humano
		//String nome, int idade, double peso, String rg
		Humano objHumano = new Humano(
				texto("Nome do humano: "),
				inteiro("Idade: "),
				real("Peso: "),
				texto("RG: ")
				);
		
		//Subclasse Touro
		//String nome, int idade, double peso, double tamanhoChifre
		Touro objTouro = new Touro(
				texto("Nome do touro: "),
				inteiro("Idade: "),
				real("Peso: "),
				real("Tamanho do chifre: ")
				);
		
		//Saídas
		System.out.println(
				//Subclasse Humano
				//String nome, int idade, double peso, String rg
				"HUMANO: " + "\n\nNome: "+ objHumano.getNome() + "\nIdade: " + objHumano.getIdade() +
				"\nPeso: " + objHumano.getPeso() + "\nRG: " + objHumano.getRg() + "\nO ser humano se comunica: " + objHumano.comunicar() +
				//Subclasse Touro
				//String nome, int idade, double peso, double tamanhoChifre
				"\n\nTOURO: " + "\n\nNome: " + objTouro.getNome() + "\nIdade: " + objTouro.getIdade() +
				"\nPeso: " + objTouro.getPeso() + "\nTamanho do chifre: " + objTouro.getTamanhoChifre() +
				"\nO touro se comunica: " + objTouro.comunicar()
				);
	}
	
}
