package exercicios.exLista10.computador;

public class Main {
    public static void main(String[] args) {

        Processador proc = new Processador("Intel", "i7-12700K", 5.0f, 25f);
        Memoria mem = new Memoria("Corsair", "Vengeance RGB Pro", 16f, 3200f);
        HD hd = new HD("Seagate", "Barracuda", 2000f, 7200);

        PlacaMae placaMae = new PlacaMae("ASUS", "ROG Strix Z690-E", proc, hd, mem);

        Gabinete gabinete = new Gabinete("Corsair", "Mid-Tower", 4, placaMae);

        Monitor monitor = new Monitor("Dell", "LED", "2560x1440");
        Teclado teclado = new Teclado("Logitech", "Mecânico");
        Mouse mouse = new Mouse("Razer", "Óptico");

        Computador meuPC = new Computador(110f, 750f, "PC Custom", "Gamer Pro", gabinete, teclado, mouse, monitor);

        System.out.println(meuPC.toString());
    }
}