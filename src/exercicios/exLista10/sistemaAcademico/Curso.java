package exercicios.exLista10.sistemaAcademico;

import java.util.List;

public class Curso {
    private int id;
    private String nome;
    private List<Fase> fases;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Fase> getFases() {
        return fases;
    }

    public void setFases(List<Fase> fases) {
        this.fases = fases;
    }
}
