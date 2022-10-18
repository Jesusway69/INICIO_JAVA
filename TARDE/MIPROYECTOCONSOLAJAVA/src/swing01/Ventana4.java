package swing01;

import java.awt.Color;
import java.awt.Toolkit;

public class Ventana4 extends javax.swing.JFrame {

    public Ventana4() {
        initComponents();
        personalizar_JFrame();
        personalizar_JTextArea();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana2.class.getResource("mac.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        //this.setSize(500, 500);
        this.setTitle("GUI");
    }

    public void personalizar_JTextArea() {
        txaContenido.setLineWrap(true);
        txaContenido.setWrapStyleWord(true);
        txaContenido.append(cabecera());
    }
    
    public String cabecera() {
        String s1 = String.format("%8s  %-6s  %4s  %8s\n", "IDALUMNO", "NOMBRE", "EDAD", "ESTATURA");
        String s2 = String.format("%8s  %-6s  %4s  %8s\n", "--------", "------", "----", "--------");
        return s1+s2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaContenido = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("TEXTAREA");
        lblTitulo.setOpaque(true);

        txaContenido.setBackground(new java.awt.Color(0, 0, 0));
        txaContenido.setColumns(20);
        txaContenido.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        txaContenido.setForeground(new java.awt.Color(255, 255, 255));
        txaContenido.setRows(5);
        jScrollPane1.setViewportView(txaContenido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaContenido;
    // End of variables declaration//GEN-END:variables
}
