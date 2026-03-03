package semana1.estructura_switch;

public class ejercicio_switch {
    public static void main(String[] args) {

        String opcion = "PIZZA";
        String tamano = "LX";

        switch(opcion){
            case "AGUA":
            case "JUGO": // fall through intencianl para agrupar
                System.out.println("Bebidas frias");
                break;
            case "CAFE":
                System.out.println("Cafe americano");
                break;
            case "CHOCOLATE":
                System.out.println("Cafe negro");
                break;
            case "TE":
                System.out.println("Te verde");
                break;
            default:
                System.out.println("Opcion invalida");
                /*
                En este ejemplo estoy usando la forma clasica de la estructura switch
                 */
        }

        switch(tamano){
            case "S" -> System.out.println("$ 1 USD");

            case "M" -> System.out.println("$ 1.50 USD");

            case "L" -> System.out.println("$ 2 USD");

            default -> System.out.println("Tamano invalido");

            /*
            En este ejemplo estoy usando la variante moderna de la estructura switch
             */
        }
    }
}
