package EjerciciosFinales;


import java.security.PrivateKey;

public class EstudianteB2 {

    private String nombre;
    private int edad;
    private String facultad;
    private int CodigoEstudiantil;
    private int Cedula;
    private String carrera;

    EstudianteB2(int CodigoEstudiantil) {
        this.CodigoEstudiantil = CodigoEstudiantil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Ceduka) {
        this.Cedula = Cedula;
    }


    public EstudianteB2(String nombre, int edad, String facultad, String carrera, int CodigoEstudiantil, int Cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.facultad = facultad;
        this.carrera= carrera;
        this.CodigoEstudiantil= CodigoEstudiantil;
        this.Cedula= Cedula;

    }
}