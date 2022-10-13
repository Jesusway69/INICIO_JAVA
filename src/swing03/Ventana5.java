/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing03;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

/**
 *
 * @author RYZEN
 */
public class Ventana5 extends javax.swing.JFrame {

    ButtonGroup bg = new ButtonGroup();
    EventoRadioButton erb = new EventoRadioButton();

    public Ventana5() {
        initComponents();
        personalizar_JFrame();
        crearGrupoMenu();
        rdo1.addActionListener(erb);
        rdo2.addActionListener(erb);
        rdo3.addActionListener(erb);
    }

    public class EventoRadioButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == rdo1) {
                Ventana1 v1 = new Ventana1();
                v1.setVisible(true);
            }
            if (e.getSource() == rdo2) {
                Ventana2 v2 = new Ventana2();
                v2.setVisible(true);
            }

            if (e.getSource() == rdo3) {
                Ventana3 v3 = new Ventana3();
                v3.setVisible(true);
            }
        }
    }

    public void crearGrupoMenu() {
        bg.add(rdo1);
        bg.add(rdo2);
        bg.add(rdo3);
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana1.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("RADIO BUTTON");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.DARK_GRAY); //Color c: Color.RED, Color.BLUE, 
        //this.getContentPane().setBackground(new Color(255,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        rdo1 = new javax.swing.JRadioButton();
        rdo2 = new javax.swing.JRadioButton();
        rdo3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MENU");
        lblTitulo.setOpaque(true);

        rdo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo1.setForeground(new java.awt.Color(204, 204, 0));
        rdo1.setText("ESTILO");
        rdo1.setOpaque(false);

        rdo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo2.setForeground(new java.awt.Color(204, 204, 0));
        rdo2.setText("TAMAÑO");
        rdo2.setOpaque(false);

        rdo3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo3.setForeground(new java.awt.Color(204, 204, 0));
        rdo3.setText("COLOR");
        rdo3.setOpaque(false);
        rdo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rdo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdo1)
                    .addComponent(rdo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(rdo1)
                .addGap(26, 26, 26)
                .addComponent(rdo2)
                .addGap(36, 36, 36)
                .addComponent(rdo3)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdo3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdo1;
    private javax.swing.JRadioButton rdo2;
    private javax.swing.JRadioButton rdo3;
    // End of variables declaration//GEN-END:variables
}
