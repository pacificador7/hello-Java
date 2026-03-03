package semana1.bucle_while;

public class Ejercicio_while_2 {
    public static void main(String[] args) {
        int numero = 21;

        while(numero>=0){
            if(numero%2!=0){
                System.out.println(" El numero: "+numero+" es impar");
            }
            numero--;
        }
    }
}

/*
En la resolucion de este ejercicio en la condicion del while uso el operador >= para determinar cuando el valor de numero
sea >= a 0 de esta forma evaluo el estado de la variable numero.

cuando la condicion es T entonces entra al bloque del while y entra en el if donde evaluo si numero %2!=0.
aca lo que hago es evaluar si el valor de numero es impar usando el operador mod, el flujo de esta evaluacion es la siguiente
el valor de numero se divide entre 2 luego se verifica el residuo de esa operacion, en este caso estoy usando != (distinto)
si es residuo es distinto de 0 entonces significa que ese numero es impar. si la evaluacion es T entonces entra al codigo
del if y en este caso imprime ese valor el cual se ha evaluado.

Despues lo que hago es decrementar en 1 en valor de numero, decidi usar este decremento para evaluar todos los numeros.
de esta forma el bucle while continuara hasta que el valor de numero sea F en la condicion del while, entonces aca se termina
el programa.
 */
