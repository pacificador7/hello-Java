package semana1.estructura_switch;

import java.sql.SQLOutput;

public class Ejercicio6 {
    public static void main(String[] args) {

        System.out.println("Entradas: 1. Pan con ajo, 2. Nachos, 3. Papas");
        System.out.println("Platos fuertes: 1. Carne 2. Sopa 3. Costilla bbq");
        System.out.println("Postres: 1. Tres leches 2. Flan 3. Helado");
        System.out.println("Bebidas: 1. Soda 2. Cerveza 3. Jugo naranja");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        int categoria = 2;
        int item = 3;

        switch (categoria) {
            case 1:
                System.out.println("Entradas");
                switch (item) {
                    case 1:
                        System.out.println("Pan con ajo");
                        break;
                    case 2:
                        System.out.println("Nachos");
                        break;
                    case 3:
                        System.out.println("Papas");
                        break;
                    default:
                        System.out.println("Error");
                }
                break;
            case 2:
                System.out.println("Platos fuertes");
                switch (item) {
                    case 1:
                        System.out.println("Carne");
                        break;
                    case 2:
                        System.out.println("Sopa");
                        break;
                    case 3:
                        System.out.println("Costilla");
                        break;
                    default:
                        System.out.println("Error");
                }
                break;
            case 3:
                System.out.println("Postres");
                switch (item) {
                    case 1:
                        System.out.println("Tres leches");
                        break;
                    case 2:
                        System.out.println("Flan");
                        break;
                    case 3:
                        System.out.println("Helado");
                        break;
                    default:
                        System.out.println("Error");
                }
                break;
            case 4:
                System.out.println("Bebidas");
                switch (item) {
                    case 1:
                        System.out.println("Soda");
                        break;
                    case 2:
                        System.out.println("Cerveza");
                        break;
                    case 3:
                        System.out.println("Jugo naranja");
                        break;
                    default:
                        System.out.println("Error");
                }
                break;
                default:
                    System.out.println("Categoria invalida");
        }


    }

}