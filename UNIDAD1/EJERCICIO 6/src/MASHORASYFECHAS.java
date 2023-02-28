import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MASHORASYFECHAS {
    public static void main(String[] args) {

/*
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatted = formatter.format(fecha);
        System.out.println(formatted);


        //Formato hora 24h
        LocalDateTime hora = LocalDateTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormato = formatoHora.format(hora);
        System.out.println(horaFormato);

        //Formato 12H
        LocalDateTime horaAMPM = LocalDateTime.now();
        DateTimeFormatter formatoHoraAMPM = DateTimeFormatter.ofPattern("hh:mm a");
        String horaFormatoAMPM = formatoHoraAMPM.format(horaAMPM);
        System.out.println(horaFormatoAMPM);
*/
        LocalDateTime fecha2 = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("E");
        String formatted2 = formatter2.format(fecha2);
        System.out.println("Hoy es " + formatted2);

        LocalDate fechaDeHoy = LocalDate.now();
        int diaMesHoy = fechaDeHoy.getDayOfMonth();
        int manana = diaMesHoy + 1;
        System.out.println("Mañana es " + manana);






    }
}
