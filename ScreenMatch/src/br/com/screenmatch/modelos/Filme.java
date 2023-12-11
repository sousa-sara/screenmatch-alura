package br.com.screenmatch.modelos;
import br.com.screenmatch.calculos.Classificavel; // Importação da interface Classificavel

public class Filme extends Titulo implements Classificavel { // Declaração da classe Filme que estende Titulo e implementa Classificavel

	//Visibilidade, tipo de dado e nome da variável;
    private String diretor; 

    //Getters e setters
    public String getDiretor() { 
        return diretor;
    }

    public void setDiretor(String diretor) { 
        this.diretor = diretor;
    }

    //Método sobrescrito
    @Override
    public int getClassificacao() { // Implementação do método da interface Classificavel para obter a classificação do filme
        return (int) pegaMediaDasAvaliacoes() / 2; // Retorna a média das avaliações do filme dividida por 2 (como um exemplo de lógica de classificação)
    }

}
