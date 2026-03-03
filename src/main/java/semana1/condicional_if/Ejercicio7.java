package semana1.condicional_if;

public class Ejercicio7 {
    public static void main(String[] args) {

        int anio = 2000;

        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println("Bisiesto");
        } else {
            System.out.println("No bisiesto");
            /*
            En este ejericicio use esta logica, para determinar si un anio es bisiesto:

            Evaluo la operacion que esta entre parentesis el objetivo es saber si anio es divisible entre 4 y 100
            si la primera expresion es true pasa a evaluar la segunda expresion y si esta es true entonces negamos el resultado
            es decir sera false, que significa? si anio es divisible entre 100 siendo true entonces negamos el resultado debido que si
            anio es divisible entre 100 no puede ser bisiesto, pero si es divisible entre 400 puede ser la excepcion no importando que sea divisible entre 100.

            Entonces al convertir un resultado true a false de la segunda expresion de la operacion dentro de parentesis
            tendremos como resultado false de la operacion AND del parentesis y fuera del parentesis hacemos uso de OR porque si
            anio es divisible entre 400. Entonces tendremos una operacion: FALSE OR TRUE = TRUE, de esta forma
            podemos evaluar que anio es Bisiesto. Y si ese anio no es divisible entre 400 tendremos la siguiente operaicon:
            FALSE OR FALSE = FALSE, es decir ese anio no es bisiesto.

            Y si la operacion AND es true entonces automaticamente ese anio sera bisiesto. Porque? porque es divisible entre 4
            y no es divisible entre 100.

            porque cuando si es divisible entre 100 la condicion es que tambien sea divisible entre 400, para anular
            la divisibildad entre 100.
             */
        }
    }
}
