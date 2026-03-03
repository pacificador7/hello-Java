package semana1.encadenamiento_else_if;

public class condicion_else_if {
    public static void main(String[] args) {

        String password = ""; // >16

        if (password == null || password.isBlank()){
            System.out.println("Introduzca una contrasena valida");
        } else if (password.length()<6) {
            System.out.println("Muy corta");
        } else if (password.length()<=10) {
            System.out.println("Aceptable");
        } else if (password.length()<=16) {
            System.out.println("Buena");
        } else {
            System.out.println("Muy larga");
        }

    }
}
