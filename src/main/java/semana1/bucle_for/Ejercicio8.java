package semana1.bucle_for;

public class Ejercicio8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 60; i++){

//          if (i % 3 == 0){
//              if (i % 5 == 0){
//                  System.out.println("FizzBuzz " + i);
//              } else {
//                  System.out.println("Buzz " + i);
//              }
//          } else {
//              System.out.println("Fizz " + i);
//          }

          if (i % 5 == 0 && i % 3 == 0){
              System.out.println("FizzBuzz " + i);
          } else if (i % 5 == 0){
              System.out.println("Buzz " + i);
          } else if (i % 3 == 0){
              System.out.println("Fizz " + i);
          } else
              System.out.println(i);

        }

        /**
         * Este ejercicio fue interesante. debido que tuve problemas en la
         * interpretacion del enunciado.
         *
         * Con ayuda socrotica entendi que primero debia evaluar primero el caso especifico
         * usando una operacion compuesta, ademas esta es una intercepcion entre los conjuntos
         * de los casos generales.
         *
         * Pirmero se evalua el caso especifico si no es true, se evaluan los casos generales
         * si el primero no es true, se evalua el segundo.
         *
         * Si ninguna de los anteriores es true se ejecuta la rama else para
         * imprimir i cuando ninguna de las condiciones anteriores fue true.
         *
         * Cuando el enum cuando dice si ninguna condicion anterior, quiza hace referncia al operador
         * logico NOT.
         */
    }
}
