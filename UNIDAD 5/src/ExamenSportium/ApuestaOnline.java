package ExamenSportium;

public class ApuestaOnline extends Apuesta implements Puntuable{

    private double tasaWeb;
    private int puntosOnline;

    public ApuestaOnline(double importe, double cuota, double tasaWeb) {
        super("Online", importe, cuota,0);
        this.tasaWeb=tasaWeb;
    }

    @Override
    public double calcularCosteApuesta() {
        double costeFinal=(getImporte()*getCuota())+tasaWeb;
        System.out.println("El tipo de apuesta realizado es "+getTipo()+" con un coste total de "+costeFinal+" en los que se incluyen "+tasaWeb+" de tasa Web.");
        calculaPuntos((int)costeFinal);
        System.out.println("Tienes acumulados "+puntosOnline+" puntos Online!!");
        return costeFinal;
    }

    @Override
    public int calculaPuntos(int costefinal) {
        int puntos= fijoPuntos*costefinal;
        puntosOnline +=puntos;
        return puntos;
    }

    //class
}
