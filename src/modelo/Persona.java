
package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


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
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.telefono = telefono;
        this.correoE = correoE;
    }

    public Persona() {
    }

    public int getEdad(){
        int edad;
        LocalDate hoy = LocalDate.now();
        if (hoy.getMonthValue() > fechaNacimiento.getMonthValue() ||
           (hoy.getMonthValue() > fechaNacimiento.getMonthValue() &&
            hoy.getDayOfMonth() >= fechaNacimiento.getDayOfMonth()))
            edad = hoy.getYear() - fechaNacimiento.getYear();
         else
            edad = hoy.getYear() - fechaNacimiento.getYear() - 1;
            
        return edad;
    }
    
    @Override
    public String toString() {
        return nombre + "(" + getEdad() + ')';
    }
    



    
}
