package exercicios.exLista6.ex005;

class Cardapio {
    private Item[] itens = new Item[106];

    public void declararItens() {
        itens[100] = new Item();
        itens[100].setCodigo(100);
        itens[100].setEspecificacao("Cachorro Quente");
        itens[100].setPreco(1.20f);

        itens[101] = new Item();
        itens[101].setCodigo(101);
        itens[101].setEspecificacao("Bauru Simples");
        itens[101].setPreco(1.30f);

        itens[102] = new Item();
        itens[102].setCodigo(102);
        itens[102].setEspecificacao("Bauru com ovo");
        itens[102].setPreco(1.50f);

        itens[103] = new Item();
        itens[103].setCodigo(103);
        itens[103].setEspecificacao("Hambúrguer");
        itens[103].setPreco(1.20f);

        itens[104] = new Item();
        itens[104].setCodigo(104);
        itens[104].setEspecificacao("Cheeseburguer");
        itens[104].setPreco(1.30f);

        itens[105] = new Item();
        itens[105].setCodigo(105);
        itens[105].setEspecificacao("Refrigerante");
        itens[105].setPreco(1.00f);
    }

    public double buscarPreco(int codigo) {
        if (codigo >= 0 && codigo < itens.length && itens[codigo] != null) {
            return itens[codigo].getPreco();
        }
        return 0.0;
    }
}