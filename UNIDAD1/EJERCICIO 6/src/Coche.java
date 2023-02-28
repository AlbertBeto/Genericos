public class Coche {

    //atributos, campos
    int numRuedas;
    String color;
    int caballos;
    String modelo;
    String marca;


    //acciones, comportamientos
        //Le das orden
    public void arrancar(){
        System.out.println("El coche ha arrancado");
    }

    public void frenar (){}

    public void deposito_lleno (){}

    public static void main(String[] args) {
        //construir un objeto de la clase coche
        // instanciar o instancia de clase
        Coche ford = new Coche();
        ford.caballos = 90;
        ford.color = "Negro";
        ford.marca = "Audi";
        ford.modelo = "A3";

        ford.arrancar();


        //hijo o objeto heredado
        Coche opel = new Coche();




    }
}
