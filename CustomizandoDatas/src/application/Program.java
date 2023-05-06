package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

//Customizando datas
        LocalDate d12 = LocalDate.parse("2023-05-02");
        LocalDateTime d13 = LocalDateTime.parse("2023-05-02T19:52:45");
        Instant d14 = Instant.parse("2023-05-02T19:52:45Z");

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());


        System.out.println();
        System.out.println("*** Imprimindo datas customizadas ***");
        System.out.println("d12 = "+fmt3.format(d12));
        System.out.println("d13 = "+fmt4.format(d13));
        System.out.println("d14 = "+fmt5.format(d14));

    }
}
