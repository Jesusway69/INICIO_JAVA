package swing10;

import java.awt.Toolkit;
import javax.swing.DefaultListModel;

public class Ventana extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();

    public Ventana() {
        initComponents();
        personalizar_JFrame();
        lstSalida.setModel(dlm);
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUI");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        txtPatron = new javax.swing.JTextField();
        lblPatron = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSalida = new javax.swing.JList<>();
        cmdSeparar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("SEPARAR PALABRAS DE UN TEXTO");
        lblTitulo.setOpaque(true);

        lblTexto.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(153, 0, 0));
        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto.setText("blanco-rojo:amarillo.verde_azul");

        txtPatron.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtPatron.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblPatron.setBackground(new java.awt.Color(0, 0, 0));
        lblPatron.setForeground(new java.awt.Color(255, 255, 255));
        lblPatron.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatron.setText("INGRESAR PATRON");
        lblPatron.setOpaque(true);

        jScrollPane1.setToolTipText("");

        lstSalida.setBackground(new java.awt.Color(0, 0, 0));
        lstSalida.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        lstSalida.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(lstSalida);

        cmdSeparar.setText("SEPARAR PALABRAS");
        cmdSeparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSepararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
            .addComponent(lblTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatron)
                            .addComponent(lblPatron, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(cmdSeparar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblPatron)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPatron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cmdSeparar)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSepararActionPerformed
        dlm.clear();
        String texto = lblTexto.getText();
        String patron = txtPatron.getText();
        String[] colores = texto.split(patron);
        for (String color : colores) { //for each (por elemento)
            dlm.addElement(color);
        }
        /*
        for(int i=0; i<colores.length; i++) { //por la posición que ocupa el elemento
            dlm.addElement(colores[i]);
        }
         */

    }//GEN-LAST:event_cmdSepararActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdSeparar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPatron;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstSalida;
    private javax.swing.JTextField txtPatron;
    // End of variables declaration//GEN-END:variables
}
