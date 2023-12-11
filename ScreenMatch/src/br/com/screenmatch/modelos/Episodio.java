package br.com.screenmatch.modelos;
import br.com.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {

	//Visibilidade, tipo de dado e nome da variável
	private int numero;
	private String nome;
	private Serie serie;
	private int totalDeVisualizacoes;

	//Getters e Setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	public int getTotalDeVisualizacoes() {
		return totalDeVisualizacoes;
	}
	public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
		this.totalDeVisualizacoes = totalDeVisualizacoes;
	}

	//Método sobrescrito
	@Override
	public int getClassificacao() {
	    // Método para atribuir uma classificação baseada no total de visualizações do episódio

	    // Verifica se o total de visualizações é maior que 1.000.000 (um milhão)
	    if (totalDeVisualizacoes > 1000000) {
	        // Se o total de visualizações for maior que um milhão, atribui a classificação máxima (10)
	        return 10;
	    } else {
	        // Se o total de visualizações for menor ou igual a um milhão, atribui uma classificação intermediária (5)
	        return 5;
	    }
		
	}

}
