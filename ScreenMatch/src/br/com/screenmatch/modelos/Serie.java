package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
	
	//Visibilidade, tipo de dado e nome da variável
	private int temporadas;
	private boolean ativa;
	private int episodiosPorTemporada;
	private int minutosPorEpisodio;
	
	//Getters e Setters
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getEpisodiosPorTemporada() {
		return episodiosPorTemporada;
	}
	public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
		this.episodiosPorTemporada = episodiosPorTemporada;
	}
	public int getMinutosPorEpisodio() {
		return minutosPorEpisodio;
	}
	public void setMinutosPorEpisodio(int minutosPorEpisodio) {
		this.minutosPorEpisodio = minutosPorEpisodio;
	}
	
	//Método sobrescrito
	@Override 
	public int getDuracaoEmMinutos() {
		return  temporadas * episodiosPorTemporada * minutosPorEpisodio; // Calcula a duração total multiplicando o número de temporadas pelo número de episódios por temporada e pelos minutos por episódio
	}
	
	//Método sobrescrito
	@Override
	public int getClassificacao() {
	    // Método para calcular e retornar a classificação da série, multiplicando a média das avaliações por 10.

	    // Retorna a média das avaliações (pegaMediaDasAvaliacoes()) multiplicada por 10 e convertida para um valor inteiro.
	    return (int) pegaMediaDasAvaliacoes() * 10;
	}

}
