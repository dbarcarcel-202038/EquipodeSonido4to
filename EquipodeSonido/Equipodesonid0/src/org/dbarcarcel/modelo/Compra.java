/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dbarcarcel.modelo;

/**
 *
 * @author dako
 */
public class Compra {
    
    private int id;
    private String fecha;
    private int id_usuarios;
    private int id_producto;
    private boolean estado_activo;
    
    public Compra(){}
        
	public Compra(int id, String fecha, int id_usuarios, int id_producto, boolean estado_activo){
		this.id = id;
                this.fecha = fecha;
		this.id_usuarios = id_usuarios;
		this.id_producto = id_producto;
                this.estado_activo = estado_activo;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_usuarios() {
        return id_usuarios;
    }

    public void setId_usuarios(int id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public boolean isEstado_activo() {
        return estado_activo;
    }

    public void setEstado_activo(boolean estado_activo) {
        this.estado_activo = estado_activo;
    }

    
    
    }

 