/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dbarcarcel.db;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author dako
 */
public class Conexion {
    
    private Connection conexion;
    private static Conexion instancia;
    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   //se agrega "cj" para versiones de mysql mayores a 7
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_equipo_de_sonido?useSSL=false","root", "admin");
            JOptionPane.showMessageDialog(null, "Se ha establecido la conexion con la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
            JOptionPane.showMessageDialog(null, error);
            
        }
    }
    
    public synchronized static Conexion getInstancia(){
        if (instancia == null) 
            instancia = new Conexion();
        return instancia;
    }   
    
    public Connection getConexion(){
        return conexion;
    }
    
    public void setConexion(Connection conexion){
        this.conexion = conexion;
    }
    
    
}