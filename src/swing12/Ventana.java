package swing12;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    // BASE DE DATOS
    static String nra = "data/obreros.csv";
    static List<Obrero> obreros_al = null;
    //static List<Obrero> obreros_al = Controlador.leer(nra);

    public Ventana() {
        initComponents();
        personalizar_JFrame();
        cargarArrayList();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("CALCULO SUELDO");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void cargarArrayList() {
        obreros_al = Controlador.leer(nra);
    }

    public void mostrarTodos() {
        if (obreros_al.size() > 0) {
            txaContenido.setText("");
            txtIdObrero.setText("");
            String cabecera = Obrero.cabecera();
            txaContenido.append(cabecera);
            for (Obrero o : obreros_al) {
                String cuerpo = o.cuerpo();
                txaContenido.append(cuerpo);
            }
        } else {
            JOptionPane.showMessageDialog(this, "LISTA DE OBREROS VACIA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtIdObrero = new javax.swing.JTextField();
        lblIdObrero = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaContenido = new javax.swing.JTextArea();
        cmdBuscar = new javax.swing.JButton();
        cmdMostrarTodo = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdAñadir = new javax.swing.JButton();
        cmdActualizar = new javax.swing.JButton();
        cmdConsultas = new javax.swing.JButton();
        cmdSeleccionar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CALCULAR HORAS EXTRAS Y SUELDO");
        lblTitulo.setOpaque(true);

        txtIdObrero.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtIdObrero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblIdObrero.setBackground(new java.awt.Color(0, 0, 0));
        lblIdObrero.setForeground(new java.awt.Color(255, 255, 255));
        lblIdObrero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdObrero.setText("INGRESAR EL ID OBRERO");
        lblIdObrero.setOpaque(true);

        txaContenido.setColumns(20);
        txaContenido.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txaContenido.setRows(5);
        jScrollPane1.setViewportView(txaContenido);

        cmdBuscar.setText("BUSCAR");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });

        cmdMostrarTodo.setText("MOSTRAR TODO");
        cmdMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarTodoActionPerformed(evt);
            }
        });

        cmdEliminar.setText("ELIMINAR");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });

        cmdAñadir.setText("AÑADIR");
        cmdAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAñadirActionPerformed(evt);
            }
        });

        cmdActualizar.setText("ACTUALIZAR");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });

        cmdConsultas.setText("CONSULTAS");
        cmdConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConsultasActionPerformed(evt);
            }
        });

        cmdSeleccionar.setText("SELECCIONAR");
        cmdSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSeleccionarActionPerformed(evt);
            }
        });

        jButton1.setText("ACTUALIZAR CSV");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdObrero, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdObrero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGap(215, 215, 215))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(cmdEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdMostrarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblIdObrero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdObrero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdMostrarTodo)
                    .addComponent(cmdBuscar)
                    .addComponent(cmdEliminar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAñadir)
                    .addComponent(cmdActualizar)
                    .addComponent(cmdConsultas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSeleccionar)
                    .addComponent(jButton1))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        txaContenido.setText("");
        String idObrero = txtIdObrero.getText();
        boolean existe = false;
        for (Obrero o : obreros_al) { //for each
            if (o.getIdObrero().equalsIgnoreCase(idObrero)) {
                String cabecera = Obrero.cabecera();
                String cuerpo = o.cuerpo();
                txaContenido.append(cabecera);
                txaContenido.append(cuerpo);
                existe = true;
            }
        }
        if (!existe) {//existe == false
            JOptionPane.showMessageDialog(this, "ID DE OBRERO NO EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void cmdMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarTodoActionPerformed
        mostrarTodos();
    }//GEN-LAST:event_cmdMostrarTodoActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        txaContenido.setText("");
        String idObrero = txtIdObrero.getText();
        boolean existe = false;
        for (int i = 0; i < obreros_al.size(); i++) { //for each
            Obrero o = obreros_al.get(i);
            if (o.getIdObrero().equalsIgnoreCase(idObrero)) {
                obreros_al.remove(i);
                existe = true;
                mostrarTodos();
                JOptionPane.showMessageDialog(this, "OBRERO FUE ELIMINADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (!existe) {//existe == false
            JOptionPane.showMessageDialog(this, "ID DE OBRERO NO EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAñadirActionPerformed
        VentanaAnadir v = new VentanaAnadir();
        v.setVisible(true);
    }//GEN-LAST:event_cmdAñadirActionPerformed

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
        String idObrero = txtIdObrero.getText();
        if (Controlador.existe(idObrero)) {
            VentanaActualizar v = new VentanaActualizar();
            v.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "ID DE OBRERO NO EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_cmdActualizarActionPerformed

    private void cmdConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConsultasActionPerformed
        VentanaConsultas v = new VentanaConsultas();
        v.setVisible(true);
    }//GEN-LAST:event_cmdConsultasActionPerformed

    private void cmdSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSeleccionarActionPerformed
        VentanaSeleccionarObrero v = new VentanaSeleccionarObrero();
        v.setVisible(true);
    }//GEN-LAST:event_cmdSeleccionarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Controlador.escribir(obreros_al);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JButton cmdAñadir;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdConsultas;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdMostrarTodo;
    private javax.swing.JButton cmdSeleccionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdObrero;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaContenido;
    public static javax.swing.JTextField txtIdObrero;
    // End of variables declaration//GEN-END:variables
}
