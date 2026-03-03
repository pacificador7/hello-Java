package semana1.break_continue;

public class Ejercicio1 {
    public static void main(String[] args) {

        int resultado = 0;

        for (int i = 1; i <= 6; i++) {

            if (i == 3) {
                continue;
            }
            /*
            El bucle for comienza con la iteracion con i=1, luego se evalua la condicion, mientra esta sea true
            el bloque del for se ejecutara es decir entrara al if y al siguiente if.

            Cuando i=3 se activara continue y el codigo que sigue despues del if no se ejecutara, sino solo se actualizara
            el valor de i en la seccion de for de i++; despues continuara una nueva iteracion en este caso como tenemos un break
            la iteracion continuara hasta que se ejecute ese break.

            En este caso se continuara la iteracion hasta que se cumpla la condicion del if mas interno que tiene break. y en ese
            momento se acabara el bucle. y se imprimira el println que esta fuera del bloque del for.
             */

            if (i == 5) {
                break;
            }

            resultado = resultado + i;
            System.out.println("i=" + i + " | resultado=" + resultado);
        }

        System.out.println("Final: " + resultado);
    }
}
