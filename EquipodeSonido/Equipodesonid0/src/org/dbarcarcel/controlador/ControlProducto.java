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
import org.dbarcarcel.modelo.Producto;


/**
 *
 * @author dako
 */
public class ControlProducto {
    private static ControlProducto instancia=null;
    private static ArrayList<Producto> Producto;

    
    public static ControlProducto getInstancia(){
        if(instancia == null){
            instancia = new ControlProducto();
        }return instancia;
    }
   

	private ControlProducto(){
		Producto = new ArrayList<Producto>();
                mostrarProducto();
	}
        
        
         public int cantidadDeProductos(){
        return Producto.size();
    }
    
        public ArrayList<Producto> listaDeProductos(){
        return Producto;
    }

    public void agregarProducto(Producto producto){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_agregarProducto(?,?,?,?,?,?);");
            sentencia.setString(1, producto.getModelo());
            sentencia.setString(2, producto.getColor());
            sentencia.setString(4, producto.getPrecio());
            sentencia.setBoolean(5, true);
            sentencia.setInt(6, producto.getId_proveedor());
            sentencia.execute();
            
            JOptionPane.showMessageDialog(null, "Se ha agregado un producto a la Base de Datos");
        }catch(Exception error){
            error.printStackTrace();
        }     
    }
    
    public void actualizarProducto(Producto producto){
		try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarProducto(?, ?, ?, ?, ?, ?, ?);");
            sentencia.setInt(1, producto.getId());
            sentencia.setString(2, producto.getModelo());
            sentencia.setString(3, producto.getColor());
            sentencia.setString(5, producto.getPrecio());
            sentencia.setBoolean(6, true);
            sentencia.setInt(7, producto.getId_proveedor());
            sentencia.execute();
            
           
            JOptionPane.showMessageDialog(null, "Ha actualizado un producto en la base de datos");
        }catch(Exception error){
            error.printStackTrace();
        }
   }    

      public void mostrarProducto(){
            try{
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_mostrarProducto();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    Producto prod = new Producto();
                    prod.setId(resultado.getInt(1));
                    prod.setModelo(resultado.getString(2));
                    prod.setColor(resultado.getString(3));
                    prod.setPrecio(resultado.getString(5));
                    prod.setEstado_activo(true);
                    prod.setId_proveedor(resultado.getInt(7));
 
                    Producto.add(prod);
                }
                } catch (Exception e) {
                e.printStackTrace();
            }
            
      
        }
      public void eliminarProducto(Producto Eliminar){
		try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarProducto(?)");
            sentencia.setInt(1, Eliminar.getId());
              
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Ha eliminado un producto de la Base de Datos");
        }catch(Exception error){
            error.printStackTrace();
        }
    
    }
}
