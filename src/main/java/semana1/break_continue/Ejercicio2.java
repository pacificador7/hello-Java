package semana1.break_continue;

public class Ejercicio2 {
    public static void main(String[] args) {

        int i = 0;

        externo:
        while (i < 4) {
            i++;

            for (int j = 1; j <= 3; j++) {

                if (j == 2 && i == 2) {
                    continue externo;
                }

                if (i == 3 && j == 2) {
                    break externo;
                }

                System.out.println("i=" + i + ", j=" + j);
            }
        }

        System.out.println("Fuera de todo. i=" + i);
    }
}