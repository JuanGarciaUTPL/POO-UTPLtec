/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;

import java.sql.*;
        

/**
 *
 * @author JAG.media
 */

/*
Para lograr esta tarea
Según lo que nos explicaron en clases y lo que entendí
se necesita obligado manejar base de datos
para poder ingresar y eliminar registros...

Aquí lo q pude hacer...
*/


public class Tarea2 {
    
    public static void main(String[] args) throws SQLException {
        
        String insertSQL = "INSERT INTO estudiante (nombre, apellido, edad) VALUES ('Juanito', 'Rodriguez', 25)"; 
        String selectSQL = "SELECT * FROM estudiante";
        
        Conectar conexion = new Conectar();
        
        if(conexion.conectar() != null){
            System.out.println("conectado");
            
            Statement declaracion = conexion.conectar().createStatement();
            int registro = declaracion.executeUpdate(insertSQL);
            
            System.out.println("Filas insertadas: " + registro);
            
            ResultSet registros = declaracion.executeQuery(selectSQL);
            
            while(registros.next()){
                System.out.println("id: " + registros.getInt("id"));
                System.out.println(" | nombre: " + registros.getString("nombre"));
                System.out.println(" | apellido: " + registros.getString("apellido"));
                System.out.println(" | edad: " + registros.getInt("edad"));
            }
            
        }else{
            System.out.println("desconectado");
        }
        
    }

    
}
