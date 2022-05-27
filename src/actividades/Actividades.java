
package actividades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import modelo.Actividad;
import modelo.Persona;


public class Actividades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        ArrayList<Persona> personas = new ArrayList<>(Arrays.asList(
            new Persona("David", "Molinos Fernández", "05202418H", "11/09/2000", "666666666", "davidmf@gmail.com"),
            new Persona("Sara", "Bugueiro", "32700409J", "14/06/1997", null, "sara@gmail.com"),
            new Persona("Álvaro", null, "32700409J", "14/08/2001", null, "alvaro@gmail.com"),
            new Persona("Hannah", "Snow", "05202418H", "01/12/1992", null, "hsnow@gmail.com"),
            new Persona("Marcos", "López", "03302418H", "03/03/1995", null, "mlopez@gmail.com"),
            new Persona("Alba", "Barros", "05202418H", "18/07/1987", null, "alba@gmail.com")));

        System.out.println(personas.toString());
        
        ArrayList<Actividad> actividades = new ArrayList<>(Arrays.asList(        
            new Actividad("Hackaton", "20/06/2022 10:00", "20/06/2022 20:00", 100),
            new Actividad("Senderismo Banco de Pastoriza", "11/06/2022 10:00", "11/06/2022 140:00", 20),
            new Actividad("Picnic & Language Exchange", "28/05/2022 13:00", "28/05/2022 17:00", 3)));
     
        System.out.println(actividades.toString());

      
    }

    
    
}
