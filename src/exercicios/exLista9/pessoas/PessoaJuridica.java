package exercicios.exLista9.pessoas;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String tipoEmpresa;

    public PessoaJuridica(String nome){
        super(nome);
    }

    public PessoaJuridica(String nome, String cnpj){
        super(nome);
        setCnpj(cnpj);
    }

    public PessoaJuridica(String nome, String cnpj, String tipoEmpresa){
        super(nome);
        setCnpj(cnpj);
        setTipoEmpresa(tipoEmpresa);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if(cnpj.length() > 14){
            this.cnpj = cnpj;
        }
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        if(tipoEmpresa.length() > 1){
            this.tipoEmpresa = tipoEmpresa;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PessoaJuridica{");
        sb.append("cnpj='").append(cnpj).append('\'');
        sb.append(", tipoEmpresa='").append(tipoEmpresa).append('\'');
        sb.append('}').append("\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
