package alura.screnmath;

import alura.screnmath.calculos.CalculadoraDeTempo;
import alura.screnmath.calculos.FiltroRecomendacao;
import alura.screnmath.entities.Episodio;
import alura.screnmath.entities.Filmes;
import alura.screnmath.entities.Serie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ScrenmathApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrenmathApplication.class, args);

		Filmes meuFilme = new Filmes("O poderoso chefão", 1970);
		meuFilme.setDuracaoEmMinutos(180);
		System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println(meuFilme.pegaMedia());
		//meuFilme.somaDasAvaliacoes = 10;
		//meuFilme.totalDeAvaliacoes = 1;
		//System.out.println(meuFilme.pegaMedia());

		Serie lost = new Serie("Lost", 2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutosPorEpisodio(50);
		System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

		Filmes outroFilme = new Filmes("Avatar", 2023);
		outroFilme.setDuracaoEmMinutos(200);

		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal());

		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);

		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);

		var filmeDoPaulo = new Filmes("Dogville", 2003);
		filmeDoPaulo.setDuracaoEmMinutos(200);
		// exemplo:
		//  filmeDoPaulo.setNome("Dogville");
		//  filmeDoPaulo.setAnoDeLancamento(2003)
		filmeDoPaulo.avalia(10);

		ArrayList<Filmes> listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add(filmeDoPaulo);
		listaDeFilmes.add(meuFilme);
		listaDeFilmes.add(outroFilme);
		System.out.println("Tamanho da lista: " + listaDeFilmes.size());
		System.out.println("Primeiro filme é: " + listaDeFilmes.get(0).getNome());
		System.out.println("Lista de filmes é: " + listaDeFilmes);
		System.out.println("toString da Lista de filmes é: " + listaDeFilmes.get(0).toString());

	}

}
