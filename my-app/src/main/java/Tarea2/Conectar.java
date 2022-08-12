/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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




public class Conectar {
    
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String host = "localhost";
    private String puerto = "8889"; //3306
    private String usuario = "root";
    private String contrasenia = "root"; //""
    private String nombreBaseDatos = "estudiantes";
            
    private String urlConexion = "jdbc:mysql://" + host + ":" + puerto + "/" + nombreBaseDatos + "?useSSL=false";
    
    private Connection conexion = null;
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(urlConexion, usuario, contrasenia);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    
    public Connection desconectar(){
        return conexion = null;
    }
    
    
}