package swing12_1;

import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VentanaSeleccionarObrero extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();

    public VentanaSeleccionarObrero() {
        initComponents();
        personalizar_JFrame();
        lstObreros.setModel(dlm);
        cargar_lstObreros();
    }

    public void cargar_lstObreros() {
        for (Obrero o : Ventana.obreros_al) {
            String s = String.format("%2s%3s%3s%-8s\n", "  ", o.getIdObrero(), " - ", o.getNombre());
            dlm.addElement(s);
        }

    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("SELECCIONAR");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstObreros = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaContenido = new javax.swing.JTextArea();
        cmdMostrar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstObreros.setBackground(new java.awt.Color(0, 0, 0));
        lstObreros.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        lstObreros.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(lstObreros);

        txaContenido.setColumns(20);
        txaContenido.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txaContenido.setRows(5);
        jScrollPane2.setViewportView(txaContenido);

        cmdMostrar.setText("MOSTRAR");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("SELECCIONAR UNO O VARIOS OBREROS");
        lblTitulo.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(cmdMostrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cmdMostrar)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        txaContenido.setText("");
        int[] x = lstObreros.getSelectedIndices();
        if (x.length > 0) {
            txaContenido.append(Obrero.cabecera());
            for (int i = 0; i < x.length; i++) {
                Obrero o = Ventana.obreros_al.get(x[i]);
                txaContenido.append(o.cuerpo());
            }
        }else {
            JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR AL MENOS UN OBRERO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cmdMostrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSeleccionarObrero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstObreros;
    private javax.swing.JTextArea txaContenido;
    // End of variables declaration//GEN-END:variables
}
