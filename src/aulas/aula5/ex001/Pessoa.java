package aulas.aula5.ex001;

public class Pessoa {
    private String nome;
    private String sobrenome;


    public Pessoa() {

    }

    public Pessoa(String nome){
        setNome(nome);
    }

    public Pessoa(String nome, String sobrenome) {
        setNome(nome);
        setSobrenome(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return String.format("Seu nome completo é %s %s", nome, sobrenome);
    }
}
