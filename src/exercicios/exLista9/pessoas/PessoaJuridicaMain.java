package exercicios.exLista9.pessoas;

public class PessoaJuridicaMain {
    public static void main(String[] args) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica("nome", "00.000.000/0000-00", "tipoEmpresa");
        pessoaJuridica.setEndereco("Endereço");
        System.out.println(pessoaJuridica);
    }
}
