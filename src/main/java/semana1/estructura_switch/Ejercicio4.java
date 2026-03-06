package semana1.estructura_switch;

public class Ejercicio4 {
    public static void main(String[] args) {

        double num1 = 25;
        double num2 = 0;
        char operador = '/';

        switch (operador) {
            case '+':
                double suma = num1 + num2;
                System.out.println("Resultado: " + suma);
                break;
            case '-':
                double resta = num1 - num2;
                System.out.println("Resultado: " + resta);
                break;
            case '*':
                double multiplicacion = num1 * num2;
                System.out.println("Resultado: " + multiplicacion);
                break;
            case '/':
                if (num2 == 0){
                    System.out.println("ERROR: No se puede dividir por zero");
                } else {
                    double division = num1 / num2;
                    System.out.println("Resultado: " + division);
                }
                break;
            default:
                System.out.println("Seleccione un operador valido");
        }
    }
}
