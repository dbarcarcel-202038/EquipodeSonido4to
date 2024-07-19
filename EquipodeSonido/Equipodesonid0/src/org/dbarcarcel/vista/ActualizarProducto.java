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
public class ActualizarProducto extends javax.swing.JInternalFrame {
public static ControlProducto controladorActualizar = ControlProducto.getInstancia();

    /**
     * Creates new form ActualizarProducto
     */
    public ActualizarProducto() {
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

        lblNuevColor = new javax.swing.JLabel();
        txtNuevoColor = new javax.swing.JTextField();
        lblNuevoPrecio = new javax.swing.JLabel();
        txtNuevoPrecio = new javax.swing.JTextField();
        lblIdMascota = new javax.swing.JLabel();
        botonActualizarMascota = new javax.swing.JButton();
        txtViejoIdMascota = new javax.swing.JTextField();
        lblNuevoId = new javax.swing.JLabel();
        txtNuevoId = new javax.swing.JTextField();
        lblNuevoModelo = new javax.swing.JLabel();
        txtNuevoModelo = new javax.swing.JTextField();

        lblNuevColor.setText("Color:");

        lblNuevoPrecio.setText("Precio:");

        lblIdMascota.setText("ID: ");

        botonActualizarMascota.setText("Actualizar");
        botonActualizarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarMascotaActionPerformed(evt);
            }
        });

        lblNuevoId.setText("ID Proveedor");

        lblNuevoModelo.setText("Producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNuevoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViejoIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNuevColor)
                            .addComponent(lblNuevoModelo)
                            .addComponent(lblIdMascota)
                            .addComponent(txtNuevoColor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNuevoPrecio)
                            .addComponent(txtNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNuevoId)
                            .addComponent(txtNuevoId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(botonActualizarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblIdMascota)
                .addGap(2, 2, 2)
                .addComponent(txtViejoIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNuevoModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblNuevColor)
                .addGap(18, 18, 18)
                .addComponent(txtNuevoColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNuevoPrecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblNuevoId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNuevoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addComponent(botonActualizarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarMascotaActionPerformed
        Producto pro = new Producto();
        pro.setId(Integer.parseInt(txtViejoIdMascota.getText()));
        pro.setModelo(txtNuevoModelo.getText());
        pro.setColor(txtNuevoColor.getText());
        pro.setPrecio(txtNuevoPrecio.getText());
        pro.setId_proveedor(Integer.parseInt(txtNuevoId.getText()));

        controladorActualizar.actualizarProducto(pro);
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarMascotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarMascota;
    private javax.swing.JLabel lblIdMascota;
    private javax.swing.JLabel lblNuevColor;
    private javax.swing.JLabel lblNuevoId;
    private javax.swing.JLabel lblNuevoModelo;
    private javax.swing.JLabel lblNuevoPrecio;
    private javax.swing.JTextField txtNuevoColor;
    private javax.swing.JTextField txtNuevoId;
    private javax.swing.JTextField txtNuevoModelo;
    private javax.swing.JTextField txtNuevoPrecio;
    private javax.swing.JTextField txtViejoIdMascota;
    // End of variables declaration//GEN-END:variables
}
