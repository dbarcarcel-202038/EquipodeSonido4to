/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.dbarcarcel.vista;

import org.dbarcarcel.controlador.ControlProducto;
import org.dbarcarcel.modelo.Producto;

/**
 *
 * @author informatica
 */
public class EliminarProducto extends javax.swing.JInternalFrame {
public static ControlProducto controlador = ControlProducto.getInstancia();

    /**
     * Creates new form EliminarProducto
     */
    public EliminarProducto() {
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

        lblBorraMascota = new javax.swing.JLabel();
        txtBorrarMascota = new javax.swing.JTextField();
        botonBorrarMascota = new javax.swing.JButton();

        lblBorraMascota.setText("ID Producto");

        botonBorrarMascota.setText("Borrar");
        botonBorrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarMascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBorraMascota)
                    .addComponent(txtBorrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(botonBorrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBorraMascota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBorrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(121, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonBorrarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBorrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarMascotaActionPerformed
        Producto pro = new Producto();
        pro.setId(Integer.parseInt(txtBorrarMascota.getText()));
        controlador.eliminarProducto(pro);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBorrarMascotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrarMascota;
    private javax.swing.JLabel lblBorraMascota;
    private javax.swing.JTextField txtBorrarMascota;
    // End of variables declaration//GEN-END:variables
}