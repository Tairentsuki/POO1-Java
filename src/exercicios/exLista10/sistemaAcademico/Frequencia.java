package exercicios.exLista10.sistemaAcademico;

import java.util.Date;

public class Frequencia {
    private int id;
    private Date data;
    private boolean presente;
    private Professor registradaPor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public Professor getRegistradaPor() {
        return registradaPor;
    }

    public void setRegistradaPor(Professor registradaPor) {
        this.registradaPor = registradaPor;
    }
}
