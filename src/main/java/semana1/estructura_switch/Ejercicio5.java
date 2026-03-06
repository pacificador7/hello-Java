package semana1.estructura_switch;

public class Ejercicio5 {
    public static void main(String[] args) {

        int puntaje = 23;
        int puntajeDiv = puntaje / 10;

        switch (puntajeDiv){
            case 10:
            case 9:
                double validacion = puntaje / 10.0;
                if(validacion > 10){
                    System.out.println("Nota no valida!");
                } else {
                    System.out.println("Tu nota es: " + "A");
                }
                break;
            case 8:
                System.out.println("Tu nota es: "+ "B");
                break;
            case 7:
                System.out.println("Tu nota es: "+ "C");
                break;
            case 6:
                System.out.println("Tu nota es: "+ "D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                double validacion1 = puntaje / 10.0;
                if(validacion1 < 0){
                    System.out.println("ERROR: nota no valida!");
                } else {
                    System.out.println("Tu nota es: "+ "F");
                }
                break;
            default:
                System.out.println("ERORR puntaje invalido");
        }

        /**
         * La dificultad de este ejercicio esta en encontrar una manera en la que el uso de esta estructura sea valido
         * esto como por ejemplo, si un estudiante tiene una puntuacion de 99 o 94 su nota es A, pero esta estructura
         * no acepta rangos. Entonces lo que hice fue dividir puntuacion / 10, de esta forma filtro nota como 98 o 91
         * en un solo caso, al dividirlo / 10 la var puntajeDiv almacenara un estado entero en este caso el residuo no nos
         * interesa ni los decimales de la opracion. Solo el valor entero. Entonces la operacion 90-99 / 10; tendra
         * como resultado 9 solo tomando el valor entero. con este valor podemos hacer uso de la estructura.
         *
         *
         */



    }
}
