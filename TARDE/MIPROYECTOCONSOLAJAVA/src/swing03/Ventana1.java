package swing03;

import javax.swing.DefaultListModel;

public class Ventana1 extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();
    
    public Ventana1() {
        initComponents();
        lstMascotas.setModel(dlm);
        
        dlm.addElement("Gato");
        dlm.addElement("Perro");
        dlm.addElement("Tortuga");
        dlm.addElement("Lagarto");
        dlm.addElement("Loro");
        dlm.addElement("Iguana");
        dlm.addElement("Pajarito");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMascotas = new javax.swing.JList<>();
        lblMascota = new javax.swing.JLabel();
        cmdSeleccionar = new javax.swing.JButton();
        lblSalida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("SELECCIONAR JLIST");
        lblTitulo.setOpaque(true);

        lstMascotas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Gato", "Perro", "Tortuga", "Loro", "Cerdo Vietnamita", "Iguanas", "Serpiente", "Pajarito", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstMascotas);

        lblMascota.setBackground(new java.awt.Color(51, 51, 51));
        lblMascota.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblMascota.setForeground(new java.awt.Color(255, 255, 255));
        lblMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMascota.setText("MASCOTAS FAVORITAS");
        lblMascota.setOpaque(true);

        cmdSeleccionar.setText("SELECCIONAR");
        cmdSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSeleccionarActionPerformed(evt);
            }
        });

        lblSalida.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblSalida.setForeground(new java.awt.Color(204, 0, 0));
        lblSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalida.setText("AQUI SE PONDRA LAS MASCOTAS SELECCIONADAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(cmdSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(118, 118, 118))
            .addComponent(lblSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblMascota)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblSalida)
                .addGap(27, 27, 27)
                .addComponent(cmdSeleccionar)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSeleccionarActionPerformed
        int[] v = lstMascotas.getSelectedIndices();
        String s = "";
        for(int i=0; i<v.length; i++) {
            String elemente = (String)dlm.getElementAt(v[i]); //Gato
            s = s + elemente + " - ";
        }
        lblSalida.setText(s);
        
    }//GEN-LAST:event_cmdSeleccionarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdSeleccionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMascota;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstMascotas;
    // End of variables declaration//GEN-END:variables
}
