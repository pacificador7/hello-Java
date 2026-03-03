package semana1.bucle_while;

public class Ejercicio_while_1 {
    public static void main(String[] args) {
        int numero = 12345;
        int i = 0;

        while (numero >= 1 ) {
            numero = numero / 10;
            i ++;
        }
        System.out.println("El numero ingresado tiene " + i + " digitos");
        }
    }

    /*
    Explicacion de resolucion:

    Primero analizo una condicion que sea true y me permita entrar al codigo de bucle para usar alguna operacion
    que decremente el valor de numero hasta llegar a cero y cuando sea 0 ya no me permita entrar en el codigo del bucle
    esto significa que la condicion en este punto debe ser F.

    Por esto uso numero >= 1, cuando llegamos al punto de la iteracion
    donde i vale 4, numero aun vale 1 al tener la condicion >= 1, aunque no es mayor es igual a 1
    entonces entra nuevamente al bloque del while y 1/10 = 0, i se actualiza a 5, ahora numero vale 0,
    como 0 no es >= a 1 entonces en la siguiente iteracion
    la condicion sera F y no volvera a entrar en el codigo del while, entonces como la iteracion del while a terminado.

    se imprime el System.out.println("El numero ingresado tiene " + i + " digitos");

    el numero de itereciones de la variable de control i seria el numero de digitos de la variable numero.
     */

