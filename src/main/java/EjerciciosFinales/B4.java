package EjerciciosFinales;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class B4 {
    private static final Logger logger = Logger.getLogger(B4.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            FileHandler fileHandler = new FileHandler("registro.log");
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            logger.addHandler(fileHandler);

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

                    if (Promedio < 3.0) {
                        logger.log(Level.INFO, "El estudiante está aprobado en la universidad.");
                        System.out.println("El estudiante no está aprobado en la universidad.");
                    } else {
                        logger.log(Level.INFO, "El estudiante está aprobado en la universidad.");
                        System.out.println("El estudiante está aprobado en la universidad.");
                    }


                } catch (InputMismatchException e) {
                    System.out.println("Ha ocurrido un error, ingresa los datos de nuevo");
                    scanner.nextLine();
                }
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");

        }
    }
}