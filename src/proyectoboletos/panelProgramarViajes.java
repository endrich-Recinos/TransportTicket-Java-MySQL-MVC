package proyectoboletos;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class panelProgramarViajes extends javax.swing.JPanel {

    /**
     * Creates new form panelprueba
     */
    public panelProgramarViajes() {
        initComponents();
        mostrarDatosViajesEnTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        comboBoxViaje = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxHorario = new javax.swing.JComboBox<>();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btnCrearViaje = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaViajes = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtEliminar = new javax.swing.JTextField();
        btnCrearViaje1 = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        setPreferredSize(new java.awt.Dimension(960, 537));

        comboBoxViaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxViaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keste - Campeche", "Campeche - Keste" }));
        comboBoxViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxViajeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Viaje:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Horario:");

        comboBoxHorario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "05:00 am", "06:00 am", "09:00 am", "11:00 am", "12:30 pm", "02:30 pm", "04:00PM" }));
        comboBoxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHorarioActionPerformed(evt);
            }
        });

        jDateChooserFecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Fecha:");

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

        tablaViajes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaViajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaViajes.setRowHeight(40);
        jScrollPane1.setViewportView(tablaViajes);

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

        txtEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCrearViaje1.setBackground(new java.awt.Color(18, 90, 173));
        btnCrearViaje1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCrearViaje1.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearViaje1.setText("Crear Viaje");
        btnCrearViaje1.setBorder(null);
        btnCrearViaje1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearViaje1.setFocusPainted(false);
        btnCrearViaje1.setFocusable(false);
        btnCrearViaje1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearViaje1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearViaje1MouseExited(evt);
            }
        });
        btnCrearViaje1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearViaje1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrearViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCrearViaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearViaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //METODS
    public void agregarViaje(String trayecto, String fecha, String hora) {
        Connection connection = DBConexion.getConnection();
        if (connection != null) {
            try {
                // El campo CantidadAsientos siempre es 14, así que no se necesita como parámetro
                int cantidadAsientos = 14;

                // Sentencia SQL para insertar datos en la tabla Viajes
                String query = "INSERT INTO Viajes (TrayectoViaje, FechaViaje, HoraViaje, CantidadAsientos) VALUES (?, ?, ?, ?)";

                // Preparar la declaración SQL
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, trayecto);
                preparedStatement.setString(2, fecha);
                preparedStatement.setString(3, hora);
                preparedStatement.setInt(4, cantidadAsientos);

                // Ejecutar la actualización (insertar datos)
                int filasInsertadas = preparedStatement.executeUpdate();
                if (filasInsertadas > 0) {
                    JOptionPane.showMessageDialog(null, "¡Datos insertados correctamente!");
                } else {

                    String mensaje = "No se pudieron insertar los datos.";
                    JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                }
                // Cerrar la conexión y liberar recursos
                preparedStatement.close();
                DBConexion.closeConnection(connection);

            } catch (SQLException e) {
                e.printStackTrace();
                // Manejar errores de SQL aquí
            }
        }
    }

    public static String obtenerItemSeleccionado(JComboBox comboBox) {
        Object itemSeleccionado = comboBox.getSelectedItem();

        if (itemSeleccionado != null) {
            String valorSeleccionado = itemSeleccionado.toString();
            return valorSeleccionado;
        } else {
            return null;
        }
    }

    public static String obtenerFechaFormateada(JDateChooser dateChooser) {
        Date fechaSeleccionada = dateChooser.getDate();

        if (fechaSeleccionada != null) {
            // Crear un objeto SimpleDateFormat para formatear la fecha
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

            // Formatear la fecha seleccionada al formato deseado (día/mes/año)
            String fechaFormateada = formatoFecha.format(fechaSeleccionada);

            return fechaFormateada;
        } else {
            return null;
        }

    }

    public void mostrarDatosViajesEnTabla() {
        Connection conexion = DBConexion.getConnection();
        if (conexion != null) {
            try {
                Statement statement = conexion.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM viajes");

                // Crear un modelo de tabla
                DefaultTableModel modelo = new DefaultTableModel();
                tablaViajes.setModel(modelo); // Asegúrate de tener acceso a 'tablaUsuarios'

                // Agregar columnas a la tabla si no existen
                if (modelo.getColumnCount() == 0) {
                    modelo.addColumn("ID");
                    modelo.addColumn("Trayecto");
                    modelo.addColumn("Fecha");
                    modelo.addColumn("Hora");
                    modelo.addColumn("Asientos");
                }

                // Limpiar la tabla antes de agregar nuevos datos
                modelo.setRowCount(0);

                // Llenar la tabla con datos de la tabla Viajes
                while (resultSet.next()) {
                    Object[] fila = {
                        resultSet.getInt("IdViaje"),
                        resultSet.getString("TrayectoViaje"),
                        resultSet.getDate("FechaViaje"),
                        resultSet.getString("HoraViaje"),
                        resultSet.getInt("CantidadAsientos")
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
                    String sqlDelete = "DELETE FROM viajes WHERE IdViaje = ?";

                    PreparedStatement preparedStatement = conexion.prepareStatement(sqlDelete);
                    preparedStatement.setInt(1, idRegistro);

                    int filasEliminadas = preparedStatement.executeUpdate();

                    if (filasEliminadas > 0) {
                        System.out.println("Registro eliminado correctamente.");
                        // Aquí puedes actualizar la tabla visual si es necesario
                        mostrarDatosViajesEnTabla();

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

    
    public void mostrarViajePorID(int idViaje) {
        Connection conexion = DBConexion.getConnection();
        if (conexion != null) {
            try {
                // Sentencia SQL para buscar un registro por su ID
                String sqlBuscar = "SELECT * FROM viajes WHERE IdViaje = ?";

                PreparedStatement preparedStatement = conexion.prepareStatement(sqlBuscar);
                preparedStatement.setInt(1, idViaje);

                ResultSet resultSet = preparedStatement.executeQuery();

                // Crear un modelo de tabla
                DefaultTableModel modelo = new DefaultTableModel();
                tablaViajes.setModel(modelo); // Asegúrate de tener acceso a 'tablaUsuarios'

                // Agregar columnas a la tabla si no existen
                if (modelo.getColumnCount() == 0) {
                    modelo.addColumn("ID");
                    modelo.addColumn("Trayecto");
                    modelo.addColumn("Fecha");
                    modelo.addColumn("Hora");
                    modelo.addColumn("Asientos");
                }

                // Limpiar la tabla antes de agregar nuevos datos
                modelo.setRowCount(0);

                // Llenar la tabla con el registro encontrado
                while (resultSet.next()) {
                    Object[] fila = {
                        resultSet.getString("IdViaje"),
                        resultSet.getString("TrayectoViaje"),
                        resultSet.getDate("FechaViaje"),
                        resultSet.getString("HoraViaje"),
                        resultSet.getInt("CantidadAsientos")
                    };
                    modelo.addRow(fila);
                }

                preparedStatement.close();
                DBConexion.closeConnection(conexion);

            } catch (SQLException e) {
                System.out.println("Error al buscar el registro: " + e.getMessage());
            }
        }
    }


    private void btnCrearViajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearViajeMouseEntered
        Color miColor = new Color(255, 153, 0);
        btnCrearViaje.setBackground(miColor);
    }//GEN-LAST:event_btnCrearViajeMouseEntered

    private void btnCrearViajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearViajeMouseExited
        Color miColor = new Color(18, 90, 173);
        btnCrearViaje.setBackground(miColor);
    }//GEN-LAST:event_btnCrearViajeMouseExited

    private void btnCrearViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearViajeActionPerformed

        mostrarDatosViajesEnTabla();

    }//GEN-LAST:event_btnCrearViajeActionPerformed

    private void comboBoxViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxViajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxViajeActionPerformed

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

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int id = Integer.parseInt(txtBusqueda.getText());
        mostrarViajePorID(id);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCrearViaje1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearViaje1MouseEntered
        Color miColor = new Color(255, 153, 0);
        btnCrearViaje1.setBackground(miColor);
    }//GEN-LAST:event_btnCrearViaje1MouseEntered

    private void btnCrearViaje1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearViaje1MouseExited
        Color miColor = new Color(18, 90, 173);
        btnCrearViaje1.setBackground(miColor);
    }//GEN-LAST:event_btnCrearViaje1MouseExited

    private void btnCrearViaje1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearViaje1ActionPerformed

        String Fecha = obtenerFechaFormateada(jDateChooserFecha);
        String Hora = obtenerItemSeleccionado(comboBoxHorario);
        String Viaje = obtenerItemSeleccionado(comboBoxViaje);
        agregarViaje(Viaje, Fecha, Hora);
        mostrarDatosViajesEnTabla();
    }//GEN-LAST:event_btnCrearViaje1ActionPerformed

    private void comboBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxHorarioActionPerformed

    private void btnCrearViajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearViajeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearViajeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearViaje;
    private javax.swing.JButton btnCrearViaje1;
    private javax.swing.JComboBox<String> comboBoxHorario;
    private javax.swing.JComboBox<String> comboBoxViaje;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable tablaViajes;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
