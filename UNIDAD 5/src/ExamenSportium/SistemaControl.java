package ExamenSportium;

public class SistemaControl {

    void controlApuestas(CasaApuesta check){
        double sumaApuestas=0;

      try {


          for (int i = 0; i < check.apuestasDeportivas.length; i++) {

              if (check.apuestasDeportivas[i] <= 0.00) {
                  throw SportiumExcepcion.apuestaNegativa;
              }

              sumaApuestas += check.apuestasDeportivas[i];
              if (sumaApuestas > 1000000.00) {
                  throw SportiumExcepcion.pasadoLimite;
              }
          }
      }catch (SportiumExcepcion){}
    }

  //class
}
