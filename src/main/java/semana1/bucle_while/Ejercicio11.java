package semana1.bucle_while;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int num = sc.nextInt();
        System.out.println("Ingresa un numero");
        int num2 = sc.nextInt();
        System.out.println("============");

        if (num < num2){
            while ( num <= num2){
                System.out.println(num);
                num++;
            }
        } else {
            while ( num >= num2){
                System.out.println(num);
                num--;
            }
        }

        }

    }

