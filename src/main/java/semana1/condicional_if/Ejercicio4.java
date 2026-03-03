package semana1.condicional_if;

import java.sql.SQLOutput;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        Pide al usuario que introduzca una nota numérica (0-10). Clasifícala en:

        Insuficiente (menos de 5)
        Suficiente (de 5 a 6)
        Bien (de 6 a 7)
        Notable (de 7 a 9)
        Sobresaliente (9 o más)
         */

        float nota = 7;

        if (nota<5){
            System.out.println("Insuficiente");
        } else if (nota<=6) {
            System.out.println("Suficiente");
        } else if (nota<7) {
            System.out.println("Bien");
        } else if (nota<9) {
            System.out.println("Notable");
        } else if (nota<=10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("No hay resultados");
        }
    }
}
