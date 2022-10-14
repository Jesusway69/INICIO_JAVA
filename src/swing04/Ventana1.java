package swing04;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;


public class Ventana1 extends javax.swing.JFrame {
    
    List<JCheckBox> checkboxs_al = new ArrayList<JCheckBox>();

    public Ventana1() {
        initComponents();
        guardarCheckBoxArrayList();
    }
    
    public void guardarCheckBoxArrayList() {
        chkMadrid.setName("Madrid");
        chkBarcelona.setName("Barcelona");
        chkSevilla.setName("Sevilla");
        chkBilbao.setName("Bilbao");
        checkboxs_al.add(chkMadrid);
        checkboxs_al.add(chkSevilla);
        checkboxs_al.add(chkBarcelona);
        checkboxs_al.add(chkBilbao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        chkMadrid = new javax.swing.JCheckBox();
        chkSevilla = new javax.swing.JCheckBox();
        chkBarcelona = new javax.swing.JCheckBox();
        chkBilbao = new javax.swing.JCheckBox();
        cmdAceptar = new javax.swing.JButton();
        cmdResetear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PONER LOS CHECKBOX SELECCIONADOS EN LA LISTA");
        lblTitulo.setOpaque(true);

        chkMadrid.setText("Madrid");

        chkSevilla.setText("Sevilla");

        chkBarcelona.setText("Barcelona");

        chkBilbao.setText("Bilbao");

        cmdAceptar.setText("ACEPTAR");
        cmdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAceptarActionPerformed(evt);
            }
        });

        cmdResetear.setText("RESETEAR");
        cmdResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdResetearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(chkMadrid)
                .addGap(36, 36, 36)
                .addComponent(chkSevilla)
                .addGap(33, 33, 33)
                .addComponent(chkBarcelona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkBilbao)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(cmdAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdResetear)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSevilla)
                    .addComponent(chkMadrid)
                    .addComponent(chkBarcelona)
                    .addComponent(chkBilbao))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAceptar)
                    .addComponent(cmdResetear))
                .addGap(0, 96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAceptarActionPerformed
        String a = "";
        for(int i=0; i<checkboxs_al.size(); i++) {
           JCheckBox x = checkboxs_al.get(i);
           if(x.isSelected() == true) {
              //System.out.println(x.getName());
              a = a + x.getName() + " - ";
           }
       }
       a = a.substring(0,a.length()-3);
       lblTitulo.setText(a);
    }//GEN-LAST:event_cmdAceptarActionPerformed

    private void cmdResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdResetearActionPerformed
       for(int i=0; i<checkboxs_al.size(); i++) {
           JCheckBox x = checkboxs_al.get(i);
           x.setSelected(false);
       }
       lblTitulo.setText("PONER AQUI LOS CHECKBOX SELECCIONADOS");
    }//GEN-LAST:event_cmdResetearActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkBarcelona;
    private javax.swing.JCheckBox chkBilbao;
    private javax.swing.JCheckBox chkMadrid;
    private javax.swing.JCheckBox chkSevilla;
    private javax.swing.JButton cmdAceptar;
    private javax.swing.JButton cmdResetear;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
