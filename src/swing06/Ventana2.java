package swing06;

import java.awt.Color;

public class Ventana2 extends javax.swing.JFrame {

    public Ventana2() {
        initComponents();
        personalizar_JPasswordField();
    }
    
    public void personalizar_JPasswordField() {
        clave.setBackground(Color.BLACK);
        clave.setForeground(Color.WHITE);
        //clave.setEchoChar((char)1); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clave = new javax.swing.JPasswordField();
        cambio = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cambio.setText("ON/OFF");
        cambio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cambioItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cambio)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(cambio)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cambioItemStateChanged
         int state = evt.getStateChange();
        System.out.println("Estado: " + state);
        // if selected print selected in console
        if (state == evt.SELECTED) {  
            clave.setEchoChar((char)0); 
            cambio.setText("ON");
        } else {
             // else print deselected in console
            clave.setEchoChar((char)1); 
            cambio.setText("OFF");
        }
    }//GEN-LAST:event_cambioItemStateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cambio;
    private javax.swing.JPasswordField clave;
    // End of variables declaration//GEN-END:variables
}
