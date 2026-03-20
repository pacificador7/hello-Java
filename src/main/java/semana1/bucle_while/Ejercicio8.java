package semana1.bucle_while;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;

        System.out.println("Ingresa un numero");
        int num = sc.nextInt();

        if (num >= 1) {
            while ( i < num ){
                i++;
            }
            System.out.println(i);

        } else {
            System.out.println("Error");
        }

    }

}
