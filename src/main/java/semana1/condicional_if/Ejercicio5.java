package semana1.condicional_if;

public class Ejercicio5 {
    public static void main(String[] args) {
        int km = 5;

        if(km < 1){
            System.out.println("Andando");
        } else if(km >= 1 && km < 5){
            System.out.println("Bicicleta");
        } else if(km >= 5 && km <50){
            System.out.println("Coche");
        } else if(km >= 50 ){
            System.out.println("Avion");
        }
    }
}
