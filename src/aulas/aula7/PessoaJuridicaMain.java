package aulas.aula7;

public class PessoaJuridicaMain {
    public static void main(String[] args) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Nome empresa");
        pessoaJuridica.setCnpj("00.000.000/0001-00");
        System.out.println(pessoaJuridica);
    }
}
