package semana1.condicional_if;

public class Ejercicio9 {
    public static void main(String[] args) {

        int numero = 3;
        int numUser = 3;



/*
 if (numUser == numero && (numUser >= 0 && numUser <= 10)) {
            System.out.println("Felicidades acertaste el numero!");
        } else if (numUser > numero && (numUser >= 0 && numUser <= 10)) {
            System.out.println("Te pasaste, el numero es mas bajo!");
        } else if (numUser < numero && (numUser >= 0 && numUser <= 10)) {
            System.out.println("Te falta, el numero es mas alto!");
        } else {
            System.out.println("Numero invalido!");
        }
*/
        if (numUser >= 0 && numUser <= 10) {
            if (numUser == numero) {
                System.out.println("Felicidades acertaste el numero!");
            } else if (numUser > numero) {
                System.out.println("Te pasaste, el numero es mas bajo!");
            } else if (numUser < numero) {
                System.out.println("Te falta, el numero es mas alto!");
            }
        } else{
            System.out.println("Numero invalido!");
        }

        /**
         * En este ejercicio use dos forma de resolver este problema
         *
         * En el 1ro use una estructura if haciendo uso de else if para tener mas de una alternativa de una condicion true
         * ademas hago uso de los parentesis en cada alternativa para primero validar que el numero este en el rango de 1 - 10, si esa
         * condicion es true entonces se revisa si cumple la condicion fuera de los parentesis en este caso en tadas las alternativas else if
         * primero evaluo la operacion relacional, esta forma se me ocurrio, pero de que otra manera lo pude hacer manteniendo
         * esta estructura else if?
         *
         * En la segunda forma use if anidados donde primero evaluo si el numero del usuario cumple la condicion de
         * estar dentro del rango, si es true entonces hago uso de else if solo para evaluar si el numero del usuario
         * si cumple alguna condicion, esta segunda forma haciendo uso de if anidado y else if me gusto porque pongo en practica
         * un if anidado y ademas creo que hago menos operaciones redundantes.
         */
    }
}
