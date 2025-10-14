package exercicios.exLista10.carroMotorPessoa2;

import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDate;
import java.util.List;

public class PessoaListMain {
    public static void main(String[] args) {
        ListaPessoas listaPessoas = new ListaPessoas();

        LocalDate dataNascimento = LocalDate.of(1990, 12, 20);
        Pessoa pessoa = new Pessoa("Nome1", "email1@gmail.com", dataNascimento, "0000000000");
        listaPessoas.Adicionar(pessoa);

        dataNascimento = LocalDate.of(2005, 4, 20);
        pessoa = new Pessoa("NomE1", "email2@outlook.com", dataNascimento, "0000000000000");
        listaPessoas.Adicionar(pessoa);

        dataNascimento = LocalDate.of(1950, 5, 20);
        pessoa = new Pessoa("Nome3", "email3@gmail.com", dataNascimento, "0000000000000");
        listaPessoas.Adicionar(pessoa);

        System.out.println("=".repeat(100));
        System.out.println("\nListando todos");
        List<Pessoa> pessoas = listaPessoas.BuscarPessoas();

        for (Pessoa p : pessoas) {
            StringBuilder sb = new StringBuilder("");
            sb.append("Nome: ").append(p.getNome()).append(" | ");
            sb.append("Email: ").append(p.getEmail()).append(" | ");
            sb.append("Data de nascimento: ").append(p.getDataNascimento()).append(" | ");
            sb.append("Telefone: ").append(p.getTelefone());
            System.out.println(sb);
        }
        System.out.println("=".repeat(100));


        System.out.println("=".repeat(100));

        String dominioABuscar = "@ouTlook.com";
        List<Pessoa> buscarPorDominioEmail = listaPessoas.BuscarPorDominioEmail(dominioABuscar);
        System.out.printf("\nBuscando pelo dominio: %s \n", dominioABuscar);

        for (Pessoa p : buscarPorDominioEmail) {
            StringBuilder sb = new StringBuilder("");
            sb.append("Nome: ").append(p.getNome()).append(" | ");
            sb.append("Email: ").append(p.getEmail()).append(" | ");
            sb.append("Data de nascimento: ").append(p.getDataNascimento()).append(" | ");
            sb.append("Telefone: ").append(p.getTelefone());
            System.out.println(sb);
        }
        System.out.println("=".repeat(100));


    }
}
