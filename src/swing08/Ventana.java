package swing08;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class Ventana extends JFrame {

    ButtonGroup bg = new ButtonGroup();
    EventoRadioButton erb = new EventoRadioButton();

    DefaultListModel dlm0 = new DefaultListModel();
    DefaultListModel dlm1 = new DefaultListModel();
    DefaultListModel dlm2 = new DefaultListModel();

    VentanaWhile vw = new VentanaWhile();
    DefaultListModel dlmWhile = vw.getModelo();

    VentanaDoWhile vd = new VentanaDoWhile();
    DefaultListModel dlmDoWhile = vd.getModelo();

    VentanaFor vf = new VentanaFor();
    DefaultListModel dlmFor = vf.getModelo();

    public Ventana() {
        initComponents();
        personalizar_JFrame();
        crearGrupo();
        lst0.setModel(dlm0);
        lst1.setModel(dlm1);
        lst2.setModel(dlm2);
        rdo0.addActionListener(erb);
        rdo1.addActionListener(erb);
        rdo2.addActionListener(erb);
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(swing03.Ventana1.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("PRINCIPAL");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void crearGrupo() {
        bg.add(rdo0);
        bg.add(rdo1);
        bg.add(rdo2);
    }

    public void bucleWhile() {
        vw.setVisible(true);

        dlm0.clear();
        dlmWhile.clear();
        int i = 1;// Inicio
        while (i <= 100) { // Test = Condición de parada
            //System.out.println(i);
            dlm0.addElement(i);
            dlmWhile.addElement(i);
            i++; // Incremento
        }
    }

    public void bucleDoWhile() {
        vd.setVisible(true);

        dlm1.clear();
        dlmDoWhile.clear();
        int i = 1; // Inicio
        do {
            //System.out.println(i);
            dlm1.addElement(i);
            dlmDoWhile.addElement(i);
            i++; // Incremento
        } while (i <= 100); // Test = Condición de parada

    }

    public void bucleFor() {
        vf.setVisible(true);

        dlm2.clear();
        dlmFor.clear();
        for (int i = 1; i <= 100; i++) {
            //System.out.println(i);
            dlm2.addElement(i);
            dlmFor.addElement(i);
        }
    }

    public class EventoRadioButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == rdo0) {
                bucleWhile();
            }
            if (e.getSource() == rdo1) {
                bucleDoWhile();
            }
            if (e.getSource() == rdo2) {
                bucleFor();
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        rdo0 = new javax.swing.JRadioButton();
        rdo1 = new javax.swing.JRadioButton();
        rdo2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst2 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lst0 = new javax.swing.JList<>();
        cmdReset = new javax.swing.JButton();
        cmdCerrarVentanaHijos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("WHILE - DO..WHILE - FOR");
        lblTitulo.setOpaque(true);

        rdo0.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        rdo0.setText("While");

        rdo1.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        rdo1.setText("Do...While");

        rdo2.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        rdo2.setText("For");

        jScrollPane1.setViewportView(lst2);

        jScrollPane2.setViewportView(lst1);

        jScrollPane3.setViewportView(lst0);

        cmdReset.setText("RESET");
        cmdReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdResetActionPerformed(evt);
            }
        });

        cmdCerrarVentanaHijos.setText("CLOSE");
        cmdCerrarVentanaHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCerrarVentanaHijosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdo0)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdo1))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdo2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(cmdReset, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdCerrarVentanaHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo0)
                    .addComponent(rdo1)
                    .addComponent(rdo2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCerrarVentanaHijos)
                    .addComponent(cmdReset))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdResetActionPerformed
        dlm0.clear();
        dlm1.clear();
        dlm2.clear();
        dlmWhile.clear();
        dlmDoWhile.clear();
        dlmFor.clear();
        bg.clearSelection();
    }//GEN-LAST:event_cmdResetActionPerformed

    private void cmdCerrarVentanaHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCerrarVentanaHijosActionPerformed
        vw.setVisible(false);
        vd.setVisible(false);
        vf.setVisible(false);
    }//GEN-LAST:event_cmdCerrarVentanaHijosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCerrarVentanaHijos;
    private javax.swing.JButton cmdReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lst0;
    private javax.swing.JList<String> lst1;
    private javax.swing.JList<String> lst2;
    private javax.swing.JRadioButton rdo0;
    private javax.swing.JRadioButton rdo1;
    private javax.swing.JRadioButton rdo2;
    // End of variables declaration//GEN-END:variables
}
