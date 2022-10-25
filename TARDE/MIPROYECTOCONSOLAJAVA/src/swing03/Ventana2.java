package swing03;

import javax.swing.DefaultListModel;

public class Ventana2 extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();

    public Ventana2() {
        initComponents();
        llenar_lstClubs();
        lstClubs.setModel(dlm);
    }

    public void llenar_lstClubs() {
        String[] club = {"Atletico de Madrid", "Bilbao", "Barcelona", "Sevilla", "Madrid", "Albacete", "Almeria", "Betis","Celta"};
        for (int i = 0; i < club.length; i++) {
            dlm.addElement(club[i]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstClubs = new javax.swing.JList<>();
        cmdSeleccionar = new javax.swing.JButton();
        lblSalida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("SELECCIONAR CLUBS INICIEN EN LETRA A JLIST");
        lblTitulo.setOpaque(true);

        lstClubs.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Gato", "Perro", "Tortuga", "Loro", "Cerdo Vietnamita", "Iguanas", "Serpiente", "Pajarito", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstClubs);

        cmdSeleccionar.setText("SELECCIONAR INICIO LETRA A");
        cmdSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSeleccionarActionPerformed(evt);
            }
        });

        lblSalida.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblSalida.setForeground(new java.awt.Color(204, 0, 0));
        lblSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalida.setText("AQUI SE PONDRA LOS CLUBS QUE INICIAN LETRA A");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(cmdSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblSalida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(cmdSeleccionar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSeleccionarActionPerformed
        String s = "";
        for(int i=0; i<dlm.size(); i++) {
            String x = (String)dlm.getElementAt(i);
            char letra = x.toUpperCase().charAt(0);
            if(letra == 'A') {
               s = s + x + " ";
            }
        }
        lblSalida.setText(s);

        /*
        int[] v = lstMascotas.getSelectedIndices();
        String s = "";
        for (int i = 0; i < v.length; i++) {
            String elemente = (String) dlm.getElementAt(v[i]); //Gato
            s = s + elemente + " - ";
        }
        s = s.substring(0, s.length() - 3);
        lblSalida.setText(s);
*/
    }//GEN-LAST:event_cmdSeleccionarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdSeleccionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstClubs;
    // End of variables declaration//GEN-END:variables
}
