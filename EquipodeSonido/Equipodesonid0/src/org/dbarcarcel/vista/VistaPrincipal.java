/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.dbarcarcel.vista;
import java.awt.Dimension;
import org.dbarcarcel.modelo.Usuarios;

/**
 *
 * @author informatica
 */
public class VistaPrincipal extends javax.swing.JFrame {
Dimension tamanioPantalla = new Dimension();

private static AgregarProducto instanciaAgregarProducto = null;
private static ActualizarProducto instanciaActualizarProducto = null;
private static EliminarProducto instanciaeEliminarProducto = null;
private static VerProductos instanciVistaVerProductos = null;
private static AgregarProveedor instanciaAgregarProveedor = null;
private static ActualizarProveedor instanciaActualizarProveedor = null;
private static VerProveedores instanciaVerProveedor = null;
private static AgregarCompra instanciaAgregarCompra = null;
private static ActualizarCompra instanciaActualizarCompra = null;
private static EliminarCompra instanciaEliminarCompra = null;
private static VerCompra instanciaVerCompra = null;
private static BuscarCompra instanciaBuscarCompra = null;

    Usuarios mod;

    /**
     * Creates new form VistaPrincipal
     */
    
    public VistaPrincipal(){
        initComponents();
    }
    public VistaPrincipal(Usuarios mod){
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;
        
        if(mod.getId_tipo() == 1){
            
            
        } else if(mod.getId_tipo() == 2 ){
            agregarPro.setVisible(false);
            actualizarPro.setVisible(false);
            eliminarPro.setVisible(false);
            agregarProve.setVisible(false);
            actualizaeProvee.setVisible(false);
            borrarCompra.setVisible(false);
        }
    }
    public void lookAndFeel(){
     try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
     }
    private synchronized AgregarProducto getInstanciaAgregarProducto(){
    if(instanciaAgregarProducto == null){
        instanciaAgregarProducto = new AgregarProducto();
        panelBici.add(instanciaAgregarProducto);
    }else if(instanciaAgregarProducto.isVisible()== false)
        instanciaAgregarProducto.setVisible(true); 
        instanciaAgregarProducto.show();
        return instanciaAgregarProducto;
}
    private synchronized ActualizarProducto getInstanciaActualizarProducto(){
    if(instanciaActualizarProducto == null){
        instanciaActualizarProducto = new ActualizarProducto();
        panelBici.add(instanciaActualizarProducto);
    }else if(instanciaActualizarProducto.isVisible()== false)
        instanciaActualizarProducto.setVisible(true); 
        instanciaActualizarProducto.show();
        return instanciaActualizarProducto;
}
    private synchronized EliminarProducto getInstanciaEliminarProducto(){
    if(instanciaeEliminarProducto == null){
        instanciaeEliminarProducto = new EliminarProducto();
        panelBici.add(instanciaeEliminarProducto);
    }else if(instanciaeEliminarProducto.isVisible()== false)
        instanciaActualizarProducto.setVisible(true); 
        instanciaeEliminarProducto.show();
        return instanciaeEliminarProducto;
}
    private synchronized VerProductos getInstanciaVerProductos(){
    if(instanciVistaVerProductos == null){
        instanciVistaVerProductos = new VerProductos();
        panelBici.add(instanciVistaVerProductos);
    }else if(instanciVistaVerProductos.isVisible()== false)
        instanciVistaVerProductos.setVisible(true); 
        instanciVistaVerProductos.show();
        return instanciVistaVerProductos;
}
    private synchronized AgregarProveedor getInstanciaAgregarProveedor(){
    if(instanciaAgregarProveedor == null){
        instanciaAgregarProveedor = new AgregarProveedor();
        panelBici.add(instanciaAgregarProveedor);
    }else if(instanciaAgregarProveedor.isVisible()== false)
        instanciaAgregarProveedor.setVisible(true); 
        instanciaAgregarProveedor.show();
        return instanciaAgregarProveedor;
}
    private synchronized ActualizarProveedor getInstanciaActualizarProveedor(){
    if(instanciaActualizarProveedor == null){
        instanciaActualizarProveedor = new ActualizarProveedor();
        panelBici.add(instanciaActualizarProveedor);
    }else if(instanciaActualizarProveedor.isVisible()== false)
        instanciaActualizarProveedor.setVisible(true); 
        instanciaActualizarProveedor.show();
        return instanciaActualizarProveedor;
}
    private synchronized VerProveedores getInstanciaVerProveedor(){
    if(instanciaVerProveedor == null){
        instanciaVerProveedor = new VerProveedores();
        panelBici.add(instanciaVerProveedor);
    }else if(instanciaVerProveedor.isVisible()== false)
        instanciaVerProveedor.setVisible(true); 
        instanciaVerProveedor.show();
        return instanciaVerProveedor;
}
     private synchronized AgregarCompra getInstanciaAgregarCompra(){
    if(instanciaAgregarCompra == null){
        instanciaAgregarCompra = new AgregarCompra();
        panelBici.add(instanciaAgregarCompra);
    }else if(instanciaAgregarCompra.isVisible()== false)
        instanciaAgregarCompra.setVisible(true); 
        instanciaAgregarCompra.show();
        return instanciaAgregarCompra;
}
    private synchronized ActualizarCompra getInstanciaActualizarCompra(){
    if(instanciaActualizarCompra == null){
        instanciaActualizarCompra = new ActualizarCompra();
        panelBici.add(instanciaActualizarCompra);
    }else if(instanciaActualizarCompra.isVisible()== false)
        instanciaActualizarCompra.setVisible(true); 
        instanciaActualizarCompra.show();
        return instanciaActualizarCompra;
}
     private synchronized EliminarCompra getInstanciaEliminarCompra(){
    if(instanciaEliminarCompra == null){
        instanciaEliminarCompra = new EliminarCompra();
        panelBici.add(instanciaEliminarCompra);
    }else if(instanciaEliminarCompra.isVisible()== false)
        instanciaEliminarCompra.setVisible(true); 
        instanciaEliminarCompra.show();
        return instanciaEliminarCompra;
}
     private synchronized VerCompra getInstanciaVerCompra(){
    if(instanciaVerCompra == null){
        instanciaVerCompra = new VerCompra();
        panelBici.add(instanciaVerCompra);
    }else if(instanciaVerCompra.isVisible()== false)
        instanciaVerCompra.setVisible(true); 
        instanciaVerCompra.show();
        return instanciaVerCompra;
}
     private synchronized BuscarCompra getInstanciaBuscarCompra(){
    if(instanciaBuscarCompra == null){
        instanciaBuscarCompra = new BuscarCompra();
        panelBici.add(instanciaBuscarCompra);
    }else if(instanciaBuscarCompra.isVisible()== false)
        instanciaBuscarCompra.setVisible(true); 
        instanciaBuscarCompra.show();
        return instanciaBuscarCompra;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBici = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        agregarPro = new javax.swing.JMenuItem();
        actualizarPro = new javax.swing.JMenuItem();
        eliminarPro = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        agregarProve = new javax.swing.JMenuItem();
        actualizaeProvee = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        borrarCompra = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        buscarProducto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBici.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelBiciLayout = new javax.swing.GroupLayout(panelBici);
        panelBici.setLayout(panelBiciLayout);
        panelBiciLayout.setHorizontalGroup(
            panelBiciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        panelBiciLayout.setVerticalGroup(
            panelBiciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        jMenu3.setText("Productos");

        jMenuItem6.setText("Visualizar Productos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        agregarPro.setText("Agregar Producto");
        agregarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProActionPerformed(evt);
            }
        });
        jMenu3.add(agregarPro);

        actualizarPro.setText("Actualizar Producto");
        actualizarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarProActionPerformed(evt);
            }
        });
        jMenu3.add(actualizarPro);

        eliminarPro.setText("Eliminar Producto");
        eliminarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProActionPerformed(evt);
            }
        });
        jMenu3.add(eliminarPro);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Proveedores");

        jMenuItem1.setText("Ver Proveedores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        agregarProve.setText("Agregar Proveedor");
        agregarProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProveActionPerformed(evt);
            }
        });
        jMenu1.add(agregarProve);

        actualizaeProvee.setText("Actualizar Proveedor");
        actualizaeProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizaeProveeActionPerformed(evt);
            }
        });
        jMenu1.add(actualizaeProvee);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Compra");

        jMenuItem4.setText("Añadir Compra");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem10.setText("Actualizar Compra");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        borrarCompra.setText("Borrar Compra");
        borrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarCompraActionPerformed(evt);
            }
        });
        jMenu2.add(borrarCompra);

        jMenuItem2.setText("Ver Compras");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        buscarProducto.setText("Buscar Compra");
        buscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(buscarProducto);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarProducto();
    }//GEN-LAST:event_agregarProActionPerformed

    private void actualizarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarProActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarProducto();
    }//GEN-LAST:event_actualizarProActionPerformed

    private void eliminarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarProducto();
    }//GEN-LAST:event_eliminarProActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        getInstanciaVerProductos();
        instanciVistaVerProductos.mostrarDatos();    
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void agregarProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProveActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarProveedor();
    }//GEN-LAST:event_agregarProveActionPerformed

    private void actualizaeProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizaeProveeActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarProveedor();
    }//GEN-LAST:event_actualizaeProveeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        getInstanciaVerProveedor();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        getInstanciaAgregarCompra();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        getInstanciaActualizarCompra();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void borrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCompraActionPerformed
        // TODO add your handling code here:
        getInstanciaEliminarCompra();
    }//GEN-LAST:event_borrarCompraActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        getInstanciaVerCompra();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void buscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProductoActionPerformed
        // TODO add your handling code here:
        getInstanciaBuscarCompra();
        
    }//GEN-LAST:event_buscarProductoActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizaeProvee;
    private javax.swing.JMenuItem actualizarPro;
    private javax.swing.JMenuItem agregarPro;
    private javax.swing.JMenuItem agregarProve;
    private javax.swing.JMenuItem borrarCompra;
    private javax.swing.JMenuItem buscarProducto;
    private javax.swing.JMenuItem eliminarPro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel panelBici;
    // End of variables declaration//GEN-END:variables
}
