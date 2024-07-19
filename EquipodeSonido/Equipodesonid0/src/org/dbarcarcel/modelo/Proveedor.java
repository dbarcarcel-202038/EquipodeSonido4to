/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.dbarcarcel.modelo;

/**
 *
 * @author dako
 */
public class Proveedor {

    
    private int id;
    private String proveedor;
    private int telefono;
    private String direccion;
    private String email;

    	public Proveedor(){}
        
	public Proveedor(int id, String proveedor, int telefono, String direccion, String email){
		this.id = id;
                this.proveedor = proveedor;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;

	}
        
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getProveedor() {
            return proveedor;
        }

        public void setProveedor(String proveedor) {
            this.proveedor = proveedor;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

    }
