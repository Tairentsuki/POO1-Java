package exercicios.exLista9.pessoas;

public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome) {
        setNome(nome);
    }

    public Pessoa(String nome, String endereco) {
        setNome(nome);
        setEndereco(endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco.length() > 5) {
            this.endereco = endereco;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 3) {
            this.nome = nome;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("endereco='").append(endereco).append('\'');
        sb.append(", nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
