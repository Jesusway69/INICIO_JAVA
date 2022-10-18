package swing09;

import java.awt.Toolkit;
import java.io.IOException;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        personalizar_JFrame();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(swing03.Ventana1.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUI");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    public void generarNumerosPrimos() {
        int j = 0;
        int[] vector = new int[168];
        for(int i=2; i<=1000; i++) {
            if(esPrimo(i)) {
                //System.out.println(j++ + " - " + i);
                vector[j++] = i;
            }
        }
        
        j = 0;
        int[][] matriz = new int[12][14]; //nfxnc
        for(int f=0; f<12; f++) {
            for(int c=0; c<14; c++) {
               matriz[f][c] = vector[j++]; 
               System.out.printf("%6d  ",matriz[f][c]);
               String x = String.format("%8d",matriz[f][c]);

               //pause();
               txaContenido.append(x);
            }
            System.out.println();
            txaContenido.append("\n");
        }
        
        
        
    }
    
    public boolean esPrimo(int n) {
        int i = 2;
        boolean primo = true;
        while ((primo == true) && (i != n)) {
            if (n % i == 0) {
                primo = false;
            }
            i++;
        }
        return primo;
    }
    
        public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaContenido = new javax.swing.JTextArea();
        cmdMostrar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("NUMEROS PRIMOS ENTRE 1 Y 1000");
        lblTitulo.setOpaque(true);

        txaContenido.setColumns(20);
        txaContenido.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txaContenido.setRows(5);
        jScrollPane1.setViewportView(txaContenido);

        cmdMostrar.setText("MOSTRAR");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });

        cmdLimpiar.setText("LIMPIAR");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(cmdMostrar)
                .addGap(156, 156, 156)
                .addComponent(cmdLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdMostrar)
                    .addComponent(cmdLimpiar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        generarNumerosPrimos();
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txaContenido.setText("");
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaContenido;
    // End of variables declaration//GEN-END:variables
}
