package swing02;

import java.awt.Color;
import java.awt.Toolkit;
import swing01.Ventana5;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    VentanaPar vp = new VentanaPar();
    VentanaImpar vi = new VentanaImpar();

    public VentanaPrincipal() {
        initComponents();
        personalizar_JFrame();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(VentanaPrincipal.class.getResource("mac.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        //this.setSize(500, 500);
        this.setTitle("GUI");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdPar = new javax.swing.JButton();
        cmdImpar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        cmdLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmdPar.setText("VENTANA PAR");
        cmdPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdParActionPerformed(evt);
            }
        });

        cmdImpar.setText("VENTANA IMPAR");
        cmdImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdImparActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("VENTANA PRINCIPAL");
        lblTitulo.setOpaque(true);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdImpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdPar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(cmdPar)
                .addGap(31, 31, 31)
                .addComponent(cmdImpar)
                .addGap(41, 41, 41)
                .addComponent(cmdLimpiar)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdParActionPerformed
        //VentanaPar vp = new VentanaPar();
        vp.setVisible(true);

        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 0) {
                //VENTANA PAR
                VentanaPar.dlm.addElement(i);
            }
        }


    }//GEN-LAST:event_cmdParActionPerformed

    private void cmdImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdImparActionPerformed
        //VentanaImpar vi = new VentanaImpar();
        vi.setVisible(true);

        for (int i = 1; i <= 100; i++) {
            if ((i % 2) != 0) {
                //VENTANA IMPAR
                VentanaImpar.dlm.addElement(i);
            }
        }
    }//GEN-LAST:event_cmdImparActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        VentanaPar.dlm.clear();
        VentanaImpar.dlm.clear();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdImpar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdPar;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
