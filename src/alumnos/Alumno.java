package alumnos;

/**
 * Clase Alumno... y toda la información que yo quiera plasmar de la clase.
 *
 * @author Carlos Herrera
 * @version 2021.06.14
 */
public class Alumno {
    //Atributos
    private String nombre;
    private int anioNacimiento;

    //Constructor
    public Alumno(String nombre, int anioNacimiento) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    /**
     * calcularEdad() - Método que calcula la edad del alumno a partir del año actual
     *
     * @param anioActual año actual
     * @return edad del alumno (calculada)
     */
    public int calcularEdad(int anioActual) {
        return anioActual - this.anioNacimiento;    //El this no es necesario, porque no hay confusión
    }
}
