package aulas.aula6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExData14 {
    public static void main(String[] args) {
        DateTimeFormatter dtfDataHoraBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime dt = LocalDateTime.parse("24/04/1978 15:01:27", dtfDataHoraBrasil);
        System.out.println(dt);

    }
}
