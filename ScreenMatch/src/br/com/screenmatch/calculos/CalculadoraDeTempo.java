package br.com.screenmatch.calculos;
import br.com.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

	//Visibilidade, tipo de dado e nome da variável
	private int tempoTotal = 0; // Declaração e inicialização da variável que armazenará o tempo total

    public int getTempoTotal() { // Método para obter o tempo total calculado
        return tempoTotal;
    }

    public void inclui(Titulo titulo) { // Método para incluir um título e calcular o tempo total com base em sua duração
        this.tempoTotal += titulo.getDuracaoEmMinutos(); // Adiciona à variável tempoTotal a duração em minutos do título fornecido como parâmetro
    }
}