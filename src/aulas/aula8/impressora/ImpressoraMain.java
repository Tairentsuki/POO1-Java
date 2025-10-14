package aulas.aula8.impressora;

public class ImpressoraMain {
    public static void main(String[] args) {
        Documento documento = new Documento("Hello World!");
        Impressora impressora = new Impressora();

        impressora.Imprimir(documento);
    }
}
