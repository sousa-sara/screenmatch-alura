package br.com.screenmatch.calculos;

//Interface que define o contrato para objetos que podem ser classificados
public interface Classificavel { 
	
	// Método abstrato que deve ser implementado por qualquer classe que implemente esta interface
    // Retorna a classificação do objeto que implementa esta interface
	int getClassificacao();
	
}
