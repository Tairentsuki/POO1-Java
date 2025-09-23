package exercicios.exLista9.item;

public class Livro extends Item {
    private String autor;

    public Livro(int codigo){
        super(codigo);
    }

    public Livro(int codigo, String autor){
        super(codigo);
        setAutor(autor);
    }

    public Livro(int codigo, String autor, String descricao){
        super(codigo, descricao);
        setAutor(autor);
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor.length() > 3){
            this.autor = autor;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro{");
        sb.append("autor='").append(autor).append('\'');
        sb.append('}').append("\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
