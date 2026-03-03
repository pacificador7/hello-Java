package semana1.bucle_for;

public class Bucle_for {
    public static void main(String[] args) {

        // Ejercicio practico con bucle for

        for (int i=2; i <= 20; i+=2){
            System.out.println(i);
            /*
            En este ejercicio usamos el bucle for para imprimir numeros pares hasta el 20
            la anatomia de esta estructura se divide en 3 partes:

            1 inicializacion, 2 condicion, 3 actualizacion.

            1: Esto se ejecuta una vez, aca declare la varaible de control i como int y lo inicio en 2.
            2: Esta es una condicion que se evalua antes de cada iteracion, cuando sea false el bucle se termina,
            por eso puse i <= 20 porque al evaluar la varible de control y esta es menor que 20 es entonces
            la condicion es true, y se imprime el estado que i tiene en ese instante,
             luego entra en la parte 3 donde se actualiza en 2 la variable entonces ahora tiene valor de 4
              y entra nuevamente a la condicion donde nuevamente es true porque 4 es <= a 20 y entra en el cuerpo
              lo cual imprime 4, de esta forma continua la iteracion hasta que la condicion sea false.
             */
        }
    }
}
