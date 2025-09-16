package exercicios.exLista7.pinturaPiramide;

public class Piramide {

    private double ab;
    private double h;
    private int tipoTinta;

    private final double PRECO_TIPO1 = 127.90;
    private final double PRECO_TIPO2 = 258.98;
    private final double PRECO_TIPO3 = 344.34;
    private final double RENDIMENTO_POR_LITRO = 4.76;
    private final double LITROS_LATA = 18.0;

    public Piramide() {

    }

    public Piramide(double ab, double h, int tipoTinta) {
        this.setAb(ab);
        this.setH(h);
        this.setTipoTinta(tipoTinta);
    }

    public double getAl() {
        return Math.sqrt((h * h) + (ab * ab));
    }

    public double getAreaTriangulo() {
        return ab * getAl();
    }

    public double getAreaBase() {
        double ladoBase = 2 * ab;
        return ladoBase * ladoBase;
    }

    public double getAreaTotal() {
        return getAreaBase() + (4 * getAreaTriangulo());
    }

    public double getVolume() {
        return (getAreaBase() * h) / 3.0;
    }

    public double getLitros() {
        return getAreaTotal() / RENDIMENTO_POR_LITRO;
    }

    public long getLatas() {
        return (long) Math.ceil(getLitros() / LITROS_LATA);
    }

    public double getPreco() {
        switch (tipoTinta) {
            case 1:
                return getLatas() * PRECO_TIPO1;
            case 2:
                return getLatas() * PRECO_TIPO2;
            case 3:
                return getLatas() * PRECO_TIPO3;
            default:
                return 0;
        }
    }

    // Getters e Setters
    public double getAb() {
        return ab;
    }

    public void setAb(double ab) {
        this.ab = ab;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public int getTipoTinta() {
        return tipoTinta;
    }

    public void setTipoTinta(int tipoTinta) {
        this.tipoTinta = tipoTinta;
    }

    @Override
    public String toString() {
        return "ab: " + getAb() +
                "\nh: " + getH() +
                "\nal: " + getAl() +
                "\nÁrea Triângulo: " + getAreaTriangulo() +
                "\nÁrea Base: " + getAreaBase() +
                "\nÁrea Total: " + getAreaTotal() +
                "\nTipo de Tinta: " + getTipoTinta() +
                "\nLitros: " + getLitros() +
                "\nLatas: " + getLatas() +
                "\nPreço: " + getPreco() +
                "\nVolume: " + getVolume();
    }
}