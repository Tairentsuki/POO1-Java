package exercicios.exLista9.pessoas;

import java.util.Objects;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String estadoCivil;

    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        setCpf(cpf);
    }

    public PessoaFisica(String nome, String cpf, String endereco) {
        super(nome, endereco);
        setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() > 10) {
            this.cpf = cpf;
        }
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        if (Objects.equals(estadoCivil, "Solteiro") | Objects.equals(estadoCivil, "Casado")) {
            this.estadoCivil = estadoCivil;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PessoaFisica{");
        sb.append("cpf='").append(cpf).append('\'');
        sb.append(", estadoCivil='").append(estadoCivil).append('\'');
        sb.append('}').append("\n");
        sb.append(super.toString());
        return sb.toString();
    }

}
