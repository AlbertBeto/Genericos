import javax.management.MBeanAttributeInfo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DIASYHORAS {

    public static void main(String[] args) {
/*
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatted = formatter.format(fecha);
        System.out.println(formatted);
*/


        //Formato hora 24h
        LocalDateTime hora = LocalDateTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormato = formatoHora.format(hora);
        System.out.println(horaFormato);

        //Formato 12H
        LocalDateTime horaAMPM = LocalDateTime.now();
        DateTimeFormatter formatoHoraAMPM = DateTimeFormatter.ofPattern("hh:mm a");
        String horaFormatoAMPM = formatoHoraAMPM.format(hora);
        System.out.println(horaFormatoAMPM);



    }
}
