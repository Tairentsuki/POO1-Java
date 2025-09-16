package aulas.aula6.exercicios;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Exercicios {
    private static final LocalDate[] FERIADOS = {
            LocalDate.parse("2025-09-07"),
            LocalDate.parse("2025-10-12"),
            LocalDate.parse("2025-10-27"),
            LocalDate.parse("2025-11-02")
    };


    public static int Ex001ContarSabadosEDomingos(String dataInicial, String dataFinal) {
        LocalDate dataInicio = LocalDate.parse(dataInicial);
        LocalDate dataFim = LocalDate.parse(dataFinal);
        LocalDate dataAux = dataInicio;
        int contagemSabadosEDomingos = 0;

        while (dataAux.isBefore(dataFim)) {

            DayOfWeek diaSemana = dataAux.getDayOfWeek();

            switch (diaSemana) {
                case SUNDAY, SATURDAY -> contagemSabadosEDomingos++;
            }
            dataAux = dataAux.plusDays(1);
        }
        return contagemSabadosEDomingos;
    }

    public static int Ex002DiasUteis(String dataInicial, String dataFinal) {
        LocalDate dataInicio = LocalDate.parse(dataInicial);
        LocalDate dataFim = LocalDate.parse(dataFinal);
        LocalDate dataAux = dataInicio;

        int contDiasUteis = 0;

        while (dataAux.isBefore(dataFim)) {

            for (LocalDate feriado : FERIADOS) {
                if (!dataAux.isEqual(feriado)) {
                    contDiasUteis++;
                }
            }


//            System.out.println(dataAux);
//            System.out.println(feriados[0]);
//            System.out.println(contDiasUteis);
//            System.out.printf("%s\n", "=".repeat(50));
            dataAux = dataAux.plusDays(1);
        }

        return contDiasUteis;
    }

}
