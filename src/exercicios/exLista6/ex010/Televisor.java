package exercicios.exLista6.ex010;

class Televisor {
    private int canal;
    private int volume;
    private final int CANAL_MIN = 1;
    private final int CANAL_MAX = 100;
    private final int VOLUME_MIN = 0;
    private final int VOLUME_MAX = 100;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal >= CANAL_MIN && novoCanal <= CANAL_MAX) {
            this.canal = novoCanal;
            System.out.printf("Canal alterado para: %d\n", canal);
        } else {
            System.out.println("Canal inválido! Use canais entre 1 e 100.");
        }
    }

    public void aumentarVolume() {
        if (volume < VOLUME_MAX) {
            volume++;
            System.out.printf("Volume: %d\n", volume);
        } else {
            System.out.println("Volume já está no máximo!");
        }
    }

    public void diminuirVolume() {
        if (volume > VOLUME_MIN) {
            volume--;
            System.out.printf("Volume: %d\n", volume);
        } else {
            System.out.println("Volume já está no mínimo!");
        }
    }

    public void definirVolume(int novoVolume) {
        if (novoVolume >= VOLUME_MIN && novoVolume <= VOLUME_MAX) {
            this.volume = novoVolume;
            System.out.printf("Volume definido para: %d\n", volume);
        } else {
            System.out.println("Volume inválido! Use valores entre 0 e 100.");
        }
    }

}