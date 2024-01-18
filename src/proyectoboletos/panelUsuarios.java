package proyectoboletos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class panelUsuarios extends javax.swing.JPanel {

    /**
     * Creates new form panelprueba
     */
    public panelUsuarios() {
        initComponents();
        mostrarDatosEnTabla();
        //tablaUsuarios.setEnabled(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setPreferredSize(new java.awt.Dimension(960, 540));

        btnActualizar.setBackground(new java.awt.Color(18, 90, 173));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setFocusPainted(false);
        btnActualizar.setFocusable(false);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        tablaUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaUsuarios.setRowHeight(40);
        jScrollPane1.setViewportView(tablaUsuarios);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuarios del sistema de ventas");

        txtEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnBorrar.setBackground(new java.awt.Color(204, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(null);
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.setFocusPainted(false);
        btnBorrar.setFocusable(false);
        btnBorrar.setIconTextGap(10);
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrarMouseExited(evt);
            }
        });
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Escribe el ID del Usuario que deseas borrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //METODOS
    public boolean verificarClave() {
        String claveValidacion = "combiskeste1234";

        String claveIngresada = JOptionPane.showInputDialog(null, "Ingresa la clave:");

        if (claveIngresada != null && claveIngresada.equals(claveValidacion)) {
            JOptionPane.showMessageDialog(null, "¡Acceso concedido!");
            return true; // La clave es correcta, devuelve true
        } else {
            JOptionPane.showMessageDialog(null, "Error: Clave incorrecta o cancelada.");
            return false; // La clave es incorrecta, devuelve false
        }
    }

    public void mostrarDatosEnTabla() {
        Connection conexion = DBConexion.getConnection();
        if (conexion != null) {
            try {
                Statement statement = conexion.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios");

                // Crear un modelo de tabla
                DefaultTableModel modelo = new DefaultTableModel();
                tablaUsuarios.setModel(modelo);

                // Agregar columnas a la tabla si no existen
                if (modelo.getColumnCount() == 0) {
                    modelo.addColumn("ID");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Teléfono");
                    //modelo.addColumn("Contraseña");
                }

                // Limpiar la tabla antes de agregar nuevos datos
                modelo.setRowCount(0);

                // Llenar la tabla con datos
                while (resultSet.next()) {
                    Object[] fila = {
                        resultSet.getInt("IdUsuario"),
                        resultSet.getString("NombreUsuario"),
                        resultSet.getString("NumeroTelefono"), //resultSet.getString("PasswordUsuario")
                    };
                    modelo.addRow(fila);
                }

                DBConexion.closeConnection(conexion);

            } catch (SQLException e) {
                System.out.println("Error al ejecutar la consulta: " + e.getMessage());
            }
        }
    }

    public void eliminarRegistro(int idRegistro) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar este registro?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            Connection conexion = DBConexion.getConnection();
            if (conexion != null) {
                try {
                    // Sentencia SQL para eliminar un registro con un ID específico
                    String sqlDelete = "DELETE FROM usuarios WHERE IdUsuario = ?";

                    PreparedStatement preparedStatement = conexion.prepareStatement(sqlDelete);
                    preparedStatement.setInt(1, idRegistro);

                    int filasEliminadas = preparedStatement.executeUpdate();

                    if (filasEliminadas > 0) {
                        System.out.println("Registro eliminado correctamente.");
                        // Aquí puedes actualizar la tabla visual si es necesario
                        mostrarDatosEnTabla();

                    } else {
                        System.out.println("No se pudo eliminar el registro.");
                    }

                    preparedStatement.close();
                    DBConexion.closeConnection(conexion);

                } catch (SQLException e) {
                    System.out.println("Error al eliminar el registro: " + e.getMessage());
                }
            }
        } else {
            System.out.println("Eliminación cancelada por el usuario.");
        }

    }
    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        Color miColor = new Color(255, 153, 0);
        btnActualizar.setBackground(miColor);
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        Color miColor = new Color(18, 90, 173);
        btnActualizar.setBackground(miColor);
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        mostrarDatosEnTabla();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarMouseEntered

    private void btnBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarMouseExited

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        boolean claveCorrecta = verificarClave();

        if (claveCorrecta) {
            // Hacer algo si la clave es correcta
            int id = Integer.parseInt(txtEliminar.getText());
            eliminarRegistro(id);
        } else {
            // Hacer algo si la clave es incorrecta
            System.out.println("La clave es incorrecta, no se puede proceder con la acción.");
        }


    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
