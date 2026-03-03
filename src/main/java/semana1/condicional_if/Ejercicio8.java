package semana1.condicional_if;

public class Ejercicio8 {
    public static void main(String[] args) {

        int edad = 15;
        String terminos = "si";

        if  (edad >= 18) {
            if (terminos.equals("si")){
                System.out.println("Registro completo");
            } else {
                System.out.println("Debes aceptar los terminos y condiciones");
            }
        } else {
            System.out.println("No cumples los requisitos");
        }

        /*
        En este ejercicio uso un if anidado donde primero evalua la condicion si edad >= 18 si es true
        entonces entrara a la condicion del if interno y evaluara si el usuario acepta los terminos, si ambos
        condiciones son true entonces el registro fue exitoso, si no cumple la primera condicion no entrara el if
        interno y imprimira "No cumples nos rquisitos, si cumple la edad pero no acepta los terminos entonces
        mostrata que debe aceptar los terminos.

        para este caso especifico decidi usar if anidado para evaluar 2 expresiones
        de forma aislada y que la segunda sea evaluada solo si la primera es true.
         */
    }
}
