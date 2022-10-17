package swing06;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class Ventana1 extends javax.swing.JFrame {

    public Ventana1() {
        initComponents();
        personalizar_JFrame();
        personalizar_JTextArea();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(swing03.Ventana1.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("TEXTAREA");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void personalizar_JTextArea() {
        //txaContenido.setColumns(80);
        //txaContenido.setRows(5);
        txaContenido.setBackground(Color.BLACK);
        txaContenido.setForeground(Color.WHITE);
        txaContenido.setFont(new Font("Lucida Console", Font.PLAIN, 14));
        txaContenido.setLineWrap(true); // El tope es el ancho del componente
        txaContenido.setWrapStyleWord(true); //Evito que se corte la palabra
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaContenido = new javax.swing.JTextArea();
        cmdActivar = new javax.swing.JButton();
        cmdDesactivar = new javax.swing.JButton();
        cambio = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("TEXTAREA - COMETARIO");
        lblTitulo.setOpaque(true);

        txaContenido.setColumns(20);
        txaContenido.setRows(5);
        jScrollPane1.setViewportView(txaContenido);

        cmdActivar.setText("ACTIVAR");
        cmdActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActivarActionPerformed(evt);
            }
        });

        cmdDesactivar.setText("DESACTIVAR");
        cmdDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDesactivarActionPerformed(evt);
            }
        });

        cambio.setText("ON");
        cambio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cambioItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(cmdActivar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdDesactivar)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(cambio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdActivar)
                    .addComponent(cmdDesactivar))
                .addGap(18, 18, 18)
                .addComponent(cambio)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActivarActionPerformed
        txaContenido.setLineWrap(true);
    }//GEN-LAST:event_cmdActivarActionPerformed

    private void cmdDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDesactivarActionPerformed
        txaContenido.setLineWrap(false);
    }//GEN-LAST:event_cmdDesactivarActionPerformed

    private void cambioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cambioItemStateChanged
        int state = evt.getStateChange();
        System.out.println("Estado: " + state);
        // if selected print selected in console
        if (state == evt.SELECTED) {
            txaContenido.setLineWrap(true);
            cambio.setText("ON");
        } else {

            // else print deselected in console
            txaContenido.setLineWrap(false);
            cambio.setText("OFF");
        }
    }//GEN-LAST:event_cambioItemStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cambio;
    private javax.swing.JButton cmdActivar;
    private javax.swing.JButton cmdDesactivar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaContenido;
    // End of variables declaration//GEN-END:variables
}
