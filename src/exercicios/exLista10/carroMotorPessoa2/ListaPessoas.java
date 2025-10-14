package exercicios.exLista10.carroMotorPessoa2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {

    private List<Pessoa> lista = new ArrayList<Pessoa>();

    public void Adicionar(Pessoa pessoa) {
        if (existeNome(pessoa.getNome())) {
            lista.add(pessoa);
        }
    }

    public boolean existeNome(Pessoa pessoa) {
        for (Pessoa p : lista) {
            if (p.getNome().equals(pessoa.getNome())) {
                return false;
            }
        }
        return true;
    }

    public boolean existeNome(String nome) {
        for (Pessoa p : lista) {
            if (p.getNome().toUpperCase().equals(nome.toUpperCase())){
                return false;
            }
        }
        return true;
    }

    public List<Pessoa> BuscarPessoas() {
        return lista;
    }

    public List<Pessoa> BuscarPorDominioEmail(String dominioABuscar) {
        List<Pessoa> filtroEmail = new ArrayList<Pessoa>();
        for (Pessoa p : lista) {
            if (p.getEmail().toUpperCase().contains(dominioABuscar.toUpperCase())) {
                filtroEmail.add(p);
            }
        }
        return filtroEmail;
    }

    public List<Pessoa> AniversariantesMes(LocalDate DataAniversario) {
        DataAniversario.getMonth()
        List<Pessoa> filtroEmail = new ArrayList<Pessoa>();
        for (Pessoa p : lista) {
            if (p.getEmail().toUpperCase().contains(dominioABuscar.toUpperCase())) {
                filtroEmail.add(p);
            }
        }
        return filtroEmail;
    }
}
