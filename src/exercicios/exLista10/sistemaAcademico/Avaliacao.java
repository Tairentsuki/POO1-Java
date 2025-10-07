package exercicios.exLista10.sistemaAcademico;

import java.util.Date;

public class Avaliacao {
    private int id;
    private double nota;
    private Date data;
    private Professor registradaPor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Professor getRegistradaPor() {
        return registradaPor;
    }

    public void setRegistradaPor(Professor registradaPor) {
        this.registradaPor = registradaPor;
    }
}
