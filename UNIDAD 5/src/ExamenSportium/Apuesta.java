package ExamenSportium;

public abstract class Apuesta {
    private String tipo;

    private double importe;

    private double cuota;

    private double impuestos;

    public Apuesta(String tipo, double importe, double cuota, double impuestos) {
        this.tipo = tipo;
        this.importe = importe;
        this.cuota = cuota;
        this.impuestos = impuestos;
    }

    public double calcularCosteApuesta(){
        double costeFinal=(((importe*cuota)*impuestos)/100)+(importe*cuota);
        System.out.println("El tipo de apuesta realizado es "+tipo+" con un coste total de "+costeFinal);
        return costeFinal;
    }

    public double getImporte() {
        return importe;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCuota() {
        return cuota;
    }

    public double getImpuestos() {
        return impuestos;
    }

    //class
}
