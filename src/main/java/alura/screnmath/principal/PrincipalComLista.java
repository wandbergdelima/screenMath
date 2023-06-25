package alura.screnmath.principal;

import alura.screnmath.entities.Filmes;
import alura.screnmath.entities.Serie;
import alura.screnmath.entities.Titulo;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {

        Filmes meuFilme = new Filmes("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filmes outroFilme = new Filmes("Avatar", 2023);
        outroFilme.avalia(6);
        Filmes filmeDoPaulo = new Filmes("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>(); // ou new ArrayList<>();

        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filmes filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }


        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adan Sandeler");
        buscarPorArtista.add("Paulo");
        buscarPorArtista.add("Jacqueline");
        buscarPorArtista.add("Wandberg");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da Ordenação:");
        System.out.println(buscarPorArtista);

        System.out.println("Lista de Titulos Ordenadas");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Ordenando por Ano:");

        System.out.println(lista);
    }
}