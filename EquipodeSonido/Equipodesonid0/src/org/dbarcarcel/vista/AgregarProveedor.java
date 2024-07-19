/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.dbarcarcel.vista;

import org.dbarcarcel.controlador.ControlProveedor;
import org.dbarcarcel.modelo.Proveedor;

/**
 *
 * @author informatica
 */
public class AgregarProveedor extends javax.swing.JInternalFrame {
public static ControlProveedor controladorProveedor = ControlProveedor.getInstancia();

    /**
     * Creates new form AgregarProveedor
     */
    public AgregarProveedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTelefonoMedico = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        botonAceptarMedico = new javax.swing.JButton();
        botonCancelarMedico = new javax.swing.JButton();
        lblNombreMedicoAgregar = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEmailMedico = new javax.swing.JLabel();
        lblApellidoMedico = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();

        lblTelefonoMedico.setText("Telefono ");

        botonAceptarMedico.setText("Aceptar");
        botonAceptarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarMedicoActionPerformed(evt);
            }
        });

        botonCancelarMedico.setText("Cancelar");
        botonCancelarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarMedicoActionPerformed(evt);
            }
        });

        lblNombreMedicoAgregar.setText("Proveedor");

        lblEmailMedico.setText("Email");

        lblApellidoMedico.setText("Direccion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAceptarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmailMedico)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreMedicoAgregar)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellidoMedico)
                            .addComponent(lblTelefonoMedico)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                        .addComponent(botonCancelarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreMedicoAgregar)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblTelefonoMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonAceptarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(lblEmailMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonCancelarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(lblApellidoMedico)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarMedicoActionPerformed
        // TODO add your handling code here:
        Proveedor proveedor = new Proveedor();
        proveedor.setProveedor(txtNombre.getText());
        proveedor.setTelefono(Integer.parseInt(txtTelefono.getText()));
        proveedor.setDireccion(txtDireccion.getText());
        proveedor.setEmail(txtEmail.getText());

        controladorProveedor.agregarProveedor(proveedor);
    }//GEN-LAST:event_botonAceptarMedicoActionPerformed

    private void botonCancelarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarMedicoActionPerformed
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelarMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarMedico;
    private javax.swing.JButton botonCancelarMedico;
    private javax.swing.JLabel lblApellidoMedico;
    private javax.swing.JLabel lblEmailMedico;
    private javax.swing.JLabel lblNombreMedicoAgregar;
    private javax.swing.JLabel lblTelefonoMedico;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}