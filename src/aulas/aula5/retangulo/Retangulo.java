package aulas.aula5.retangulo;

public class Retangulo {
    private int ladoA;
    private int ladoB;
    private String cor;


    public Retangulo(String cor) {
        setCor(cor);
    }

    public Retangulo(int ladoA, int ladoB, String cor) {
        setLadoA(ladoA);
        setLadoB(ladoB);
        setCor(cor);
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Retangulo{");
        sb.append("ladoA=").append(ladoA);
        sb.append(", ladoB=").append(ladoB);
        sb.append(", cor='").append(cor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
