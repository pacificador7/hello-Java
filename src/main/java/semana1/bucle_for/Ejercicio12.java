package semana1.bucle_for;

public class Ejercicio12 {
    public static void main(String[] args) {

        int acumulador = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                acumulador += i;
            }
        }

        System.out.println(acumulador);

        /**
         * Primero creo el rango usando for, de 1 <= 20, luego creo una condicion para verificar si el numero de
         * cada iteracion es par, si es true entra en la rama if y se suma y acumula dentro de la var acumulador
         * los numeros pares.
         */
    }
}
