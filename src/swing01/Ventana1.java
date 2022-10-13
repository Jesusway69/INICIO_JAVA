package swing01;

public class Ventana1 extends javax.swing.JFrame {
    
    public Ventana1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cntPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        cmdNombre = new javax.swing.JButton();
        cmdQNombre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("NOMBRES Y APELLIDOS");
        lblTitulo.setOpaque(true);

        cmdNombre.setBackground(new java.awt.Color(102, 255, 0));
        cmdNombre.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        cmdNombre.setText("PONER NOMBRE");
        cmdNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNombreActionPerformed(evt);
            }
        });

        cmdQNombre.setBackground(new java.awt.Color(255, 51, 51));
        cmdQNombre.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        cmdQNombre.setText("QUITA NOMBRE");
        cmdQNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdQNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cntPrincipalLayout = new javax.swing.GroupLayout(cntPrincipal);
        cntPrincipal.setLayout(cntPrincipalLayout);
        cntPrincipalLayout.setHorizontalGroup(
            cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cntPrincipalLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(cmdNombre)
                .addGap(45, 45, 45)
                .addComponent(cmdQNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        cntPrincipalLayout.setVerticalGroup(
            cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cntPrincipalLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(cntPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdNombre)
                    .addComponent(cmdQNombre))
                .addGap(88, 88, 88))
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

    private void cmdNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNombreActionPerformed
       lblTitulo.setText("Walter Ismael Sagástegui Lescano");
    }//GEN-LAST:event_cmdNombreActionPerformed

    private void cmdQNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdQNombreActionPerformed
       lblTitulo.setText("NOMBRES Y APELLIDOS");
    }//GEN-LAST:event_cmdQNombreActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdNombre;
    private javax.swing.JButton cmdQNombre;
    private javax.swing.JPanel cntPrincipal;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
