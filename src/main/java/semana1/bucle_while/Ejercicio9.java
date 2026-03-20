package semana1.bucle_while;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acumulador = 0;
        int i = 1;

        System.out.println("Ingresa un numero");
        int num = sc.nextInt();

        if (num >= 1) {
            while ( i <= num ){
                acumulador += i;
                i++;
            }
            System.out.println(acumulador);

        } else {
            System.out.println("Error");
        }
    }
}
