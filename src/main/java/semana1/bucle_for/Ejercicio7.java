package semana1.bucle_for;

public class Ejercicio7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * El flujo de este ejercicio es insterasnte: debido que al momento de analizar la solucion no lo tenia
         * fresco en mente.
         *
         * El primer for externo es el encargado de las filas, el for interno es el encargado de las columnas, este
         * concepto aun no lo comprendo del todo, es decir que significa que uno se encargue de las filas o columnas
         *.
         * sobre el flujo primero se activa el for externo, entra en el for interno y aqui comienza a iterar el for
         * interno hasta que se completa la condicion o es false, en esta primera vuelta solo hace 1 iteraciones
         * en la primera imprime * y intenta hacer una segunda pero en esta la condicion es false, entonces sale del bucle interno y ejecuta
         * un salto de linea, luego se actualiza i del for externo ahora vale 2, y entra nuevamente en el bucle interno
         * hace 2 iteraciones en cada una imprime * debido que estamos usando print sin salto de linea, por eso
         * lo escribe en la misma linea, no logra hacer una 3er iteracion porque la condicion es false y sale del bucle. este proceso
         * se repite hasta que la condicion del bucle externo es false. Algo importante es que ignore que al cada nueva
         * iteracion al entrar al bucle interno el valor de j se reestablecia a su valor declarado.
         *
         */
    }
}
