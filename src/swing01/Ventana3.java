package swing01;

import javax.swing.JOptionPane;

public class Ventana3 extends javax.swing.JFrame {

    public Ventana3() {
        initComponents();
        cntPrincipal.setLayout(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cntPrincipal = new javax.swing.JPanel();
        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        txtR = new javax.swing.JTextField();
        cmdSumar = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        lblN1 = new javax.swing.JLabel();
        lblN2 = new javax.swing.JLabel();
        lblR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULA ARITMETICO");
        setBackground(new java.awt.Color(255, 51, 51));
        setPreferredSize(new java.awt.Dimension(500, 500));

        cntPrincipal.setPreferredSize(new java.awt.Dimension(500, 500));

        txtN1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtN2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtR.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdSumar.setText("Sumar");
        cmdSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSumarActionPerformed(evt);
            }
        });

        cmdNuevo.setText("Nuevo");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });

        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });

        lblN1.setText("Número 1?");

        lblN2.setText("Número 2?");

        lblR.setText("Resultado:");

        javax.swing.GroupLayout cntPrincipalLayout = new javax.swing.GroupLayout(cntPrincipal);
        cntPrincipal.setLayout(cntPrincipalLayout);
        cntPrincipalLayout.setHorizontalGroup(
            cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cntPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cntPrincipalLayout.createSequentialGroup()
                        .addGroup(cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblN1)
                            .addComponent(lblR))
                        .addGap(29, 29, 29)
                        .addGroup(cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtN1)
                            .addComponent(txtN2)
                            .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblN2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        cntPrincipalLayout.setVerticalGroup(
            cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cntPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblN1)
                    .addComponent(cmdSumar))
                .addGap(45, 45, 45)
                .addGroup(cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblN2)
                    .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdNuevo))
                .addGap(37, 37, 37)
                .addGroup(cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblR)
                    .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSalir))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cntPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cntPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSumarActionPerformed
        String patron = "[0-9]+";
        String n1 = txtN1.getText();
        String n2 = txtN2.getText();
        boolean c1 = n1.matches(patron);
        boolean c2 = n2.matches(patron);
        if(c1 && c2) {
           int r = Integer.parseInt(n1) + Integer.parseInt(n2); 
           txtR.setText(String.valueOf(r));
        }else {
            JOptionPane.showMessageDialog(this,"ENTRADA INCORRECTA","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_cmdSumarActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtN1.setText("");
        txtN2.setText("");
        txtR.setText("");
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JButton cmdSumar;
    private javax.swing.JPanel cntPrincipal;
    private javax.swing.JLabel lblN1;
    private javax.swing.JLabel lblN2;
    private javax.swing.JLabel lblR;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    private javax.swing.JTextField txtR;
    // End of variables declaration//GEN-END:variables
}
