/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dbarcarcel.controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.dbarcarcel.db.Conexion;
import org.dbarcarcel.modelo.Compra;


/**
 *
 * @author dako
 */
public class ControlCompra {
    private static ControlCompra instancia=null;
    private static ArrayList<Compra> Compra;

    
    public static ControlCompra getInstancia(){
        if(instancia == null){
            instancia = new ControlCompra();
        }return instancia;
    }
   
    public ControlCompra(){
		Compra = new ArrayList<Compra>();
                mostrarCompra();
	}
        
         public int cantidadDeCompras(){
        return Compra.size();
    }
    
        public ArrayList<Compra> listaDeCompras(){
        return Compra;
    }

    public void agregarCompra(Compra compra){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_agregarCompra(?,?,?,?);");
            sentencia.setString(1, compra.getFecha());
            sentencia.setInt(2, compra.getId_usuarios());
            sentencia.setInt(3, compra.getId_producto());
            sentencia.setBoolean(4, true);
            
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Usted agrego una compra a la Base de Datos");
        }catch(Exception error){
            error.printStackTrace();
        }     
    }
    
    public void actualizarCompra(Compra compra){
		try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarCompra(?, ?, ?, ?, ?);");
            sentencia.setInt(1, compra.getId());
            sentencia.setString(2, compra.getFecha());
            sentencia.setInt(3, compra.getId_usuarios());
            sentencia.setInt(4, compra.getId_producto());
            sentencia.setBoolean(5, true);
            sentencia.execute();
            
           
            JOptionPane.showMessageDialog(null, "Ha actualizado una compra en la base de datos");
        }catch(Exception error){
            error.printStackTrace();
        }
   }    

     public void eliminarCompra(Compra Eliminar){
		try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarCompra(?)");
            sentencia.setInt(1, Eliminar.getId());
              
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado una compra de la Base de Datos");
        }catch(Exception error){
            error.printStackTrace();
        }
      
        }
     public void mostrarCompra(){
            try{
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_mostrarCompra();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    Compra prod = new Compra();
                    prod.setId(resultado.getInt(1));
                    prod.setFecha(resultado.getString(2));
                    prod.setId_producto(resultado.getInt(3));
                    prod.setId_usuarios(resultado.getInt(4));
                    prod.setEstado_activo(true);
                   
                    Compra.add(prod);
                }
                } catch (Exception e) {
                e.printStackTrace();
            }
     }
     public Compra buscarCompra(Compra compra ){
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_buscarCompra(?);");
        sentencia.setInt(1, compra.getId());
        ResultSet resultado = sentencia.executeQuery();
        if(resultado.next()==true){
            compra.setId(resultado.getInt(1));
            compra.setFecha(resultado.getString(2));
            compra.setId_producto(resultado.getInt(3));
            compra.setId_usuarios(resultado.getInt(4));
            compra.setEstado_activo(true);
        } else
            compra = null;
        } catch(Exception error){
            error.printStackTrace();
        }
        return compra;
    }
}

