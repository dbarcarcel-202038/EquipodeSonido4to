/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dbarcarcel.modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dbarcarcel.db.Conexion;

/**
 *
 * @author dako
 */
public class Usuariosql extends Conexion {
    
    public boolean registrar(Usuarios usr)
    {
       PreparedStatement ps = null;
       Connection con = getConexion();
       
       String sql = "INSERT INTO tbl_usuarios (nombre_cliente, direccion, telefono, usuario, password, estado_activo,id_tipo_usuarios) VALUES (?,?,?,?,?,?,?)";
       
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombre_cliente());
            ps.setString(2, usr.getDireccion());
            ps.setInt(3, usr.getTelefono());
            ps.setString(4, usr.getUsuario());
            ps.setString(5, usr.getPassword());
            ps.setBoolean(6, true);
            ps.setInt(7, usr.getId_tipo());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuariosql.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
    }
    
 public boolean login(Usuarios usr) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT u.id_usuarios, u.nombre_cliente, u.usuario, u.password, u.id_tipo_usuarios, t.roll FROM tbl_usuarios "
                + "AS u INNER JOIN tbl_tipo_usuarios AS t ON u.id_tipo_usuarios=t.id_tipo_usuarios WHERE usuario = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                if(usr.getPassword().equals(rs.getString(4))){
                    
                    usr.setId(rs.getInt(1));
                    usr.setNombre_cliente(rs.getString(2));
                    usr.setId_tipo(rs.getInt(5));
                    usr.setRoll(rs.getString(6));
                                     
                    return true;
                } else {
                    return false;
                }
                                
            }
            
            return false;
            
        }catch (SQLException ex){
            Logger.getLogger(Usuariosql.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
        
}