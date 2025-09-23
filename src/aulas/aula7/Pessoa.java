package aulas.aula7;

public class Pessoa {

    private String nome;

    public Pessoa(String nome){
        setNome(nome);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 3){
            this.nome = nome;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
