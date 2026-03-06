package semana1.estructura_switch;

public class Ejercicio2 {
    public static void main(String[] args) {

        String animal = "Pajaro";

        switch (animal){
            case "Perro":
                System.out.println("Mamifero terrestre");
                break;
            case "Gato":
                System.out.println("Mamifero terrestre");
                break;
            case "Pez":
                System.out.println("Acuatico");
                break;
            case "Pajaro":
                System.out.println("Ave");
                break;
            default:
                System.out.println("Animal desconocido");
        }
    }
}
