package desafios.Aula4;

public class Quadrado {
    private int lado = 1;
    private String cor = "Azul";

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        if (lado > 0) {
            this.lado = lado;
        }
    }

    public String getCor() {
        return cor;

    }

    public void setCor(String cor) {
        if (cor.length() >= 4) {
            this.cor = cor;
        }
    }

    public int perimetro(){
        return 4 * lado;
    }

    public int area(){
        return lado * lado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Quadrado{");
        sb.append('}');
        return sb.toString();
    }
}
