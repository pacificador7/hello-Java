package semana1.condicional_if;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*
        Ejercicio 6: Autenticación simple
Crea un programa que tenga una contraseña predefinida (ej: "python123"). Pide al usuario que introduzca la contraseña.
Si coincide, imprime "Acceso concedido". Si no, imprime "Acceso denegado". (Ojo: las mayúsculas y minúsculas importan).
         */

        String passValida = "Java123";
        String passsUser = "ava123";

        if (passValida.equals(passsUser)) {
            System.out.println("Acceso concedido!");
        } else {
            System.out.println("Acceso no valido!");
        }

    }
}
