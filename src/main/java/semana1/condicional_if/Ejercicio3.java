package semana1.condicional_if;

public class Ejercicio3 {
    public static void main(String[] args) {
        float total = 100;
        float propina;
        float subTotal;

        // Vamos a crear un sistema que sugiera al cliente a dar una propina del 15% si es total es > a 50,
        // si no vamos a sugerir propina del 10%.

        if (total >= 50){
            propina = total*0.15f;
            subTotal = total+propina;
            System.out.println("Total consumo de: " +total+ " total de propina: " +propina+ " Total: " + subTotal);
        } else {
            propina = total*0.1f;
            subTotal = total+propina;
            System.out.println("Total consumo de: " +total+ " total de propina: " +propina+ " Total: " + subTotal);
        }
    }
}
