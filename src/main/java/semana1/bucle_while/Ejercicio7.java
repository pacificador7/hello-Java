package semana1.bucle_while;

public class Ejercicio7 {
    public static void main(String[] args) {

        int i = 1;
        int acumulador = 1;

        while (i <= 5){
            acumulador = acumulador * i;
            i++;
        }
        System.out.println(acumulador);
    }
}
