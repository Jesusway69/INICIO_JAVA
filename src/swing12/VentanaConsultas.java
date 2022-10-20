package swing12;

import java.awt.Toolkit;
import java.util.List;

public class VentanaConsultas extends javax.swing.JFrame {

    public VentanaConsultas() {
        initComponents();
        personalizar_JFrame();
        cargarComboBox();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("CONSULTAS");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void cargarComboBox() {
        cboConsultas.addItem("SELECCIONE UNA CONSULTA");
        cboConsultas.addItem("MOSTRAR EL OBRERO CON EL MAYOR SUELDO");
        cboConsultas.addItem("MOSTRAR EL PRESUPUESTO EN SUELDOS");
        cboConsultas.addItem("MOSTRAR EL OBRERO CON LA MENOR HORAS DE TRABAJO SEMANAL");
        cboConsultas.addItem("MOSTRAR EL OBRERO CON LA MAYOR CANTIDAD DE HORAS EXTRAS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        cboConsultas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaConsultas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CONSULTAS");
        lblTitulo.setOpaque(true);

        cboConsultas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboConsultasItemStateChanged(evt);
            }
        });

        txaConsultas.setColumns(20);
        txaConsultas.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txaConsultas.setRows(5);
        jScrollPane1.setViewportView(txaConsultas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboConsultas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboConsultasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboConsultasItemStateChanged
        //String consulta = (String)cboConsultas.getSelectedItem();
        txaConsultas.setText("");
        List<Obrero> obreros_al = null;
        int consulta = cboConsultas.getSelectedIndex();
        switch (consulta) {
            case 0:
                break;
            case 1:
                obreros_al = Controlador.getObreroMayorSueldo2();
                txaConsultas.append(Obrero.cabecera());
                for (Obrero o : obreros_al) {
                    txaConsultas.append(o.cuerpo());
                }

                break;
            case 2:
                double presupuesto = Controlador.sumarSueldos();
                txaConsultas.append(String.format("%18s\n", "PRESUPUESTO SUELDO"));
                txaConsultas.append(String.format("%18s\n", "------------------"));
                txaConsultas.append(String.format("%18.2f", presupuesto));
                break;
            case 3:
                obreros_al = Controlador.getObreroMenorHorasTrabajadasSemana();
                txaConsultas.append(Obrero.cabecera());
                for (Obrero o : obreros_al) {
                    txaConsultas.append(o.cuerpo());
                }

                break;
            case 4:
                obreros_al = Controlador.getObreroMayorHorasExtras();
                txaConsultas.append(Obrero.cabecera());
                for (Obrero o : obreros_al) {
                    txaConsultas.append(o.cuerpo());
                }
                break;
        }


    }//GEN-LAST:event_cboConsultasItemStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboConsultas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaConsultas;
    // End of variables declaration//GEN-END:variables
}
