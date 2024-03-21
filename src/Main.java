import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Scanner cs = new Scanner(System.in);
        int val1;
        int val2;
        int opcion;
        int suma;
        int resta;
        int multiplicacion;
        double division;

        System.out.println(" Ingrese el primer valor: ");
        val1 = cs.nextInt();

        System.out.println(" Ingrese el segundo valor: ");
        val2 = cs.nextInt();

        System.out.println(" Ingrese la operacion a realizar:  ");
        System.out.println(" 1 -- Suma  ");
        System.out.println(" 2 -- Resta  ");
        System.out.println(" 3 -- multiplicacion ");
        System.out.println(" 4 -- division ");
        System.out.println(" 5 -- salir ");

        opcion = cs.nextInt();

        switch (opcion) {
            case 1:
                // suma
                System.out.println(" Operacion suma");
                main.suma(val1, val2);
                System.out.println(+main.suma(val1, val2));

                break;

            case 2:
                // resta
                System.out.println(" Operacion resta");
                main.resta(val1, val2);
                System.out.println(+main.resta(val1, val2));
                break;

            case 3:
                // multiplicacion
                System.out.println(" Operacion multiplicacion");
                main.multiplicacion(val1, val2);
                System.out.println(+main.multiplicacion(val1, val2));
                break;

            case 4:
                // division
                System.out.println(" Operacion divison");
                main.division(val1, val2);
                System.out.println(+main.division(val1, val2));
                break;

            case 5:
                // salir de la calculadora
                System.out.println(" Ha salido de la calculadora.");
            default:
        }

    }

    public int suma(int val1, int val2) {
        return val1 + val2;
    }

    public int resta(int val1, int val2) {
        return val1 - val2;
    }

    public int multiplicacion(int val1, int val2) {
        return val1 * val2;
    }

    public int division(int val1, int val2) {
        return val1 / val2;
    }

}





/*

    do {
    // Bloque de código a ejecutar
} while (condition);


switch (opcion) {
            case 1:
                // suma
                System.out.println(" Operacion suma");
                suma = val1 + val2;

                break;

            case 2:
                // resta
                System.out.println(" Operacion resta");
                suma = val1 - val2;
                break;

            case 3:
                // multiplicacion
                System.out.println(" Operacion multiplicacion");
                suma = val1 * val2;
                break;

            case 4:
                // division
                System.out.println(" Operacion divison");
                suma = val1 / val2;
                break;

            case 5:
                // salir de la calculadora
                System.out.println(" Ha salido de la calculadora.");

            default:
        }

    }

* */
