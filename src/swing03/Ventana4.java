package swing03;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

public class Ventana4 extends javax.swing.JFrame {

    ButtonGroup bg = new ButtonGroup();
    EventoRadioButton erb = new EventoRadioButton();

    public Ventana4() {
        initComponents();
        personalizar_JFrame();
        crearGrupoVentana();
        rdo1.addActionListener(erb);
        rdo2.addActionListener(erb);
    }

    public void crearGrupoVentana() {
        bg.add(rdo1);
        bg.add(rdo2);
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana1.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("RADIO BUTTON");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.DARK_GRAY); //Color c: Color.RED, Color.BLUE, 
        //this.getContentPane().setBackground(new Color(255,0,0));
    }

    public class EventoRadioButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == rdo1) {
                //new Ventana4_1().setVisible(true);
                Ventana4_1 v1 = new Ventana4_1();
                v1.setVisible(true);
            }
            if (e.getSource() == rdo2) {
                Ventana4_2 v2 = new Ventana4_2();
                v2.setVisible(true);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdo1 = new javax.swing.JRadioButton();
        rdo2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rdo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo1.setForeground(new java.awt.Color(153, 0, 0));
        rdo1.setText("GUI 1");
        rdo1.setOpaque(false);

        rdo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo2.setForeground(new java.awt.Color(153, 0, 0));
        rdo2.setText("GUI 2");
        rdo2.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(rdo1)
                .addGap(40, 40, 40)
                .addComponent(rdo2)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo1)
                    .addComponent(rdo2))
                .addContainerGap(133, Short.MAX_VALUE))
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
    private javax.swing.JRadioButton rdo1;
    private javax.swing.JRadioButton rdo2;
    // End of variables declaration//GEN-END:variables
}
