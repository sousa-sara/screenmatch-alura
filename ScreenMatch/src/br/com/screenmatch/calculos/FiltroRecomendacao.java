package br.com.screenmatch.calculos;

//Classe responsável por filtrar e recomendar conteúdos com base na classificação
public class FiltroRecomendacao {
	
 // Método que filtra e recomenda com base na classificação do objeto Classificavel passado como parâmetro
	public void filtra(Classificavel classificavel) {
		
		if (classificavel.getClassificacao() >= 4) {
			// Se a classificação do objeto for maior ou igual a 4, imprime a mensagem "Está entre os preferidos do momento."
			System.out.println("\nRECOMENDAÇÃO: Está entre os preferidos do momento.");
			
		} else if (classificavel.getClassificacao() >= 2) {
			// Se a classificação do objeto for maior ou igual a 2, imprime a mensagem "Muito bem avaliado no momento."
			System.out.println("\nRECOMENDAÇÃO: Muito bem avaliado no momento.");
			
		} else {
			// Se a classificação do objeto for menor que 2, imprime a mensagem "Coloque na sua lista para assistir depois."
			System.out.println("\nRECOMENDAÇÃO: Coloque na sua lista para assistir depois.");
		}
	}
}