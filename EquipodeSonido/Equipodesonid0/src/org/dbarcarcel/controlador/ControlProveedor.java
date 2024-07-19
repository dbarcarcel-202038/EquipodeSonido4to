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
import org.dbarcarcel.modelo.Proveedor;


/**
 *
 * @author dako
 */
public class ControlProveedor {
    private static ControlProveedor instancia=null;
    private static ArrayList<Proveedor> proveedor;

    
    public static ControlProveedor getInstancia(){
        if(instancia == null){
            instancia = new ControlProveedor();
        }return instancia;
    }
   

	private ControlProveedor(){
		proveedor = new ArrayList<Proveedor>();
                mostrarProveedor();
	}
            
         public int cantidadDeProveedores(){
        return proveedor.size();
    }
    
        public ArrayList<Proveedor>listaDeProveedor(){
        return proveedor;
    }

    public void agregarProveedor(Proveedor proveedor){
        try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_agregarProveedor(?,?,?,?);");
            sentencia.setString(1, proveedor.getProveedor());
            sentencia.setInt(2, proveedor.getTelefono());
            sentencia.setString(3, proveedor.getDireccion());
            sentencia.setString(4, proveedor.getEmail());
            
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Se ha agregado un proveedor a la Base de Datos");
        }catch(Exception error){
            error.printStackTrace();
        }     
    }
    
    public void actualizarProveedor(Proveedor proveedor){
		try{
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarProveedor(?, ?, ?, ?, ?);");
            sentencia.setInt(1, proveedor.getId());
            sentencia.setString(2, proveedor.getProveedor());
            sentencia.setInt(3, proveedor.getTelefono());
            sentencia.setString(4, proveedor.getDireccion());
            sentencia.setString(5, proveedor.getEmail());
            sentencia.execute();
            
           
            JOptionPane.showMessageDialog(null, "Ha actualizado un proveedor en la base de datos");
        }catch(Exception error){
            error.printStackTrace();
        }
   }    

      public void mostrarProveedor(){
            try{
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_mostrarProveedor();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    Proveedor pro = new Proveedor();
                    pro.setId(resultado.getInt(1));
                    pro.setProveedor(resultado.getString(2));
                    pro.setTelefono(resultado.getInt(3));
                    pro.setDireccion(resultado.getString(4));
                    pro.setEmail(resultado.getString(5));
 
                    proveedor.add(pro);
                }
                } catch (Exception e) {
                e.printStackTrace();
            }
            
      
        }

    
}