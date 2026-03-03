package semana1.condicional_if;

public class Ejercicio11 {
    public static void main(String[] args) {
        int saldoInicial = 1000;
        int cantidad = 280;


        System.out.println("Saldo inicial: " + saldoInicial + " USD -- Cuanto desea retirar?");

        if (cantidad > 0){
            if (cantidad > saldoInicial){
                System.out.println("Saldo insuficiente!");
            } else if (cantidad <= saldoInicial){
                int saldoFinal = saldoInicial - cantidad;
                System.out.println("Su retiro de: " + cantidad + " USD fue exitoso su nuevo saldo es de " + saldoFinal);
            }
        } else {
            System.out.println("Ingrese una cantidad positiva");
        }

        /**
         * En este ejercicio hago un mini sistema de cajero automatico
         *
         * primero uso una estructura if para validar si cantidad es positivo de lo contrario no se podra continuar
         * el proceso de retiro, si cantidad es positivo entonces esta condicion sera true y el programa entrara al bloque
         * de este if externo, donde tenemos otro if anidado o interno donde tenemos una condicion que evalua si
         * cantidad > saldoinicial, si esto es true entonces mostrara un mensaje de saldo insuficiente y como esta condicion
         * fue true entonces el programa termina en este punto.
         *
         * Pero en este if interno estamos usando else if para tener mas una condicion que puede ser verdadera, si la anterior
         * es false, y si esta es true entonces para este punto hemos superado los dos filtros previos, para este punto el proceso
         * de retiro se efectuara, entonces aca el programa resta la cantidad de saldoInicial y tenemos el nuevo
         * saldo actualizado luego mostramos la informacion al ususario.
         */
    }
}
