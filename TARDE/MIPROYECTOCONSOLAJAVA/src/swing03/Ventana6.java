package swing03;

import java.util.TreeSet;
import javax.swing.DefaultListModel;

public class Ventana6 extends javax.swing.JFrame {
    
    DefaultListModel dlm = new DefaultListModel();

    public Ventana6() {
        initComponents();
        llenar_lstClubs();
        lstClubs.setModel(dlm);
    }

    public void llenar_lstClubs() {
        String[] club = {"Atletico de Madrid", "Bilbao", "Barcelona", "Sevilla", "Madrid", "Albacete", "Almeria", "Betis", "Celta"};
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
        cmdOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ORDENAR UN JLIST");
        lblTitulo.setOpaque(true);

        lstClubs.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Gato", "Perro", "Tortuga", "Loro", "Cerdo Vietnamita", "Iguanas", "Serpiente", "Pajarito", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstClubs);

        cmdOrdenar.setText("ORDENAR ALFABETICAMENTE");
        cmdOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(cmdOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(cmdOrdenar)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOrdenarActionPerformed
        TreeSet<String> clubs_ts = new TreeSet<String>();
        for(int i=0; i<dlm.size(); i++) {
            String x = (String)dlm.getElementAt(i);
            clubs_ts.add(x);
        }
        dlm.clear();
        for(String s: clubs_ts) { //for each
            dlm.addElement(s);
        }
    }//GEN-LAST:event_cmdOrdenarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdOrdenar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstClubs;
    // End of variables declaration//GEN-END:variables
}
