package com.jhonatan.tiendainformatica.iu;

import com.jhonatan.tiendainformatica.ImplementacioDao.DaoImpleFabricante;
import com.jhonatan.tiendainformatica.datos.Fabricante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class frmFabricante extends javax.swing.JFrame {

    private final String[] COLUMNAS = {"ID MARCA", "MARCA", "CANTIDAD DE PRODUCTOS"};
    private final DaoImpleFabricante daoImpleFabricante = new DaoImpleFabricante();
    DefaultTableModel modelo = new DefaultTableModel(COLUMNAS, 0);

    public frmFabricante() {
        initComponents();
        this.mostrarDatosTabla();
        // this.configurarTemporizador();
        txtId.setVisible(false);
    }

    // Método para configurar el temporizador y refrescar la tabla cada 5 segundos
    private void configurarTemporizador() {
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Llama al método que actualiza la tabla
                mostrarDatosTabla();
            }
        });
        timer.start(); // Inicia el temporizador

        // Llama al método para actualizar la tabla inmediatamente al inicio
        mostrarDatosTabla();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNombres = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFabricantes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Marca:"));

        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese el Nombre de la Marca:"));
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresKeyReleased(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtId.setEditable(false);
        txtId.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtNombres)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE MARCAS");

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTADO DE MARCAS:"));

        tblFabricantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID FABRICANTE", "FABRICANTE", "CANTIDAD DE PRODUCTOS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblFabricantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFabricantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFabricantes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones:"));

        btnEliminar.setText("Modificar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEliminar1.setText("Buscar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnEliminar2.setText("Eliminar");
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addGap(102, 102, 102))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblFabricantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFabricantesMouseClicked
        this.seleccionarFabricante();
    }//GEN-LAST:event_tblFabricantesMouseClicked

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
        this.eliminarFabricante();
    }//GEN-LAST:event_btnEliminar2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.agregarFabricante();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.modificarFabricante();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyReleased
        // this.buscarFabricante();

    }//GEN-LAST:event_txtNombresKeyReleased

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        this.buscarFabricante();
    }//GEN-LAST:event_btnEliminar1ActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFabricante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFabricantes;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatosTabla() {
        limpiarTabla();
        daoImpleFabricante.listarFabricantesTabla(modelo, tblFabricantes, "", 2);
    }

    public void limpiarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    private void seleccionarFabricante() {
        int fila = tblFabricantes.getSelectedRow();
        if (fila < -1) {
            JOptionPane.showMessageDialog(rootPane, "Por favor debe seleccionar un fila.", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String nombre;
            Long idFabricante;
            nombre = String.valueOf(tblFabricantes.getValueAt(fila, 1));
            idFabricante = (Long) tblFabricantes.getValueAt(fila, 0);
            txtId.setText(String.valueOf(idFabricante));
            txtNombres.setText(nombre);
        }
    }

    private void eliminarFabricante() {
        int[] filas = tblFabricantes.getSelectedRows();
        if (filas.length == 0) {
            JOptionPane.showMessageDialog(rootPane, "Por favor debe seleccionar una o más filas para poder eliminar.", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder ids = new StringBuilder();
        for (int i = 0; i < filas.length; i++) {
            Long idFabricantes = (Long) tblFabricantes.getValueAt(filas[i], 0);
            if (ids.length() > 0) {
                ids.append(", ");
            }
            ids.append(idFabricantes.toString());
        }

        int opcion = JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro de eliminar los registros con los id: " + ids.toString() + "?", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) {
            for (int i = filas.length - 1; i >= 0; i--) {
                Long idFabricante = (Long) tblFabricantes.getValueAt(filas[i], 0); // Usa Long aquí
                Fabricante fabricanteEliminado = new Fabricante(idFabricante.intValue()); // Convierte Long a int si es necesario
                int eliminar = daoImpleFabricante.eliminarFabricante(fabricanteEliminado);
                if (eliminar == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Algunos de los productos tienen productos, no se pueden eliminar", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
                    break;
                } else {
                    modelo.removeRow(filas[i]);
                    JOptionPane.showMessageDialog(rootPane, "REGISTROS ELIMINADOS");
                }
            }
        }
        mostrarDatosTabla();
        txtNombres.setText(null);
    }

    private void agregarFabricante() {
        if (txtNombres.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese el nombre del fabricante.", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
            txtNombres.requestFocus();
        } else {
            String nombreFabricante;
            nombreFabricante = txtNombres.getText();
            Fabricante nuevoFabricante = new Fabricante();
            nuevoFabricante.setNombre(nombreFabricante);
            if (!daoImpleFabricante.nombreRepetido(nombreFabricante)) {
                daoImpleFabricante.insertarFabricante(nuevoFabricante);
                JOptionPane.showMessageDialog(rootPane, "FABRICANTE " + nombreFabricante + " AGREGADO CORRECTAMENTE", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
                mostrarDatosTabla();
                txtNombres.setText(null);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Fabricante Repetido", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void modificarFabricante() {
        if (txtNombres.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleciona el fabricante a modificar", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String nombre;
            int id;
            nombre = txtNombres.getText();
            id = Integer.parseInt(txtId.getText());
            Fabricante fabricanteModificado = new Fabricante(id, nombre);
            daoImpleFabricante.modificarFabricante(fabricanteModificado);
            JOptionPane.showMessageDialog(rootPane, "Fabricante modificado.", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
            mostrarDatosTabla();
        }
    }

    private void buscarFabricante() {
        String nombreFabricante;
        nombreFabricante = txtNombres.getText();
        daoImpleFabricante.listarFabricantesTabla(modelo, tblFabricantes, nombreFabricante, 1);
    }
}
