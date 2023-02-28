package ExamenSportium;

public class MainApuesta {

    public static void main(String[] args) {

        Apuesta lunes = new ApuestaFisica(100,2);

        lunes.calcularCosteApuesta();

lunes = new ApuestaOnline(100,2,3);

        lunes.calcularCosteApuesta();

      lunes=new ApuestaMaquina(100,2,"A22");

        lunes.calcularCosteApuesta();
//main
    }

    //class
}
