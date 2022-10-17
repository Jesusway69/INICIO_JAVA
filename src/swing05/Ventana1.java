package swing05;

import java.awt.Color;
import java.awt.Toolkit;

public class Ventana1 extends javax.swing.JFrame {

    public Ventana1() {
        initComponents();
        personalizar_JFrame();
        personalizar_JComboBox();
        cargar_elementos_cboCiudad();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(swing03.Ventana1.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("COMBOBOX");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.DARK_GRAY); //Color c: Color.RED, Color.BLUE, 
        //this.getContentPane().setBackground(new Color(255,0,0));
    }

    public void personalizar_JComboBox() {
        cboCiudad.setFont(new java.awt.Font("Courier New", 0, 12));
        cboCiudad.setOpaque(false);
        cboCiudad.setBackground(Color.BLACK);
        cboCiudad.setForeground(Color.WHITE);
    }

    public void cargar_elementos_cboCiudad() {
        cboCiudad.addItem("Barcelona");
        cboCiudad.addItem("Bilbao");
        cboCiudad.addItem("Madrid");
        cboCiudad.addItem("Sevilla");
        cboCiudad.addItem("Valencia");
        cboCiudad.addItem("Zaragoza");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        cboCiudad = new javax.swing.JComboBox<>();
        lblMensaje = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        cmdAnadir = new javax.swing.JButton();
        cmdRemover = new javax.swing.JButton();
        cmdRecuperarTodos = new javax.swing.JButton();
        lblTodos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("COMBOBOX - CIUDADES ESPAÑA");
        lblTitulo.setOpaque(true);

        cboCiudad.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cboCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCiudadItemStateChanged(evt);
            }
        });

        lblMensaje.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("PONER INFORMACION DE LA CIUDAD SELECCIONADA");

        txtCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdAnadir.setText("AÑADIR");
        cmdAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnadirActionPerformed(evt);
            }
        });

        cmdRemover.setText("REMOVER");
        cmdRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRemoverActionPerformed(evt);
            }
        });

        cmdRecuperarTodos.setText("RECUPERAR");
        cmdRecuperarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRecuperarTodosActionPerformed(evt);
            }
        });

        lblTodos.setForeground(new java.awt.Color(255, 255, 255));
        lblTodos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTodos.setText("MOSTRAR TODOS LOS ELEMENTOS DEL COMBOBOX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cmdAnadir)
                .addGap(31, 31, 31)
                .addComponent(cmdRemover)
                .addGap(49, 49, 49)
                .addComponent(cmdRecuperarTodos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblMensaje)
                .addGap(29, 29, 29)
                .addComponent(cboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAnadir)
                    .addComponent(cmdRemover)
                    .addComponent(cmdRecuperarTodos))
                .addGap(18, 18, 18)
                .addComponent(lblTodos)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCiudadItemStateChanged
        String ciudad = (String) cboCiudad.getSelectedItem();
        txtCiudad.setText(ciudad);
        switch (ciudad) {
            case "Madrid":
                lblMensaje.setText("MADRID ES CAPITAL DEL REYNO DE ESPAÑA");
                break;
            case "Barcelona":
                lblMensaje.setText("BARCELONA ES CAPITAL DE LA CA DE CATALUÑA");
                break;
            case "Sevilla":
                lblMensaje.setText("SEVILLA ES CAPITAL DE LA CA DE ANDALUCIA");
                break;
            case "Bilbao":
                lblMensaje.setText("BILBAO ES CAPITAL DE LA PROVINCIA DE VIZCAYA");
                break;
            case "Zaragoza":
                lblMensaje.setText("ZARAGOZA ES CAPITAL DE LA CA DE ARAGON");
                break;
            default:
                lblMensaje.setText("NO TENGO INFORMACION");
        }
    }//GEN-LAST:event_cboCiudadItemStateChanged

    private void cmdAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnadirActionPerformed
        cboCiudad.addItem(txtCiudad.getText());
    }//GEN-LAST:event_cmdAnadirActionPerformed

    private void cmdRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRemoverActionPerformed
        cboCiudad.removeItem(txtCiudad.getText());
    }//GEN-LAST:event_cmdRemoverActionPerformed

    private void cmdRecuperarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRecuperarTodosActionPerformed
        String a = "";
        for(int i=0; i<cboCiudad.getItemCount(); i++) {
            String ciudad = cboCiudad.getItemAt(i);
            a = a + ciudad + " - ";
        }
        a = a.substring(0,a.length()-3);
        lblTodos.setText(a);
    }//GEN-LAST:event_cmdRecuperarTodosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCiudad;
    private javax.swing.JButton cmdAnadir;
    private javax.swing.JButton cmdRecuperarTodos;
    private javax.swing.JButton cmdRemover;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTodos;
    private javax.swing.JTextField txtCiudad;
    // End of variables declaration//GEN-END:variables
}
