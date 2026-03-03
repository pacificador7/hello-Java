package semana1.condicional_if;
// Este paquete sera para estudiar y practicar sobre los condicionales

public class Condicionales_if {
    public static void main(String[] args) {

        String titulo = "Hola";

        // Practica sobre el condicional If

        if (titulo==null || titulo.isBlank()){
            System.out.println("El titulo es obligatorio");
        }
        else {
            System.out.println("Ok, se puede crear la tarea");
        }
    }
}
