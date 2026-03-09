package semana1.bucle_for;

public class Ejercicio9 {
    public static void main(String[] args) {

        int acumulado = 1;
        int numero = 7;

        for (int i = numero; i > 0; i--) {
            acumulado *= i;

            System.out.println(acumulado);

        }

        /**
         * En este ejercicio se obtiene el factorial de N numero.
         *
         * primero acumulado vale 1, se hace 1 *= 7, este valor se guarda en la var
         * itereacion 2: var = 7, i = 6, se ejecuta 7 *= 6, se guarda valor en la var.
         * de esta forma itera hasta que la condicion del for es false
         */

    }

}
