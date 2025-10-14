package exercicios.exLista10.homeTheater;

public class HomeTheater {
    protected SistemaDeSom som;
    protected SistemaDeVideo video;

    public HomeTheater() {
        som = new SistemaDeSom();
        video = new SistemaDeVideo();
    }

    public SistemaDeSom getSom() {
        return som;
    }

    public void setSom(SistemaDeSom som) {
        this.som = som;
    }

    public SistemaDeVideo getVideo() {
        return video;
    }

    public void setVideo(SistemaDeVideo video) {
        this.video = video;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Home Theater [").append(super.toString());
        sb.append(", Som: {").append(som.toString());
        sb.append("}, Vídeo: {").append(video.toString());
        sb.append("}]");
        return sb.toString();
    }
}
