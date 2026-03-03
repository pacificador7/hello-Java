package semana1.estructura_switch;

public class swicth {
    public static void main(String[] args) {

        int opcion = 2;

        switch (opcion) {
            case 1:
                System.out.println("A");
            default: // No importa la ubicacion de default, switch busca el case que coincide
                System.out.println("D");
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
        }
    }
}
