package exercicios.exLista6.ex004;

class FolhaPagamento {
    // Constantes para os descontos
    private static final double ALIQUOTA_IR = 0.11;
    private static final double ALIQUOTA_INSS = 0.08;
    private static final double ALIQUOTA_SINDICATO = 0.05;

    private double valorHora;
    private double horasTrabalhadas;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioBruto() {
        return valorHora * horasTrabalhadas;
    }

    public double getIR() {
        return getSalarioBruto() * ALIQUOTA_IR;
    }

    public double getINSS() {
        return getSalarioBruto() * ALIQUOTA_INSS;
    }

    public double getSindicato() {
        return getSalarioBruto() * ALIQUOTA_SINDICATO;
    }

    public double getTotalDescontos() {
        return getIR() + getINSS() + getSindicato();
    }

    public double getSalarioLiquido() {
        return getSalarioBruto() - getTotalDescontos();
    }

    public void mostrarResumo() {
        System.out.printf("+ Salário Bruto : R$ %.2f\n", getSalarioBruto());
        System.out.printf("- IR (11%%)      : R$ %.2f\n", getIR());
        System.out.printf("- INSS (8%%)    : R$ %.2f\n", getINSS());
        System.out.printf("- Sindicato (5%%): R$ %.2f\n", getSindicato());
        System.out.printf("= Salário Líquido: R$ %.2f\n", getSalarioLiquido());
    }
}
