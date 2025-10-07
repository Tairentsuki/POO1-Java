package exercicios.exLista10.sistemaAcademico;

import java.util.List;

public class Aluno {
    private int id;
    private String nome;
    private String matricula;
    private Curso curso;
    private List<MatriculaDisciplina> matriculas;

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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<MatriculaDisciplina> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<MatriculaDisciplina> matriculas) {
        this.matriculas = matriculas;
    }
}
