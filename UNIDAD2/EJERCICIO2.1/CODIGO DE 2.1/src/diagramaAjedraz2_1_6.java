import java.util.Scanner;

public class diagramaAjedraz2_1_6 {

    public static void main(String[] args) {

               Scanner sc = new Scanner(System.in);
                String piece;
                System.out.println("Introduce la inicial del nombre de la pieza de ajedrez: ");
                        piece = sc.nextLine();
                if (piece.equalsIgnoreCase("R")){ //Rey
                    System.out.println("El Rey puede moverse en todas direcciones pero solo avanza una posición.");
                } else if (piece.equalsIgnoreCase("D")) { //Dama o reina
                    System.out.println("La Dama o reina puede moverse en todas las direcciones sin limite.");
                } else if (piece.equalsIgnoreCase("T")) { //Torre
                    System.out.println("La Torre puede moverse solo a lo ancho y largo pero nunca en diagonal, sin limite");
                } else if (piece.equalsIgnoreCase("A")) { //Alfil
                    System.out.println("El Alfil puede moverse solo en diagonal sin limite de casillas");
                } else if (piece.equalsIgnoreCase("C")) {//Caballo
                    System.out.println("El Caballo puede moverse a lo ancho o largo una casilla y a continuación una en diagonal.");
                } else if (piece.equalsIgnoreCase("P")) {//Peon
                    System.out.println("El peon mueve una sola casilla hacia adelante o unicamente 2 casilla hacia delante la primera vez que mueve.");
                } else {
                    System.out.println("Ha introducido un caracter no aceptable. Vuelva a intentarlo.");

                }
            }
        }