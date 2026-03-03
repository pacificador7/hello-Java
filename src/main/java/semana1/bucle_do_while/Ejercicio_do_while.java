package semana1.bucle_do_while;

import java.util.Scanner;

public class Ejercicio_do_while {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String passwordCorrecta = "java2026";
        String intento;
        int contador = 0;
        int maxIntentos = 3;

        do {
            System.out.println("Ingresa la contrasena:");
            intento = scanner.nextLine();
            contador++;
            /*
            Aca iniciamos preguntando la contrasena, vamos a guardar la contrasena ingresada en la vairable
            intento, luego vamos a iniciar el contador esto es importante.
             */

            if (intento.equals(passwordCorrecta)) {
                System.out.println("Contrasena correcta! ");
                break;
                /*
                Aca usamos estructura if para saber si la contrasena ingresada es igual usando equals a la
                contrasena almacenada en el sistema, si es true entonces ingresa en la rama del if y imprime
                el mensaje de confirmacion.

                Importante ademas al confirmar que la contrasena es true entonces usamos break para que el
                programa salga del bucle, ya no es necesario que se ejecute la validacion del while.
                 */
            } else{
                System.out.println("Contrasena incorrecta! ");
                int intentosRestantes = maxIntentos - contador; // Ejm: 3-1 = intentosRestantes = 2.
                /*
                Aca se ejecuta la rama else si la contrasena ingresada no es igual a la registrada en el sistema
                ademas declaramos la variable Intentos... luego hacemos la resta a maxIntentos con el valor de contador
                de esta forma reducimos el valor de contador para poder crear una condicion dentro del while que nos
                permita identificar cuando ya el usuario no posee intentos.
                 */

                //Aca usamos un if anidado dentro del else.
                if (intentosRestantes > 0){ //Ejm: 2>0? True - se ejecuta rama if
                    System.out.println("Te quedan " + intentosRestantes + " intentos");
                    // Aca solo le mostramos al user la cantidad de intentos restantes.
                }else{
                    System.out.println("Cuenta bloqueada");
                    //Al intentosRestantes ser = a 0 se ejecutara la rama del else esto significa que la cuenta ha sido bloqueda
                }
            }
        } while(!intento.equals(passwordCorrecta) && contador < maxIntentos);

        /*
        Aca se necesita de alguna forma hacer 2 cosas en una sola

        1: Si la contrasena es invalida y aun hay intentos el bucle se debe iterar.
        2: Si la contrasena es valida se termine el bucle.

        Con el uso de AND &&, suponiendo que la contrasena es valida, entonces evalua la primera condicion
        cual sera False porque intento es igual al valor de password (Importante obervar el simbolo ! junto a intento)
        porque la primera condicion pregunta si el valor de intento es diferente al valor de password...
        en nuestro caso como intento tiene la contrasena correcta entonces esa condicion sera FALSE. Si el valor de
        intento fuera diferente de password... entonces la condicion seria TRUE.

        Nota: Al usar && y la primera condicion es False ya no evalua la segunda condicion debido a cortocircuito.

        Cuando el valor de intento es diferente de password... entonces la condicion sera TRUE, ahora pasa y evalua
        la segunda condicion y suponiendo que contador vale 1, 1<3? Si, entonces tenemos como resultado TRUE-TRUE lo cual
        es igual a True esto garantiza que el bucle itere hasta que ingrese con contrasena correcta o se acaben los intentos
         */
    }
}


