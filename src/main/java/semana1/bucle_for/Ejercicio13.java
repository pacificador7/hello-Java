package semana1.bucle_for;

public class Ejercicio13 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){
            for (int j =1; j <= 6; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * El for externo controla las filas en este caso son 4, el for interno se encarga de las columnas
         * en este caso de dibujar * dentro de cada fila.
         *
         * Tenemos 4 iteraciones en el for externo y 6 iteraciones en el for interno en cada iteracion del for externo.
         *
         */
    }
}
