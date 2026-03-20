package semana1.bucle_while;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j = 1;

        System.out.println("Ingresa un numero");
        int tabla = sc.nextInt();
        System.out.println("==========");

        while (j <= 10){
            System.out.println(tabla + " x " + j + " = " + (tabla * j));
            j++;
        }

    }
}
