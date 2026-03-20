package semana1.bucle_while;

public class Ejercicio12 {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 56;
        int acumulador = 0;
        int menor;
        int mayor;

        if (num1 >= num2) { // Normalizacion de datos
            menor = num2;
            mayor = num1;
        } else {
            menor = num1;
            mayor = num2;
        }

        while (menor <= mayor){
            acumulador += menor; // = acumulador + menor;
            menor++;
        }

        System.out.println(acumulador);

    }
}
