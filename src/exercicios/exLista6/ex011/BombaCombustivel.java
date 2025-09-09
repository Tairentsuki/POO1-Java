package exercicios.exLista6.ex011;

class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.printf("Foram abastecidos %.2f litros\n", litros);
            System.out.printf("Combustível restante na bomba: %.2f litros\n", quantidadeCombustivel);
        } else {
            System.out.println("Combustível insuficiente na bomba!");
        }
    }

    public void abastecerPorLitro(double litros) {
        if (litros <= quantidadeCombustivel) {
            double valor = litros * valorLitro;
            quantidadeCombustivel -= litros;
            System.out.printf("Valor a pagar: R$ %.2f\n", valor);
            System.out.printf("Combustível restante na bomba: %.2f litros\n", quantidadeCombustivel);
        } else {
            System.out.println("Combustível insuficiente na bomba!");
        }
    }

    public void alterarValor(double novoValor) {
        this.valorLitro = novoValor;
        System.out.printf("Valor do litro alterado para: R$ %.2f\n", valorLitro);
    }

    public void alterarCombustivel(String novoCombustivel) {
        this.tipoCombustivel = novoCombustivel;
        System.out.printf("Tipo de combustível alterado para: %s\n", tipoCombustivel);
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
        System.out.printf("Quantidade de combustível alterada para: %.2f litros\n", quantidadeCombustivel);
    }
}
