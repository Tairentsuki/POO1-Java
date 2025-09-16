package exercicios.exLista7.pinturaCubo;

public class Cubo {

    private double a;
    private double rendimento;
    private int tipoTinta;

    private final double PRECO_TIPO1 = 101.90;
    private final double PRECO_TIPO2 = 212.45;
    private final double PRECO_TIPO3 = 345.56;
    private final double LITROS_POR_LATA = 18.0;

    public Cubo() {
    }

    public Cubo(double a, double rendimento, int tipoTinta) {
        this.setA(a);
        this.setRendimento(rendimento);
        this.setTipoTinta(tipoTinta);
    }

    public double getAreaBase() {
        return this.a * this.a;
    }

    public double getAreaTotal() {
        return 6 * getAreaBase();
    }

    public double getVolume() {
        return Math.pow(this.a, 3);
    }

    public double getDiagonal() {
        return this.a * Math.sqrt(3);
    }

    public double getLitrosDeTinta() {
        return getAreaTotal() / this.rendimento;
    }

    public double getLatasDeTinta() {
        return Math.ceil(getLitrosDeTinta() / LITROS_POR_LATA);
    }

    public double getValorTotal() {
        switch (this.tipoTinta) {
            case 1:
                return getLatasDeTinta() * PRECO_TIPO1;
            case 2:
                return getLatasDeTinta() * PRECO_TIPO2;
            case 3:
                return getLatasDeTinta() * PRECO_TIPO3;
            default:
                return 0;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0) {
            this.a = a;
        } else {
            System.out.println("O lado 'a' deve ser um valor positivo.");
            this.a = 0;
        }
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        if (rendimento > 0) {
            this.rendimento = rendimento;
        } else {
            System.out.println("O rendimento deve ser um valor positivo.");
            this.rendimento = 0;
        }
    }

    public int getTipoTinta() {
        return tipoTinta;
    }

    public void setTipoTinta(int tipoTinta) {
        if (tipoTinta >= 1 && tipoTinta <= 3) {
            this.tipoTinta = tipoTinta;
        } else {
            System.out.println("Tipo de tinta inválido. Use 1, 2 ou 3.");
            this.tipoTinta = 0;
        }
    }

    @Override
    public String toString() {
        return "a: " + this.getA() +
                "\nRendimento: " + this.getRendimento() +
                "\nTipo de Tinta: " + this.getTipoTinta() +
                "\nÁrea da Base: " + this.getAreaBase() +
                "\nÁrea Total: " + this.getAreaTotal() +
                "\nVolume: " + this.getVolume() +
                "\nDiagonal do Cubo: " + this.getDiagonal() +
                "\nLitros de Tinta: " + this.getLitrosDeTinta() +
                "\nLatas de Tinta: " + this.getLatasDeTinta() +
                "\nValor Total: " + this.getValorTotal();
    }
}