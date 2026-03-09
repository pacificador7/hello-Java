package semana1.bucle_for;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + numero * i);
        }

        /**
         * Aca solo se hace una calculadora
         *
         * numero tiene un valor constante, i va incrementando en 1 hasta que la condicion es false
         *
         */
    }
}
