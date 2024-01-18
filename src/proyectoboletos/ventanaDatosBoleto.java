package proyectoboletos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;

import javax.swing.JOptionPane;

import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;
import java.io.InputStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

public class ventanaDatosBoleto extends javax.swing.JFrame {

    public ventanaDatosBoleto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }
    String destino = "";
    String horario = "";
    String fecha = "";
    String canttidadBoletos = "";
    String numeroAsiento = "";
    String id = "";

    public void valorId(String valor) {
        id = valor;
    }

    public void valorDestino(String valor) {
        destino = valor;
    }

    public void valorHorario(String valor) {
        horario = valor;
    }

    public void valorFecha(String valor) {
        fecha = valor;
    }

    public void valorCantidadoAsiento(String valor) {
        canttidadBoletos = valor;
    }

    public void valorNumeroAsiento(String valor) {
        numeroAsiento = valor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        comboBoxCantidadBoletos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboBoxFormaPago = new javax.swing.JComboBox<>();
        btnBuscar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Apellido:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad de boletos:");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        comboBoxCantidadBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxCantidadBoletos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jLabel4.setText("Maximo 5 boletos por compra.");

        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Datos de Comprador");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Forma de pago:");

        comboBoxFormaPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta" }));

        btnBuscar1.setBackground(new java.awt.Color(0, 102, 51));
        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar-el-contorno-del-boton-circular.png"))); // NOI18N
        btnBuscar1.setText("Aceptar");
        btnBuscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 3));
        btnBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar1.setFocusPainted(false);
        btnBuscar1.setFocusable(false);
        btnBuscar1.setIconTextGap(10);
        btnBuscar1.setMargin(new java.awt.Insets(15, 50, 15, 50));
        btnBuscar1.setRolloverEnabled(false);
        btnBuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscar1MouseExited(evt);
            }
        });
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(comboBoxFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(comboBoxCantidadBoletos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxCantidadBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Metodos

    public void actualizarCantidadAsientos(String idViaje, String nuevaCantidad) {
        Connection connection = DBConexion.getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                String updateQuery = "UPDATE viajes SET CantidadAsientos = ? WHERE IdViaje = ?";
                preparedStatement = connection.prepareStatement(updateQuery);
                preparedStatement.setString(1, nuevaCantidad);
                preparedStatement.setString(2, idViaje);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Se ha actualizado la cantidad de asientos exitosamente.");
                } else {
                    System.out.println("No se ha encontrado el IdViaje especificado.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                // Manejar errores de SQL aquí
            } finally {
                if (preparedStatement != null) {
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        // Manejar errores al cerrar la declaración
                    }
                }
                DBConexion.closeConnection(connection);
            }
        } else {
            System.out.println("No se pudo establecer conexión con la base de datos.");
        }
    }

    public static void insertarDatos(String destino, String fecha, String hora, String nombre,
            String apellido, String numeroAsiento, String pago) {
        String sql = "INSERT INTO boletos (DestinoBoleto, FechaBoleto, HoraBoleto, NombreComprador, "
                + "ApellidoComprador, NumeroAsiento, PagoBoleto) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conexion = DBConexion.getConnection(); PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

            // Asignar valores a los parámetros de la sentencia preparada
            preparedStatement.setString(1, destino);
            preparedStatement.setString(2, fecha);
            preparedStatement.setString(3, hora);
            preparedStatement.setString(4, nombre);
            preparedStatement.setString(5, apellido);
            preparedStatement.setString(6, numeroAsiento);
            preparedStatement.setString(7, pago);

            // Ejecutar la consulta
            int filasInsertadas = preparedStatement.executeUpdate();

            if (filasInsertadas > 0) {
                System.out.println("Datos insertados correctamente en la tabla 'boletos'.");
            } else {
                System.out.println("No se pudo insertar los datos en la tabla 'boletos'.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones
        }
    }

    public void realizarAccion(int totalPago) {

        int resultado = totalPago * 50;
        String cantidadBoletosSelecionado = obtenerItemSeleccionado(comboBoxCantidadBoletos);
        String formaPago = obtenerItemSeleccionado(comboBoxFormaPago);
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String numerosBoletos = numerosEnterosEntre(Integer.parseInt(numeroAsiento), Integer.parseInt(numeroAsiento) + Integer.parseInt(cantidadBoletosSelecionado));

        int restaBoletos = Integer.parseInt(canttidadBoletos) - Integer.parseInt(cantidadBoletosSelecionado);
        String update = "" + restaBoletos;

        int respuesta = mostrarConfirmacion("Numero de asientos: " + numerosBoletos + "\n" + "Total a pagar: $" + resultado + " pesos" + "\n", "Confirmación");

        if (respuesta == JOptionPane.YES_OPTION) {
            // Acciones si el usuario elige "Sí"
            System.out.println("El usuario ha confirmado.");
            insertarDatos(destino, fecha, horario, nombre, apellido, numerosBoletos, formaPago);
            actualizarCantidadAsientos(id, update);

            this.dispose();

        } else if (respuesta == JOptionPane.NO_OPTION) {
            // Acciones si el usuario elige "No"
            System.out.println("El usuario ha cancelado.");
        } else if (respuesta == JOptionPane.CLOSED_OPTION) {
            // Acciones si el usuario cierra la ventana
            System.out.println("El usuario cerró la ventana de confirmación.");
        }
    }

    public static int mostrarConfirmacion(String mensaje, String titulo) {
        return JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.YES_NO_OPTION);
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

    public static String numerosEnterosEntre(int inicio, int fin) {
        StringBuilder resultado = new StringBuilder();

        for (int i = inicio; i < fin; i++) {
            resultado.append(i).append(", "); // Agregar el número encontrado al resultado
        }
        // Mostrar el resultado y la cantidad de números enteros encontrados
        String resultadoFinal = resultado.toString();

        return resultadoFinal;
    }

    private void btnBuscar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1MouseEntered

    private void btnBuscar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1MouseExited

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed

        String cantidadBoletos = obtenerItemSeleccionado(comboBoxCantidadBoletos);
        int pagoBoletos = Integer.parseInt(cantidadBoletos);
        realizarAccion(pagoBoletos);

    }//GEN-LAST:event_btnBuscar1ActionPerformed

  
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ventanaDatosBoleto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaDatosBoleto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaDatosBoleto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaDatosBoleto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaDatosBoleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JComboBox<String> comboBoxCantidadBoletos;
    private javax.swing.JComboBox<String> comboBoxFormaPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
