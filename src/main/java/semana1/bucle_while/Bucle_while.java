package semana1.bucle_while;

public class Bucle_while {
    public static void main(String[] args) {

        int i = 1;
        int suma = 0;

        while( suma < 100) {
            suma += i;
            // Usamos el operador suma y asigna, entonces se asigna a suma el valor de i
            // el flujo es que a la varible suma se le asiganara el valor de i de forma iterativa.

            i ++; // Aca estamos usando post incremento para adicionar en 1 a i, este nuevo valor
            // se adicionara a suma en la proxima vuelta.

        }

        System.out.println("Suma final: " + suma);
        System.out.println("Siguiente numero a sumar seria: " + i);
    }
}
