package swing15;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Ventana2 extends javax.swing.JFrame {

    ShapedButton sb = new ShapedButton();

    String[] cabecera = {"ID OBRERO", "NOMBRE", "HORAS"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);

    public Ventana2() {
        initComponents();
        personalizar_JFrame();
        personalizar_JTable();
        personalizar_JButton();
    }

    private void personalizar_JButton() {
        cmdGrabar = (JButton) sb.createComponents1();
        cmdInsertar = (JButton) sb.createComponents1();
        cmdLimpiar = (JButton) sb.createComponents1();
    }

    private void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana2.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUI");
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void personalizar_JTable() {
        tblContenido.setModel(dtm);

        tblContenido.setShowGrid(true);
        tblContenido.setBackground(Color.BLACK);
        tblContenido.setForeground(Color.WHITE);
        tblContenido.setFont(new java.awt.Font("Lucida Console", 0, 12));
        tblContenido.setGridColor(Color.BLUE);
        tblContenido.setRowHeight(20);
        tblContenido.setEnabled(true);
        tblContenido.setBorder(new LineBorder(new Color(255, 0, 0)));

        tblContenido.getTableHeader().setBackground(Color.WHITE); // Cambia el color de fondo de la cabecera
        tblContenido.getTableHeader().setForeground(Color.BLACK); // Cambia el color de letra de la cabecera
        tblContenido.getTableHeader().setFont(new java.awt.Font("Verdana", 1, 14)); // Cambia la fuente, estilo y tamaño de letra de la cabecera
        tblContenido.getTableHeader().setBorder(new LineBorder(new Color(255, 0, 0))); // Cambia de color el border de la cabecera

        DefaultTableCellRenderer centerRenderer_center = new DefaultTableCellRenderer();
        centerRenderer_center.setHorizontalAlignment(JLabel.CENTER);
        tblContenido.getColumnModel().getColumn(0).setCellRenderer(centerRenderer_center);
        tblContenido.getColumnModel().getColumn(2).setCellRenderer(centerRenderer_center);

        DefaultTableCellRenderer centerRenderer_left = new DefaultTableCellRenderer();
        centerRenderer_left.setHorizontalAlignment(JLabel.LEFT);
        tblContenido.getColumnModel().getColumn(1).setCellRenderer(centerRenderer_left);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContenido = new javax.swing.JTable();
        cmdGrabar = (JButton) sb.createComponents1();
        cmdInsertar = (JButton) sb.createComponents1();
        cmdLimpiar = (JButton) sb.createComponents1();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(440, 440));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("INSERTAR DATOS EN UN JTABLE");
        lblTitulo.setOpaque(true);

        tblContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblContenido);

        cmdGrabar.setBackground(new java.awt.Color(0, 0, 0));
        cmdGrabar.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        cmdGrabar.setForeground(new java.awt.Color(255, 255, 255));
        cmdGrabar.setText("GRABAR");
        cmdGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGrabarActionPerformed(evt);
            }
        });

        cmdInsertar.setBackground(new java.awt.Color(0, 0, 0));
        cmdInsertar.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        cmdInsertar.setForeground(new java.awt.Color(255, 255, 255));
        cmdInsertar.setText("INSERTAR");
        cmdInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInsertarActionPerformed(evt);
            }
        });

        cmdLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        cmdLimpiar.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        cmdLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        cmdLimpiar.setText("LIMPIAR");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cmdGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(cmdInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdGrabar)
                    .addComponent(cmdInsertar)
                    .addComponent(cmdLimpiar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInsertarActionPerformed
        String[] datos = {"", "", ""};
        dtm.addRow(datos);
    }//GEN-LAST:event_cmdInsertarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        int nf = dtm.getRowCount();
        for (int i = 0; i < nf; i++) {
            dtm.removeRow(0);
        }
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGrabarActionPerformed
        String nra = "src/swing15/obrero.csv";
        int nf = dtm.getRowCount();
        for (int i = 0; i < nf; i++) {
            String c1 = (String) dtm.getValueAt(i, 0);
            String c2 = (String) dtm.getValueAt(i, 1);
            String c3 = (String) dtm.getValueAt(i, 2);
            if (Controlador.correctoIdObrero(c1) && Controlador.correctoNombre(c2) && Controlador.correctoHorasTrabajadasSemana(c3)) {
                String fila = c1 + ";" + c2 + ";" + c3;
                if (Controlador.escribir(nra, fila)) {
                    JOptionPane.showMessageDialog(this, "OK GRABACION OBRERO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "ERROR GRABACION OBRERO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "ENTRADA INCORRECTA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_cmdGrabarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdGrabar;
    private javax.swing.JButton cmdInsertar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblContenido;
    // End of variables declaration//GEN-END:variables
}
