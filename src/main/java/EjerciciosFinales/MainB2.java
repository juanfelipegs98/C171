package EjerciciosFinales;

public class MainB2 {

    public static void main(String[] args) {

        EstudianteB2 estudianteB2 = new EstudianteB2("Felipe", 24, "Ingenierias", "Ingenieria de Sistemas" , 217239 , 1144107146);

        System.out.println("nombre: " + estudianteB2.getNombre());
        System.out.println("edad: " + estudianteB2.getEdad() );
        System.out.println("facultad: " + estudianteB2.getFacultad());
        System.out.println("carrera: " + estudianteB2.getCarrera() );
        System.out.println("Cedula: " + estudianteB2.getCedula());




    }
}