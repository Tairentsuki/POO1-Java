package aulas.aula7;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome){
        super(nome);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj.length() > 14) {
            this.cnpj = cnpj;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PessoaJuridica{");
        sb.append("cnpj='").append(cnpj).append('\n');
        sb.append(super.toString()).append('\'');
        sb.append('}').append('\n');
        return sb.toString();
    }
}
