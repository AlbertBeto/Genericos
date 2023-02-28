public class llamadorClases {
    public static void main(String[] args) {
        Calculadora calculator = new Calculadora ();
        calculator.setPrimerNumero(5.0);
        calculator.setSegundoNumero(4);
        System.out.println("suma= " + calculator.getResultadoSuma());
        System.out.println("resta= " + calculator. getResultadoResta ());
        calculator.setPrimerNumero(5.25);
        calculator.setSegundoNumero(0);
        System.out.println("multiplicación= " +
                calculator.getMultiplicationResult());
        System.out.println("división= " + calculator.getDivisionResult());



        Persona persona = new Persona();
        persona.setNombre(""); // nombre is set to empty string
        persona.setApellido(""); // apellido is set to empty string
        persona.setEdad(10);
        System.out.println("fullName= " + persona.getFullName());
        System.out.println("adolescente= " + persona.esAdolescente());
        persona.setNombre("Patri"); // nombre is set to Patri
        persona.setEdad(18);
        System.out.println("fullName= " + persona.getFullName());
        System.out.println("adolescente = " + persona. esAdolescente ());
        persona.setApellido("Guerrero"); // se establece apellido a Guerrero
        System.out.println("fullName= " + persona.getFullName());

    }
}
