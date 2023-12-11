package br.com.screenmatch.modelos;

public class Titulo {

	//Visibilidade, tipo de dado e nome da variável
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;

	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public double getSomaDasAvaliacoes() {
		return somaDasAvaliacoes;
	}

	public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
		this.somaDasAvaliacoes = somaDasAvaliacoes;
	}

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
		this.totalDeAvaliacoes = totalDeAvaliacoes;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	// Método para exibir informações da ficha técnica do filme
	public void exibeFichaTecnica() {
		System.out.println("\nFICHA TÉCNICA");
	    System.out.println("\nNome: " + nome + "\nAno: " + anoDeLancamento); 
	}

	// Método para registrar uma avaliação do filme
	public void avalia(double nota) { 
	    somaDasAvaliacoes += nota; // Soma a nota passada ao total de avaliações
	    totalDeAvaliacoes++; // Incrementa o contador de total de avaliações
	}

	// Método para calcular e retornar a média das avaliações do filme
	public double pegaMediaDasAvaliacoes() {
	    return somaDasAvaliacoes / totalDeAvaliacoes; // Retorna a média das avaliações
	}
	
}
