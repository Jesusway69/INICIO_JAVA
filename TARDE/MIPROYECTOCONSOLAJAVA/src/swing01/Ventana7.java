package swing01;

import javax.swing.DefaultListModel;

public class Ventana7 extends javax.swing.JFrame {

    DefaultListModel dlmi = new DefaultListModel();
    DefaultListModel dlmd = new DefaultListModel();
    
    public Ventana7() {
        initComponents();
        lstElemento.setModel(dlmi);
        lstInvertir.setModel(dlmd);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstInvertir = new javax.swing.JList<>();
        txfElemento = new javax.swing.JTextField();
        cmdAnadir = new javax.swing.JButton();
        cmdInvertir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstElemento = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ELEMENTOS DINAMICOS JLIST");
        lblTitulo.setOpaque(true);

        lstInvertir.setBackground(new java.awt.Color(0, 0, 0));
        lstInvertir.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        lstInvertir.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(lstInvertir);

        txfElemento.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txfElemento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdAnadir.setText("AÑADIR");
        cmdAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnadirActionPerformed(evt);
            }
        });

        cmdInvertir.setText("INVERTIR --->");
        cmdInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInvertirActionPerformed(evt);
            }
        });

        lstElemento.setBackground(new java.awt.Color(0, 0, 0));
        lstElemento.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        lstElemento.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(lstElemento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfElemento)
                    .addComponent(cmdAnadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdInvertir)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txfElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdInvertir)
                                .addGap(59, 59, 59)))
                        .addComponent(cmdAnadir)
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnadirActionPerformed
        String x = txfElemento.getText();
        dlmi.addElement(x);
    }//GEN-LAST:event_cmdAnadirActionPerformed

    private void cmdInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInvertirActionPerformed
        int longitud = dlmi.size();
        for(int i=longitud-1; i>=0; i--) {
            dlmd.addElement(dlmi.getElementAt(i));
        }
    }//GEN-LAST:event_cmdInvertirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAnadir;
    private javax.swing.JButton cmdInvertir;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstElemento;
    private javax.swing.JList<String> lstInvertir;
    private javax.swing.JTextField txfElemento;
    // End of variables declaration//GEN-END:variables
}
