package exercicios.exLista7.pinturaCone;

public class Cone {

    private final double RENDIMENTO_TINTA = 3.45;
    private final double LITROS_LATA = 18;
    private final double VALOR_TIPO1 = 238.90;
    private final double VALOR_TIPO2 = 467.98;
    private final double VALOR_TIPO3 = 758.34;
    private final static double PI = 3.14;

    private int tipo;
    private double raio;
    private double altura;

    public Cone() {
    }

    public Cone(int tipo, double altura, double raio) {
        setTipo(tipo);
        setAltura(altura);
        setRaio(raio);
    }

    public double getGeratriz() {
        return Math.sqrt((altura * altura) + (raio * raio));
    }

    public double getAreaBase() {
        return PI * raio * raio;
    }

    public double getAreaLateral() {
        return PI * raio * getGeratriz();
    }

    public double getAreaTotal() {
        return PI * raio * (getGeratriz() + raio);
    }

    public double getLitros() {
        return getAreaTotal() * RENDIMENTO_TINTA;
    }

    public long getLatas() {
        return (long) Math.ceil(getLitros() / LITROS_LATA);
    }

    public double getPrecoTotal() {
        switch (tipo) {
            case 1:
                return getLatas() * VALOR_TIPO1;
            case 2:
                return getLatas() * VALOR_TIPO2;
            case 3:
                return getLatas() * VALOR_TIPO3;
            default:
                return 0;
        }
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if (tipo >= 1 && tipo <= 3) {
            this.tipo = tipo;
        } else {
            System.out.println("Tipo inválido.");
            this.tipo = 0;
        }
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        final int TAMANHO_QUEBRA_LINHA = 30;
        String saida = "\n- Cone";
        saida += String.format("\nRaio: %f", getRaio());
        saida += String.format("\nAltura: %f", getAltura());
        saida += String.format("\nNível: %d", getTipo());
        saida += String.format("\n%s", "-".repeat(TAMANHO_QUEBRA_LINHA));
        saida += String.format("\nGeratriz: %f", getGeratriz());
        saida += String.format("\n%s", "-".repeat(TAMANHO_QUEBRA_LINHA));
        saida += String.format("\nÁrea do Fundo: %f", getAreaBase());
        saida += String.format("\nÁrea Lateral Cone: %f", getAreaLateral());
        saida += String.format("\nÁrea Total: %f", getAreaTotal());
        saida += String.format("\n%s", "-".repeat(TAMANHO_QUEBRA_LINHA));
        saida += String.format("\nLitros: %.3f", getLitros());
        saida += String.format("\nLatas: %d", getLatas());
        saida += String.format("\n%s", "-".repeat(TAMANHO_QUEBRA_LINHA));
        saida += String.format("\nPreço Total: R$ %f", getPrecoTotal());
        return saida;
    }
}