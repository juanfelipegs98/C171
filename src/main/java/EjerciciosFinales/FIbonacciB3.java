package EjerciciosFinales;

import java.util.Calendar;

public class FIbonacciB3 {
    public static void main(String[] args) {


        System.out.println("Los prmeros 20 numeros de la secuencia fibonacci");

        int num1 = 20;
        for (int j = 0; j < num1; j++) {
            System.out.print(FunFibonacci(j) + " ");
        }
    }
    public static int FunFibonacci(int num1 ) {
        if (num1 <= 1) {
            return num1;
        } else {
            return FunFibonacci(num1 - 1 ) + FunFibonacci(num1 - 2 );
        }
    }
}
