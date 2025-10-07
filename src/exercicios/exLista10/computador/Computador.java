package exercicios.exLista10.computador;

public class Computador extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    protected Gabinete gabinete;
    protected Teclado teclado;
    protected Mouse mouse;
    protected Monitor monitor;

    public Computador(float tensao, float consumo, String marca, String modelo, Gabinete gabinete, Teclado teclado, Mouse mouse, Monitor monitor) {
        super(tensao, consumo);
        this.marca = marca;
        this.modelo = modelo;
        this.gabinete = gabinete;
        this.teclado = teclado;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Gabinete getGabinete() {
        return gabinete;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== ESPECIFICAÇÕES DO COMPUTADOR =====\n");
        sb.append("Computador: ").append(marca).append(" ").append(modelo).append("\n");
        sb.append("Propriedades Elétricas: ").append(super.toString()).append("\n");
        sb.append("COMPONENTES:\n");
        sb.append(gabinete.toString()).append("\n");
        sb.append("PERIFÉRICOS:\n");
        sb.append("\t").append(monitor.toString()).append("\n");
        sb.append("\t").append(teclado.toString()).append("\n");
        sb.append("\t").append(mouse.toString()).append("\n");
        sb.append("========================================");
        return sb.toString();
    }
}
