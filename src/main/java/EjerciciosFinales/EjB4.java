package EjerciciosFinales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjB4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Nombre;
        String Apellido;
        int telefono;
        int cedula;
        double Promedio;
        String Carrera;

        while (true) {
            try {
                System.out.print("Nombre del estudiante: ");
                Nombre = scanner.nextLine();

                System.out.print("Apellido del estudiante: ");
                Apellido = scanner.nextLine();

                System.out.print("Telefono del estudiante: ");
                telefono = scanner.nextInt();

                System.out.print("Cedula del estudiante: ");
                cedula = scanner.nextInt();

                System.out.print("Promedio del estudiante: ");
                Promedio = scanner.nextDouble();

                System.out.print("Carrera a cursar:  ");
                Carrera = scanner.nextLine();


                scanner.nextLine();

                if ( Promedio < 3.0) {
                    System.out.println("El estudiante no está aprobado en la universidad.");
                } else {
                    System.out.println("El estudiante está aprobado en la universidad.");
                }


            } catch (InputMismatchException e) {
                System.out.println("Hay un error, ingresar datos válidos. ");
                scanner.nextLine();
            }
        }

    }
}