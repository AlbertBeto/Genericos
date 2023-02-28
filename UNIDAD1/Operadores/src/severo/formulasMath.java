package severo;

public class formulasMath {

    public static void main(String[] args) {

        int ladoCuadro = 5;
        int areaCuadro = ladoCuadro * ladoCuadro;

        int aRectangulo = 8;
        int bRectangulo = 4;
        int perimetroRectangulo = 2 * (aRectangulo + bRectangulo);

        int ladoTriangulo = 18;
        int alturaTriangulo = 15;
        double areaTriangulo = 0.5 * (ladoTriangulo * alturaTriangulo);

        double radioCirco = 7.5;
        double perimetroCirco = 2 * radioCirco * Math.PI;
        double areaCirco = Math.PI * radioCirco;

        System.out.println("El area del cuadrado es " + areaCuadro + "cm");
        System.out.println("El perimetro del rectangulo es " + perimetroRectangulo + "cm");
        System.out.println("El area del triangulo es " + areaTriangulo + "cm");
        System.out.println("El perimetro del circulo es " + perimetroCirco + "cm");
        System.out.println("El area del circulo es " + areaCirco + "cm");

    }
}
