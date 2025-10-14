package exercicios.exLista10.carroMotorPessoa2;

import java.sql.Date;
import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    LocalDate dataNascimento;


    public Pessoa(String nome, String email) {
        setNome(nome);
        setEmail(email);
        setTelefone("");
    }
    public Pessoa(String nome, String email, LocalDate dataDeNascimento) {
        setNome(nome);
        setEmail(email);
        setDataNascimento(dataDeNascimento);
    }

    public Pessoa(String nome, String email, LocalDate dataDeNascimento, String telefone) {
        setNome(nome);
        setEmail(email);
        setDataNascimento(dataDeNascimento);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@") && email.length() > 3) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.length() > 5) {
            this.telefone = telefone;
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
