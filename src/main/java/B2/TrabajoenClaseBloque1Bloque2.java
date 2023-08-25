package B2;

import java.util.Scanner;

public class TrabajoenClaseBloque1Bloque2 {
    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);

        System.out.println("ingrese el primer numero");
        int num1 = scanner.nextInt();

        System.out.println("ingrese el segundo numero");
        int num2 = scanner.nextInt();

        System.out.println("ingrese el tercer numero");
        int num3 = scanner.nextInt();

        int mayor=num1;
        if (num2>num1) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;

        }
        System.out.println("el numero mayor es "+ mayor);
        scanner.close();
    }
}





