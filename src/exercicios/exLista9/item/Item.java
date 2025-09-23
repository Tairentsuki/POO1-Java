package exercicios.exLista9.item;

public class Item {
    private int codigo;
    private String descricao;

    public Item(int codigo){
        setCodigo(codigo);
    }

    public Item(int codigo, String descricao){
        setCodigo(codigo);
        setDescricao(descricao);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo >= 0){
            this.codigo = codigo;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.length() > 3){
            this.descricao = descricao;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("codigo=").append(codigo);
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
