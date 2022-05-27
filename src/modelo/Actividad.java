
package modelo;

import java.time.LocalDateTime;


public class Actividad {

    String titulo;
    String descripcion;
    LocalDateTime fechaHoraInicio;   
    LocalDateTime fechaHoraFin;
    int plazas;
    Persona organizador;

    public Actividad(String titulo, String descripcion, String fechaHoraInicio, String fechaHoraFin, int plazas, Persona organizador) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaHoraInicio = null;
        this.fechaHoraFin = null;
        this.plazas = plazas;
        this.organizador = organizador;
    }

    public Actividad() {
    }

    
    


    
}
