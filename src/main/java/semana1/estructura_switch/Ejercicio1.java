package semana1.estructura_switch;

public class Ejercicio1 {
    public static void main(String[] args) {

        /**
         * Ejercicio 1: Día de la semana
         * Crea un programa que reciba un número del 1 al 7 y muestre el nombre del día correspondiente
         * (1 = Lunes, 2 = Martes, etc.). Si el número no está en ese rango, muestra "Día inválido".
         */

        int dia = 4;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Ingrese un dia valor valido");
        }

    }


}
