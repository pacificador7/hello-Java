package semana1.bucle_for;

public class Ejercicio4 {
    public static void main(String[] args) {

        int acumulado = 0;

        for (int i = 1; i <= 100; i++){
//            acumulado = acumulado + i;
            acumulado += i;
            System.out.println(acumulado);
        }

        /**
         * Este ejercicio consta en hacer una suma acumulada, donde i comienza en 0
         * usamos una variable para guardar el valor que se acumulara.
         *
         * En esta var usamos el operador suma y asigna para en cada iteracion, sumar y asignar
         * el valor de i en la var acumulado.
         *
         * en la primera iteracion i = 1, acumulado = 0, se += 0 + 1 = 1.
         * acumualdo = 1.
         * se imprime el valor de la var.
         * se actualiza en 1 el valor de i.
         *
         * Iteracion 2
         * Ahora i vale 2
         *
         * acumulado tiene 1 acumulado, se += 2; 1 + 2 = 3; ahora la var tiene 3.
         *
         * De esta forma se va acumulando el valor en la var, cuando la condicion del for es
         * false se para la iteracion.
         *
         *
         */
    }
}
