/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing01;

import javax.swing.JOptionPane;

/**
 *
 * @author RYZEN
 */
public class Ventana4 extends javax.swing.JFrame {

    public Ventana4() {
        initComponents();
        cntPrincipal.setLayout(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cntPrincipal = new javax.swing.JPanel();
        lblN = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        lblR = new javax.swing.JLabel();
        txtR = new javax.swing.JTextField();
        cmdFactorial = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FACTORIAL");

        lblN.setText("Ingresar N?");

        txtN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblR.setText("Factorial:");

        txtR.setEditable(false);
        txtR.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdFactorial.setText("Factorial");
        cmdFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFactorialActionPerformed(evt);
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

        javax.swing.GroupLayout cntPrincipalLayout = new javax.swing.GroupLayout(cntPrincipal);
        cntPrincipal.setLayout(cntPrincipalLayout);
        cntPrincipalLayout.setHorizontalGroup(
            cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cntPrincipalLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cntPrincipalLayout.createSequentialGroup()
                        .addComponent(lblR)
                        .addGap(29, 29, 29)
                        .addComponent(txtR))
                    .addGroup(cntPrincipalLayout.createSequentialGroup()
                        .addComponent(lblN)
                        .addGap(18, 18, 18)
                        .addComponent(txtN, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                .addGap(39, 39, 39)
                .addGroup(cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdFactorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        cntPrincipalLayout.setVerticalGroup(
            cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cntPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cntPrincipalLayout.createSequentialGroup()
                        .addComponent(cmdFactorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSalir))
                    .addGroup(cntPrincipalLayout.createSequentialGroup()
                        .addGroup(cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblN)
                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblR)
                            .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cntPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cntPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFactorialActionPerformed
        String ns = txtN.getText();
        String patron = "[0-9]+";
        boolean correcto = ns.matches(patron);
        if (correcto) {
            int ni = Integer.parseInt(ns);
            int f = 1;
            for (int i = 1; i <= ni; i++) {
                f = f * i;
            }
            txtR.setText(String.valueOf(f));
        }else {
            JOptionPane.showMessageDialog(this,"ENTRADA INCORRECTA","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmdFactorialActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtN.setText("");
        txtR.setText("");
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdFactorial;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JPanel cntPrincipal;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblR;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtR;
    // End of variables declaration//GEN-END:variables
}
