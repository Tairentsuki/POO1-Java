package exercicios.exLista9.pessoas;

public class PessoaFisicaMain {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("nome", "000.000.000-00", "endereco");
        pessoaFisica.setEstadoCivil("Solteiro");
        System.out.println(pessoaFisica);
    }
}
