package swing12;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class VentanaAnadir extends javax.swing.JFrame {

    public VentanaAnadir() {
        initComponents();
        personalizar_JFrame();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("AÑADIR");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtIdObrero = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtHorasTrabajadasSemana = new javax.swing.JTextField();
        cmdAnadir = new javax.swing.JButton();
        lblIdObrero = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblHorasTrabajadasSemana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("AÑADIR NUEVO OBRERO");
        lblTitulo.setOpaque(true);

        txtIdObrero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtHorasTrabajadasSemana.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdAnadir.setText("AÑADIR");
        cmdAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAnadirActionPerformed(evt);
            }
        });

        lblIdObrero.setBackground(new java.awt.Color(0, 0, 0));
        lblIdObrero.setForeground(new java.awt.Color(255, 255, 255));
        lblIdObrero.setText("ID OBRERO");
        lblIdObrero.setOpaque(true);

        lblNombre.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("NOMBRE");
        lblNombre.setOpaque(true);

        lblHorasTrabajadasSemana.setBackground(new java.awt.Color(0, 0, 0));
        lblHorasTrabajadasSemana.setForeground(new java.awt.Color(255, 255, 255));
        lblHorasTrabajadasSemana.setText("HORAS TRABAJADAS SEMANA");
        lblHorasTrabajadasSemana.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(cmdAnadir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(txtIdObrero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblIdObrero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(txtHorasTrabajadasSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHorasTrabajadasSemana)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdObrero)
                    .addComponent(lblNombre)
                    .addComponent(lblHorasTrabajadasSemana))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdObrero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorasTrabajadasSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(cmdAnadir)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAnadirActionPerformed
        String idObrero = txtIdObrero.getText();
        String nombre = txtNombre.getText();
        String horasTrabajadaSemana = txtHorasTrabajadasSemana.getText();

        Obrero o = new Obrero(idObrero, nombre, Integer.parseInt(horasTrabajadaSemana));
        if (!Controlador.existe(idObrero)) {
            Ventana.obreros_al.add(o);
            JOptionPane.showMessageDialog(this, "OBRERO FUE AÑADIDO CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "EL ID YA ESTA EN USO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cmdAnadirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAnadir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAnadir;
    private javax.swing.JLabel lblHorasTrabajadasSemana;
    private javax.swing.JLabel lblIdObrero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtHorasTrabajadasSemana;
    private javax.swing.JTextField txtIdObrero;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
