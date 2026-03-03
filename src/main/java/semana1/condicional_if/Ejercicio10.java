package semana1.condicional_if;

public class Ejercicio10 {
    public static void main(String[] args) {
         int num1 = 213;
         int num2 = 2398;
         int num3 = 3;
         int mayor;
         int medio;
         int menor;

         if (num1 > num2 && num1 > num3) {
             mayor = num1;
             if (num2 > num3) {
                 medio = num2;
                 menor = num3;
             } else {
                 medio = num3;
                 menor = num2;
                }
         } else if (num2 > num1 && num2 > num3) {
                mayor = num2;
                if (num1 > num3) {
                 medio = num1;
                 menor = num3;
                 } else {
                 medio = num3;
                 menor = num1;
                 }

         } else {
                mayor = num3;
                if (num1 > num2) {
                 medio = num1;
                 menor = num2;
                } else {
                 medio = num2;
                 menor = num1;
                 }
         }

        System.out.println("Orden mayor a menor: " + mayor + ", " + medio + ", " + menor);

        /**
         * En este ejercicio para ordenar estos numeros de mayor a menor use la siguiente logica
         *
         * como son tres numero use esta estructura.
         *
         * Utilizo un if para analizar si num1 es mayor a los demas numeros. si esta condicion es true
         * entonces el valor de num1 se asigna a una variable. Ademas entra a un if anidado donde se evalua entonces
         * cual de los dos numeros restantes es mayor, si num2 > num3 entonces entrara al bloque de esta condicion
         * y se realizaran las asignaciones correspondientes, ahora en este if interno o anidado hacemos uso de un else
         * este se activa si la condicion del if anidado es false, entonces aca se invierte las asignaciones del if anidado
         * y de esta forma podemos ordenar los numeros de mayor a menor. Esta es la logica que se usa en toda la estructura
         * despues se usa un else if donde evaluarmos si num2 es mayor a los demas si es true ocurre lo ya explicado, entonces
         * si las dos condiciones anteriores no se cumplen hacemos uso de un else donde ya sabemos que num3 es mayor que los demas
         * numeros y se efectura la misma logica para identificar la jerarquia de los numeros restantes.
         *
         *
         */
    }
}
