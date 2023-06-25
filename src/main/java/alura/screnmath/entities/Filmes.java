package alura.screnmath.entities;

import alura.screnmath.calculos.Classificavel;

public class Filmes extends Titulo implements Classificavel {
    private String diretor;

    public Filmes(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: "
                + this.getNome()
                + " ("
                + this.getAnoDeLancamento()
                + ")";
    }
}
