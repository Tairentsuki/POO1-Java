package exercicios.exLista10.contaAvancada;

public class Banco {
    private int codigo;
    private String nome;
    private int numeroAgencias;

    public Banco(int codigo, String nome, int numeroAgencias) {
        this.codigo = codigo;
        this.nome = nome;
        this.numeroAgencias = numeroAgencias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroAgencias() {
        return numeroAgencias;
    }

    public void setNumeroAgencias(int numeroAgencias) {
        this.numeroAgencias = numeroAgencias;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Banco [Código=").append(codigo);
        sb.append(", Nome=").append(nome);
        sb.append(", N° Agências=").append(numeroAgencias);
        sb.append("]");
        return sb.toString();
    }
}