package swing03;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

public class Ventana1 extends javax.swing.JFrame {

    ButtonGroup bg = new ButtonGroup();
    EventoRadioButton erb = new EventoRadioButton();
    
    public Ventana1() {
        initComponents();
        personalizar_JFrame();
        crearGrupoEstilo();
        rdo0.addActionListener(erb);
        rdo1.addActionListener(erb);
        rdo2.addActionListener(erb);
        rdo3.addActionListener(erb);
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana1.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("RADIO BUTTON");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setSize(700,600);
    }

    public void crearGrupoEstilo() {
        bg.add(rdo0);
        bg.add(rdo1);
        bg.add(rdo2);
        bg.add(rdo3);
    }

    public void cambiarEstilo(int estilo) {
        lblCambiarEstilo.setFont(new java.awt.Font("Courier New", estilo, 14));
    }

    public class EventoRadioButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == rdo0) {
                cambiarEstilo(0);
            }
            if (e.getSource() == rdo1) {
                cambiarEstilo(1);
            }
            if (e.getSource() == rdo2) {
                cambiarEstilo(2);
            }
            if (e.getSource() == rdo3) {
                cambiarEstilo(3);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCambiarEstilo = new javax.swing.JLabel();
        rdo0 = new javax.swing.JRadioButton();
        rdo1 = new javax.swing.JRadioButton();
        rdo2 = new javax.swing.JRadioButton();
        rdo3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RADIO BUTTON");

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CAMBIAR ESTILO DE LA FUENTE - RADIO BUTTON");
        lblTitulo.setOpaque(true);

        lblCambiarEstilo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblCambiarEstilo.setForeground(new java.awt.Color(153, 0, 0));
        lblCambiarEstilo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCambiarEstilo.setText("EN UN PUERTO ITALIANO AL PIE DE LA MONTAÑA");

        rdo0.setText("PLAIN");

        rdo1.setText("BOLD");

        rdo2.setText("ITALIC");

        rdo3.setText("BOLD - ITALIC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(lblCambiarEstilo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdo3)
                    .addComponent(rdo2)
                    .addComponent(rdo1)
                    .addComponent(rdo0))
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblCambiarEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdo0)
                .addGap(18, 18, 18)
                .addComponent(rdo1)
                .addGap(18, 18, 18)
                .addComponent(rdo2)
                .addGap(18, 18, 18)
                .addComponent(rdo3)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCambiarEstilo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdo0;
    private javax.swing.JRadioButton rdo1;
    private javax.swing.JRadioButton rdo2;
    private javax.swing.JRadioButton rdo3;
    // End of variables declaration//GEN-END:variables
}
