package exercicios.exLista10.sistemaAcademico;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setId(1);
        curso.setNome("Ciência da Computação");

        Fase fase1 = new Fase();
        fase1.setId(1);
        fase1.setNumero(1);

        Professor professor1 = new Professor();
        professor1.setId(1);
        professor1.setNome("Prof. João");

        Professor professor2 = new Professor();
        professor2.setId(2);
        professor2.setNome("Prof. Maria");

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setId(1);
        disciplina1.setNome("Algoritmos");
        disciplina1.setCargaHoraria(60);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setId(2);
        disciplina2.setNome("Banco de Dados");
        disciplina2.setCargaHoraria(60);

        OfertaDisciplina oferta1 = new OfertaDisciplina();
        oferta1.setId(1);
        oferta1.setAno(2025);
        oferta1.setSemestre(2);
        oferta1.setDisciplina(disciplina1);

        OfertaDisciplina oferta2 = new OfertaDisciplina();
        oferta2.setId(2);
        oferta2.setAno(2025);
        oferta2.setSemestre(2);
        oferta2.setDisciplina(disciplina2);

        Aluno aluno = new Aluno();
        aluno.setId(1);
        aluno.setNome("Carlos Silva");
        aluno.setMatricula("2025001");
        aluno.setCurso(curso);

        MatriculaDisciplina matricula1 = new MatriculaDisciplina();
        matricula1.setId(1);
        matricula1.setAluno(aluno);
        matricula1.setOfertaDisciplina(oferta1);
        matricula1.setSituacao("APROVADO");

        MatriculaDisciplina matricula2 = new MatriculaDisciplina();
        matricula2.setId(2);
        matricula2.setAluno(aluno);
        matricula2.setOfertaDisciplina(oferta2);
        matricula2.setSituacao("REPROVADO_POR_FALTA");

        Frequencia freq1 = new Frequencia();
        freq1.setId(1);
        freq1.setData(new Date());
        freq1.setPresente(true);
        freq1.setRegistradaPor(professor1);

        Frequencia freq2 = new Frequencia();
        freq2.setId(2);
        freq2.setData(new Date());
        freq2.setPresente(false);
        freq2.setRegistradaPor(professor2);

        Avaliacao avaliacao1 = new Avaliacao();
        avaliacao1.setId(1);
        avaliacao1.setNota(8.5);
        avaliacao1.setData(new Date());
        avaliacao1.setRegistradaPor(professor1);

        Avaliacao avaliacao2 = new Avaliacao();
        avaliacao2.setId(2);
        avaliacao2.setNota(5.0);
        avaliacao2.setData(new Date());
        avaliacao2.setRegistradaPor(professor2);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso().getNome());

        System.out.println("\nDisciplina: " + matricula1.getOfertaDisciplina().getDisciplina().getNome());
        System.out.println("Situação: " + matricula1.getSituacao());
        System.out.println("Avaliação 1: " + avaliacao1.getNota() + " (Prof: " + avaliacao1.getRegistradaPor().getNome() + ")");
        System.out.println("Frequência 1: Presente? " + freq1.isPresente() + " (Prof: " + freq1.getRegistradaPor().getNome() + ")");

        System.out.println("\nDisciplina: " + matricula2.getOfertaDisciplina().getDisciplina().getNome());
        System.out.println("Situação: " + matricula2.getSituacao());
        System.out.println("Avaliação 2: " + avaliacao2.getNota() + " (Prof: " + avaliacao2.getRegistradaPor().getNome() + ")");
        System.out.println("Frequência 2: Presente? " + freq2.isPresente() + " (Prof: " + freq2.getRegistradaPor().getNome() + ")");
    }
}
