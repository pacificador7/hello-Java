package semana1.estructura_switch;

public class Ejercicio3 {
    public static void main(String[] args) {

        int mes =9;

        switch(mes){
            case 12:
            case 1:
            case 2:
                System.out.println("Invierno");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Verano");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Otono");
                break;
            default:
                System.out.println("Ingresa un mes valido!");

        }
    }
}
