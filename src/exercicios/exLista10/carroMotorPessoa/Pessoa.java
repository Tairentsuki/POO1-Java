package exercicios.exLista10.carroMotorPessoa;

public class Pessoa {
    private String nome;
    private String endereco;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome);
        sb.append(", Endereço: ").append(endereco);
        return sb.toString();
    }}
