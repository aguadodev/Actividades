
package modelo;

import java.time.LocalDate;


public class Persona {
    String nombre;
    String apellidos;
    String dni;
    LocalDate fechaNacimiento;
    String telefono;
    String correoE;

    public Persona(String nombre, String apellidos, String dni, String fechaNacimiento, String telefono, String correoE) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = null;
        this.telefono = telefono;
        this.correoE = correoE;
    }

    public Persona() {
    }
    



    
}
