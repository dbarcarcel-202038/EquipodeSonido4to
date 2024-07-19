/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dbarcarcel.modelo;

/**
 *
 * @author dako
 */
public class Producto {
    
    private int id;
    private String modelo;
    private String color;
    private String precio;
    private boolean estado_activo;
    private int id_proveedor;
    
    public Producto(){}
        
	public Producto(int id, String modelo, String color,String precio, boolean estado_activo, int id_proveedor){
		this.id = id;
                this.modelo = modelo;
		this.color = color;
		this.precio = precio;
                this.estado_activo = estado_activo;
                this.id_proveedor = id_proveedor;
                
        }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public boolean isEstado_activo() {
        return estado_activo;
    }

    public void setEstado_activo(boolean estado_activo) {
        this.estado_activo = estado_activo;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
}
