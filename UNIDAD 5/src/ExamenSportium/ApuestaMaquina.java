package ExamenSportium;

public class ApuestaMaquina extends Apuesta{
    private String numeroMaquina;

    public ApuestaMaquina( double importe, double cuota, String numeroMaquina) {
        super("Maquina", importe, cuota, 21);
        this.numeroMaquina = numeroMaquina;
    }

    @Override
    public double calcularCosteApuesta() {
        double costeFinal=(((getImporte()*getCuota())*getImpuestos())/100)+(getImporte()*getCuota());
        System.out.println("El tipo de apuesta realizado es "+getTipo()+" con un coste total de "+costeFinal+". Realizado en la maquina "+numeroMaquina);
        return costeFinal;
    }

    //class
}
