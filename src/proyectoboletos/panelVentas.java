package proyectoboletos;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class panelVentas extends javax.swing.JPanel {

    /**
     * Creates new form panelprueba
     */
    public panelVentas() {
        initComponents();
        mostrarDatosEnTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBoletos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        txtEliminar = new javax.swing.JTextField();
        btnCrearViaje = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setPreferredSize(new java.awt.Dimension(850, 540));

        tablaBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaBoletos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaBoletos.setRowHeight(40);
        jScrollPane1.setViewportView(tablaBoletos);

        btnBuscar.setBackground(new java.awt.Color(0, 102, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.setFocusable(false);
        btnBuscar.setIconTextGap(10);
        btnBuscar.setMargin(new java.awt.Insets(15, 50, 15, 50));
        btnBuscar.setRolloverEnabled(false);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBusqueda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        txtEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCrearViaje.setBackground(new java.awt.Color(18, 90, 173));
        btnCrearViaje.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrearViaje.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar-flecha.png"))); // NOI18N
        btnCrearViaje.setText("Actualizar Tabla");
        btnCrearViaje.setBorder(null);
        btnCrearViaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearViaje.setFocusPainted(false);
        btnCrearViaje.setFocusable(false);
        btnCrearViaje.setIconTextGap(10);
        btnCrearViaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearViajeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearViajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearViajeMouseExited(evt);
            }
        });
        btnCrearViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearViajeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Boletos Vendidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btnCrearViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //METODOS
    public void mostrarDatosEnTabla() {
        Connection conexion = DBConexion.getConnection();
        if (conexion != null) {
            try {
                Statement statement = conexion.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM boletos");

                // Crear un modelo de tabla
                DefaultTableModel modelo = new DefaultTableModel();
                tablaBoletos.setModel(modelo); // Asegúrate de tener acceso a 'tablaUsuarios'

                // Agregar columnas a la tabla si no existen
                if (modelo.getColumnCount() == 0) {
                    modelo.addColumn("ID");
                    modelo.addColumn("Destino");
                    modelo.addColumn("Fecha");
                    modelo.addColumn("Hora");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Apellido");
                    modelo.addColumn("Asiento");
                    modelo.addColumn("Pago");
                }

                // Limpiar la tabla antes de agregar nuevos datos
                modelo.setRowCount(0);

                // Llenar la tabla con datos de la tabla Viajes
                while (resultSet.next()) {
                    Object[] fila = {
                        resultSet.getInt("IdBoleto"),
                        resultSet.getString("DestinoBoleto"),
                        resultSet.getDate("FechaBoleto"),
                        resultSet.getString("HoraBoleto"),
                        resultSet.getString("NombreComprador"),
                        resultSet.getString("ApellidoComprador"),
                        resultSet.getString("NumeroAsiento"),
                        resultSet.getString("PagoBoleto")

                    };
                    modelo.addRow(fila);
                }

                DBConexion.closeConnection(conexion);

            } catch (SQLException e) {
                System.out.println("Error al ejecutar la consulta: " + e.getMessage());
            }
        }
    }

    public void buscarPorId(int id) {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DBConexion.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM boletos WHERE IdBoleto = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            // Crear un modelo de tabla
                DefaultTableModel modelo = new DefaultTableModel();
                tablaBoletos.setModel(modelo); // Asegúrate de tener acceso a 'tablaUsuarios'

                // Agregar columnas a la tabla si no existen
                if (modelo.getColumnCount() == 0) {
                    modelo.addColumn("ID");
                    modelo.addColumn("Destino");
                    modelo.addColumn("Fecha");
                    modelo.addColumn("Hora");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Apellido");
                    modelo.addColumn("Asiento");
                    modelo.addColumn("Pago");
                }

                // Limpiar la tabla antes de agregar nuevos datos
                modelo.setRowCount(0);

                // Llenar la tabla con datos de la tabla Viajes
                while (resultSet.next()) {
                    Object[] fila = {
                        resultSet.getInt("IdBoleto"),
                        resultSet.getString("DestinoBoleto"),
                        resultSet.getDate("FechaBoleto"),
                        resultSet.getString("HoraBoleto"),
                        resultSet.getString("NombreComprador"),
                        resultSet.getString("ApellidoComprador"),
                        resultSet.getString("NumeroAsiento"),
                        resultSet.getString("PagoBoleto")

                    };
                    modelo.addRow(fila);
                }

                DBConexion.closeConnection(connection);

            } catch (SQLException e) {
                System.out.println("Error al ejecutar la consulta: " + e.getMessage());
            }
        
    }

     public void eliminarRegistro(int idRegistro) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar este registro?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            Connection conexion = DBConexion.getConnection();
            if (conexion != null) {
                try {
                    // Sentencia SQL para eliminar un registro con un ID específico
                    String sqlDelete = "DELETE FROM boletos WHERE IdBoleto = ?";

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
    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int id = Integer.parseInt(txtBusqueda.getText());
        buscarPorId(id);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarMouseEntered

    private void btnBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarMouseExited

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int id = Integer.parseInt(txtEliminar.getText());
        eliminarRegistro(id);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCrearViajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearViajeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearViajeMouseClicked

    private void btnCrearViajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearViajeMouseEntered
        Color miColor = new Color(255, 153, 0);
        btnCrearViaje.setBackground(miColor);
    }//GEN-LAST:event_btnCrearViajeMouseEntered

    private void btnCrearViajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearViajeMouseExited
        Color miColor = new Color(18, 90, 173);
        btnCrearViaje.setBackground(miColor);
    }//GEN-LAST:event_btnCrearViajeMouseExited

    private void btnCrearViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearViajeActionPerformed
        mostrarDatosEnTabla();
    }//GEN-LAST:event_btnCrearViajeActionPerformed

    //METODOS

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearViaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable tablaBoletos;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
