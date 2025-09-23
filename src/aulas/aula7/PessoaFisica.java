package aulas.aula7;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica(String nome, String cpf){
        super(nome);
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PessoaFisica{");
        sb.append("cpf='").append(cpf).append('\'');
        sb.append(super.toString()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
