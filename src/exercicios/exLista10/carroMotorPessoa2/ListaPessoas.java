package exercicios.exLista10.carroMotorPessoa2;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {

    private List<Pessoa> lista = new ArrayList<Pessoa>();

    public void Adicionar(Pessoa pessoa) {
        boolean existeNome = false;
        for(Pessoa p : lista){
            if(p.getNome().equals(pessoa.getNome())){
                existeNome = true;
                break;
            }
        }
        if(!existeNome){
            lista.add(pessoa);

        }

    }

    public List<Pessoa> BuscarPessoas(){
        return lista;
    }

    public List<Pessoa> BuscarPorDominioEmail(String dominioABuscar){
        List<Pessoa> filtroEmail = new ArrayList<Pessoa>();
        for(Pessoa p : lista){
            if(p.getEmail().contains(dominioABuscar)){
                filtroEmail.add(p);
            }
        }
        return filtroEmail;
    }

}
