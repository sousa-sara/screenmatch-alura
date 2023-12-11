package br.com.screenmatch.main;
import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

public class TesteSistema {

	public static void main(String[] args) {

		// Cria um novo objeto do tipo Filme chamado 'gatsby'
		Filme gatsby = new Filme(); 

		// Define os atributos do filme 'gatsby'
		gatsby.setNome("O Grande Gatsby");
		gatsby.setAnoDeLancamento(2013);
		
		//Exibe nome e ano de lançamento do filme 'gatsby'
		gatsby.exibeFichaTecnica();
		
		// Define e exibe a duração em minutos do filme 'gatsby'
		gatsby.setDuracaoEmMinutos(143);
		System.out.println("Duração do filme em minutos: " + gatsby.getDuracaoEmMinutos());

		//Notas das avaliações do filme 'gatsby'
		gatsby.avalia(10); 
		gatsby.avalia(10);
		gatsby.avalia(10);

		// Cria uma instância da classe FiltroRecomendacao
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		
		// Exibe informações de avaliação e classificação do filme
		System.out.println("\nINFORMAÇÕES DE AVALIAÇÃO\n");
		System.out.println("Total das Avaliações: " + gatsby.getTotalDeAvaliacoes() + 
				"\nSoma das Avaliações: " + gatsby.getSomaDasAvaliacoes() +
				"\nMédia das Avaliações: " + gatsby.pegaMediaDasAvaliacoes());
		System.out.println("\nINFORMAÇÃO DE CLASSIFICAÇÃO\n");
		System.out.println("Classificação do Filme (5 como classificação máxima): " + gatsby.getClassificacao());
		filtro.filtra(gatsby);
		System.out.println("\n---------------------------------------------------------");
		
		// Cria um novo objeto do tipo Filme chamado 'interestelar'
		Filme interestelar = new Filme(); 

		// Define os atributos do filme 'interestelar'
		interestelar.setNome("Interestelar");
		interestelar.setAnoDeLancamento(2014);

		// Exibe nome e ano de lançamento do filme 'interestelar'
		interestelar.exibeFichaTecnica();

		// Define e exibe a duração em minutos do filme 'interestelar'
		interestelar.setDuracaoEmMinutos(169); 
		System.out.println("Duração do filme em minutos: " + interestelar.getDuracaoEmMinutos());

		// Notas das avaliações do filme 'interestelar'
		interestelar.avalia(2); 
		interestelar.avalia(3);
		interestelar.avalia(8);

		// Exibe informações de avaliação e classificação do filme
		System.out.println("\nINFORMAÇÕES DE AVALIAÇÃO\n");
		System.out.println("Total das Avaliações: " + interestelar.getTotalDeAvaliacoes() + 
		        "\nSoma das Avaliações: " + interestelar.getSomaDasAvaliacoes() +
		        "\nMédia das Avaliações: " + interestelar.pegaMediaDasAvaliacoes());
		System.out.println("\nINFORMAÇÃO DE CLASSIFICAÇÃO\n");
		System.out.println("Classificação do Filme (5 como classificação máxima): " + interestelar.getClassificacao());
		filtro.filtra(interestelar);
		System.out.println("\n---------------------------------------------------------");
		
		// Cria um novo objeto do tipo Serie chamado 'dark'
		Serie dark = new Serie();

		// Define os atributos da série 'dark'
		dark.setNome("Dark");
		dark.setAnoDeLancamento(2017);
		
		// Exibe nome e ano de lançamento da série 'dark'
		dark.exibeFichaTecnica();
		
		// Define os atributos da série 'dark'
		dark.setTemporadas(3);
		dark.setEpisodiosPorTemporada(8);
		dark.setMinutosPorEpisodio(60);
		
		// Exibe informações de temporada e maratona da série 'dark'
		System.out.println("\nINFORMAÇÕES DE TEMPORADAS\n");
		System.out.println("Quantidade de Temporadas: " + dark.getTemporadas() + 
				"\nEpisódios por Temporada: " + dark.getEpisodiosPorTemporada() +
				"\nMinutos por Episódio: " + dark.getMinutosPorEpisodio() +
				"\nDuração em minutos para maratonar a série: " + dark.getDuracaoEmMinutos());
		
		// Notas das avaliações da série 'dark'
				dark.avalia(10); 
				dark.avalia(9);
				dark.avalia(8.5);
		
		// Exibe informações de avaliação e classificação da série 'dark'
		System.out.println("\nINFORMAÇÕES DE AVALIAÇÃO\n");
		System.out.println("Total das Avaliações: " + dark.getTotalDeAvaliacoes() + 
		        "\nSoma das Avaliações: " + dark.getSomaDasAvaliacoes() +
		        "\nMédia das Avaliações: " + dark.pegaMediaDasAvaliacoes());
		System.out.println("\nINFORMAÇÃO DE CLASSIFICAÇÃO\n");
		System.out.println("Classificação da série (100 como classificação máxima): " + dark.getClassificacao());
		filtro.filtra(dark);
		
		// Cria um novo objeto do tipo Episodio chamado 'epsisodioDark'
        Episodio episodioDark = new Episodio(); 
		
        // Define os atributos do 'episodioDark'
		episodioDark.setNumero(1);
		episodioDark.setNome("Secrets");;
		episodioDark.setTotalDeVisualizacoes(3000000);
		
		// Exibe informação e classificação sobre o 'episodioDark'
		System.out.println("\nINFORMAÇÕES SOBRE EPISÓDIO DE DARK\n");
		System.out.println("Número do Episódio: " + episodioDark.getNumero() +
		"\nNome: " + episodioDark.getNome() +
		"\nTotal de Visualizações: " + episodioDark.getTotalDeVisualizacoes());
		System.out.println("Classificação do episódio com base nas visualizações (10 como classificação máxima): " +
		episodioDark.getClassificacao());
		System.out.println("\n---------------------------------------------------------");
		
		// Cria um novo objeto do tipo Serie chamado 'blackMirror'
		Serie blackMirror = new Serie();

        // Definir os detalhes da série "Black Mirror"
        blackMirror.setNome("Black Mirror");
        blackMirror.setAnoDeLancamento(2011);
        
        // Exibir nome e ano de lançamento de "Black Mirror"
        blackMirror.exibeFichaTecnica();
        
        // Definir os detalhes da série "Black Mirror"
        blackMirror.setTemporadas(5);
        blackMirror.setEpisodiosPorTemporada(6);
        blackMirror.setMinutosPorEpisodio(60);
        
        // Exibe informações de temporada e maratona da série "Black Mirror"
        System.out.println("\nINFORMAÇÕES DE TEMPORADAS\n");
		System.out.println("Quantidade de Temporadas: " + blackMirror.getTemporadas() + 
				"\nEpisódios por Temporada: " + blackMirror.getEpisodiosPorTemporada() +
				"\nMinutos por Episódio: " + blackMirror.getMinutosPorEpisodio() +
				"\nDuração em minutos para maratonar a série: " + blackMirror.getDuracaoEmMinutos());

        // Avaliações para "Black Mirror"
        blackMirror.avalia(2);
        blackMirror.avalia(2);
        blackMirror.avalia(5);

        // Exibir informações de avaliação e classificação para "Black Mirror"
        System.out.println("\nINFORMAÇÕES DE AVALIAÇÃO\n");
        System.out.println("Total das Avaliações: " + blackMirror.getTotalDeAvaliacoes() + 
        		"\nSoma das Avaliações: " + blackMirror.getSomaDasAvaliacoes() + 
        		"\nMédia das Avaliações: " + blackMirror.pegaMediaDasAvaliacoes());
        System.out.println("\nINFORMAÇÃO DE CLASSIFICAÇÃO\n");
        System.out.println("Classificação da série (100 como classificação máxima): " + blackMirror.getClassificacao());
        filtro.filtra(blackMirror);

        // Criar um objeto Episodio para um episódio de "Black Mirror"
        Episodio episodioBlackMirror = new Episodio();
        episodioBlackMirror.setNumero(1);
        episodioBlackMirror.setNome("The National Anthem");
        episodioBlackMirror.setTotalDeVisualizacoes(2800);

        // Exibir informações sobre um episódio de "Black Mirror"
        System.out.println("\nINFORMAÇÕES SOBRE EPISÓDIO DE BLACK MIRROR\n");
        System.out.println("Número do Episódio: " + episodioBlackMirror.getNumero() + 
        		"\nNome do Episódio: " + episodioBlackMirror.getNome() + 
        		"\nTotal de Visualizações: " + episodioBlackMirror.getTotalDeVisualizacoes());
        System.out.println("Classificação do episódio com base nas visualizações (10 como classificação máxima): " + 
        episodioBlackMirror.getClassificacao());
        System.out.println("\n===========================================================");
        
        // Cria uma instância da classe CalculadoraDeTempo
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        
        // Inclui os objetos 'gatsby', 'interestelar', 'dark' e 'blackMirror' na calculadora de tempo.
        calculadora.inclui(gatsby); // Adiciona o filme 'gatsby' à calculadora.
        calculadora.inclui(interestelar); // Adiciona o filme 'interestelar' à calculadora.
        calculadora.inclui(dark); // Adiciona a série 'dark' à calculadora.
        calculadora.inclui(blackMirror); // Adiciona a série 'blackMirror' à calculadora.

        // Imprime o tempo total em minutos de duração de todos os filmes e séries incluídos na calculadora.
        System.out.println("\nTempo total (em minutos) de duração de todos os filmes e séries incluídos: " + calculadora.getTempoTotal());
	}

}
