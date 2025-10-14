package aulas.aula8.impressora;

public class Documento {
    private String texto;

    public Documento(String texto) {
        setTexto(texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        if (!texto.trim().isEmpty()) {
            this.texto = texto;
        } else {
            this.texto = "Documento Padrão.";
        }
    }
}
