package swing15;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventana2 extends javax.swing.JFrame {

    String[] cabecera = {"ID OBRERO", "NOMBRE", "HORAS"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);

    public Ventana2() {
        initComponents();
        personalizar_JFrame();
        personalizar_JTable();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana1.class.getResource("W2.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setTitle("GUI");
    }
    
    public void personalizar_JTable() {
        tblContenido.setModel(dtm);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContenido = new javax.swing.JTable();
        cmdGrabar = new javax.swing.JButton();
        cmdInsertar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("INSERTAR DATOS EN JTABLE");
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

        cmdGrabar.setText("GRABAR");
        cmdGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGrabarActionPerformed(evt);
            }
        });

        cmdInsertar.setText("INSERTAR");
        cmdInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInsertarActionPerformed(evt);
            }
        });

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
                .addGap(25, 25, 25)
                .addComponent(cmdGrabar)
                .addGap(65, 65, 65)
                .addComponent(cmdInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdLimpiar)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdGrabar)
                    .addComponent(cmdInsertar)
                    .addComponent(cmdLimpiar))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInsertarActionPerformed
        String[] datos = {"","",""};
        dtm.addRow(datos);
    }//GEN-LAST:event_cmdInsertarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
       int nf = dtm.getRowCount();
       for(int i=0; i<nf; i++) {
           dtm.removeRow(0);
       }
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGrabarActionPerformed
        String nra = "src/swing15/obrero.csv";
        int nf = dtm.getRowCount();
        for(int i=0; i<nf; i++) {
            String c1 = (String)dtm.getValueAt(i, 0);
            String c2 = (String)dtm.getValueAt(i, 1);
            String c3 = (String)dtm.getValueAt(i, 2);
            String fila = c1+";"+c2+";"+c3;
            if(Controlador.escribir(nra, fila)) {
                JOptionPane.showMessageDialog(this, "OK GRABACION OBRERO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this, "ERROR GRABACION OBRERO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_cmdGrabarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
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
