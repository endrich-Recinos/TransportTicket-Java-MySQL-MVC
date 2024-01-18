package proyectoboletos;

import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class panelPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form panelprueba
     */
    public panelPrincipal() {
        initComponents();
        panelComprarBoletosPrincipal.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxViaje = new javax.swing.JComboBox<>();
        comboBoxHorario = new javax.swing.JComboBox<>();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        panelComprarBoletosPrincipal = new javax.swing.JPanel();
        label4 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();
        txtAsientos = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtViaje = new javax.swing.JLabel();
        txtHorario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        txtNumeroAsiento = new javax.swing.JLabel();
        txtIdViaje = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(850, 540));

        comboBoxViaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxViaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keste - Campeche", "Campeche - Keste" }));
        comboBoxViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxViajeActionPerformed(evt);
            }
        });

        comboBoxHorario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "05:00 am", "06:00 am", "09:00 am", "11:00 am", "12:30 pm", "02:30 pm" }));

        jDateChooserFecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Fecha:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Horario:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Viaje:");

        btnBuscar.setBackground(new java.awt.Color(0, 102, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar Viajes");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 3));
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

        panelComprarBoletosPrincipal.setBackground(new java.awt.Color(204, 255, 204));

        label4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        label4.setText("Disponibles:");

        label3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        label3.setText("Horario:");

        label.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        label.setText("Viaje: ");

        label2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        label2.setText("Fecha: ");

        btnBuscar1.setBackground(new java.awt.Color(0, 102, 51));
        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito-de-compras.png"))); // NOI18N
        btnBuscar1.setText("Comprar Viaje");
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

        txtAsientos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtAsientos.setText("campeche");

        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFecha.setText("campeche");

        txtViaje.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtViaje.setText("campeche");

        txtHorario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtHorario.setText("campeche");

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Viajes Disponibles");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        label5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        label5.setText("Lugar:");

        txtNumeroAsiento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNumeroAsiento.setText("campeche");

        txtIdViaje.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtIdViaje.setText("campeche");

        label6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        label6.setText("Id viaje:");

        javax.swing.GroupLayout panelComprarBoletosPrincipalLayout = new javax.swing.GroupLayout(panelComprarBoletosPrincipal);
        panelComprarBoletosPrincipal.setLayout(panelComprarBoletosPrincipalLayout);
        panelComprarBoletosPrincipalLayout.setHorizontalGroup(
            panelComprarBoletosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComprarBoletosPrincipalLayout.createSequentialGroup()
                .addGroup(panelComprarBoletosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelComprarBoletosPrincipalLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panelComprarBoletosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelComprarBoletosPrincipalLayout.createSequentialGroup()
                                .addComponent(label4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAsientos))
                            .addGroup(panelComprarBoletosPrincipalLayout.createSequentialGroup()
                                .addComponent(label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelComprarBoletosPrincipalLayout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addGroup(panelComprarBoletosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelComprarBoletosPrincipalLayout.createSequentialGroup()
                                .addComponent(label5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelComprarBoletosPrincipalLayout.createSequentialGroup()
                                .addComponent(label2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(panelComprarBoletosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelComprarBoletosPrincipalLayout.createSequentialGroup()
                        .addComponent(label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelComprarBoletosPrincipalLayout.createSequentialGroup()
                        .addComponent(label6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComprarBoletosPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        panelComprarBoletosPrincipalLayout.setVerticalGroup(
            panelComprarBoletosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComprarBoletosPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(panelComprarBoletosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(panelComprarBoletosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelComprarBoletosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelComprarBoletosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNumeroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(comboBoxViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(comboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelComprarBoletosPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(comboBoxViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(panelComprarBoletosPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //METODOS
    private void showPanel(JPanel p) {
        p.setSize(877, 332);
        p.setLocation(0, 0);
        panelComprarBoletosPrincipal.removeAll();
        panelComprarBoletosPrincipal.add(p, BorderLayout.CENTER);
        panelComprarBoletosPrincipal.revalidate();
        panelComprarBoletosPrincipal.repaint();

    }
        public int numeroBoleto(int asientosExistentes) {
        int[] arregloAscendente = new int[15];
        int[] arregloDescendente = new int[15];
        int valorInverso=84;

        // Llenar el arregloAscendente con valores del 1 al 14
        for (int i = 0; i < 15; i++) {
            arregloAscendente[i] = i + 1;
        }

        // Llenar el arregloDescendente con valores del 14 al 1
        for (int i = 0; i < 14; i++) {
            arregloDescendente[i] = 14 - i;
        }

        int indiceBuscado = asientosExistentes; // Índice que se quiere buscar en el primer arreglo

        if (indiceBuscado >= 0 && indiceBuscado < 15) {
            valorInverso = arregloDescendente[indiceBuscado]+1;
           
        } else {
            System.out.println("Índice fuera de rango");
        }
         return valorInverso;
    }
    
    
    
    public void mostrarInformacionViajeValidado(String trayecto, String fecha, String hora) {
        Connection conexion = DBConexion.getConnection();

        if (conexion != null) {
            try {
                // Sentencia SQL para buscar un registro por los campos especificados
                String sqlBuscar = "SELECT * FROM Viajes WHERE TrayectoViaje = ? AND FechaViaje = ? AND HoraViaje = ?";

                PreparedStatement preparedStatement = conexion.prepareStatement(sqlBuscar);
                preparedStatement.setString(1, trayecto);
                preparedStatement.setString(2, fecha);
                preparedStatement.setString(3, hora);

                ResultSet resultSet = preparedStatement.executeQuery();

                // Verificar si se encontró el viaje con los campos especificados
                if (resultSet.next()) {
                    String trayectoDB = resultSet.getString("TrayectoViaje");
                    String fechaDB = resultSet.getDate("FechaViaje").toString();
                    String horaDB = resultSet.getString("HoraViaje");
                    int asientosDB = resultSet.getInt("CantidadAsientos");
                    int IdDB = resultSet.getInt("IdViaje");
                    int asientoDisponible = numeroBoleto(asientosDB);

                    // Validar los tres campos
                    if (trayectoDB.equals(trayecto) && fechaDB.equals(fecha) && horaDB.equals(hora)) {
                        // Si los campos coinciden, mostrar la información del viaje en JOptionPane
                        String informacionViaje = "Trayecto: " + trayectoDB + "\nFecha: " + fechaDB + "\nHora: " + horaDB + "\nAsientos: " + asientosDB;
                        //JOptionPane.showMessageDialog(null, informacionViaje, "Información del Viaje", JOptionPane.INFORMATION_MESSAGE);
                        txtViaje.setText(trayectoDB);
                        txtFecha.setText(fechaDB);
                        txtHorario.setText(horaDB);
                        txtAsientos.setText("" + asientosDB);
                        txtNumeroAsiento.setText("" + asientoDisponible);
                        txtIdViaje.setText(""+IdDB);
                        panelComprarBoletosPrincipal.setVisible(true);

                    } else {
                        // Si algún campo no coincide, mostrar mensaje de error en JOptionPane
                        JOptionPane.showMessageDialog(null, "Error: Los campos ingresados no coinciden con el viaje encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                        panelComprarBoletosPrincipal.setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un viaje con los campos especificados.", "Error", JOptionPane.ERROR_MESSAGE);
                    panelComprarBoletosPrincipal.setVisible(false);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al buscar el registro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (conexion != null) {
                        conexion.close();
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión a la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
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
    public void actualizar(){
        String Fecha = obtenerFechaFormateada(jDateChooserFecha);
        String Hora = obtenerItemSeleccionado(comboBoxHorario);
        String Viaje = obtenerItemSeleccionado(comboBoxViaje);

        mostrarInformacionViajeValidado(Viaje, Fecha, Hora);
    }


    private void comboBoxViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxViajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxViajeActionPerformed

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        Color miColor = new Color(30, 130, 30);
        btnBuscar.setBackground(miColor);
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        Color miColor = new Color(0, 102, 0);
        btnBuscar.setBackground(miColor);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String Fecha = obtenerFechaFormateada(jDateChooserFecha);
        String Hora = obtenerItemSeleccionado(comboBoxHorario);
        String Viaje = obtenerItemSeleccionado(comboBoxViaje);

        mostrarInformacionViajeValidado(Viaje, Fecha, Hora);


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1MouseEntered

    private void btnBuscar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1MouseExited

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        ventanaDatosBoleto datosBoleto = new ventanaDatosBoleto();
        datosBoleto.setVisible(true);
        
        datosBoleto.valorDestino(txtViaje.getText());
        datosBoleto.valorFecha(txtFecha.getText());
        datosBoleto.valorHorario(txtHorario.getText());
        datosBoleto.valorNumeroAsiento(txtNumeroAsiento.getText());
        datosBoleto.valorCantidadoAsiento(txtAsientos.getText());
        datosBoleto.valorId(txtIdViaje.getText());
        
    }//GEN-LAST:event_btnBuscar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JComboBox<String> comboBoxHorario;
    private javax.swing.JComboBox<String> comboBoxViaje;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JPanel panelComprarBoletosPrincipal;
    private javax.swing.JLabel txtAsientos;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtHorario;
    private javax.swing.JLabel txtIdViaje;
    private javax.swing.JLabel txtNumeroAsiento;
    private javax.swing.JLabel txtViaje;
    // End of variables declaration//GEN-END:variables
}
