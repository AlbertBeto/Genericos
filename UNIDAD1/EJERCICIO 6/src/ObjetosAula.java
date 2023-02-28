public class ObjetosAula {

boolean electrico;
String color;
boolean botones;

    public void presionarBoton() {}
    public void encenderAlimentacion() {}
    public void degeneracionColor() {}



    public static void main(String[] args) {

    ObjetosAula silla = new ObjetosAula();
    silla.electrico = false;
    silla.botones = false;
    silla.color = "Pino";

    ObjetosAula teclado = new ObjetosAula();
    teclado.electrico = true;
    teclado.color = "Negro";
    teclado.botones = true;

    ObjetosAula ventilador = new ObjetosAula();
    ventilador.botones = false;
    ventilador.color= "Blanco";
    ventilador.electrico = true;

                          }

    }
