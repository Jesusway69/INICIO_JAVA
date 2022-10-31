package swing15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Ventana1 extends javax.swing.JFrame {

    ShapedButton sb = new ShapedButton();

    String[] cabecera = {"ID OBRERO", "NOMBRE", "HORAS"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);
    String nra = "src/swing15/obrero.csv";
    List<Obrero> obreros_al = null;

    public Ventana1() {
        initComponents();
        personalizar_JFrame();
        personalizar_JTable();
        cargarDatosTable();
    }

    private void cargarDatosTable() {
        limpiarTable();
        obreros_al = Controlador.leer(nra);
        int numeroFilas = obreros_al.size();
        String[] datos = {"", "", ""};
        for (int i = 0; i < numeroFilas; i++) {
            Obrero obrero = obreros_al.get(i);
            dtm.addRow(datos);
            dtm.setValueAt(obrero.getIdObrero(), i, 0);
            dtm.setValueAt(obrero.getNombre(), i, 1);
            dtm.setValueAt(obrero.getCantidadHorasSemana(), i, 2);
        }
    }

    private void limpiarTable() {
        int numeroFilas = dtm.getRowCount();
        for (int j = 0; j < numeroFilas; j++) {
            dtm.removeRow(0);
        }
        repaint();
    }

    private void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana1.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUI");
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void personalizar_JTable() {
        tblContenido.setModel(dtm);

        tblContenido.setShowGrid(true);
        tblContenido.setBackground(Color.BLACK);
        tblContenido.setForeground(Color.WHITE);
        tblContenido.setFont(new java.awt.Font("Lucida Console", 0, 12));
        tblContenido.setGridColor(Color.BLUE);
        tblContenido.setRowHeight(20);
        tblContenido.setEnabled(false);
        tblContenido.setBorder(new LineBorder(new Color(255, 0, 0)));

        tblContenido.getTableHeader().setBackground(Color.WHITE); // Cambia el color de fondo de la cabecera
        tblContenido.getTableHeader().setForeground(Color.BLACK); // Cambia el color de letra de la cabecera
        tblContenido.getTableHeader().setFont(new java.awt.Font("Verdana", 1, 14)); // Cambia la fuente, estilo y tamaño de letra de la cabecera
        tblContenido.getTableHeader().setBorder(new LineBorder(new Color(255, 0, 0))); // Cambia de color el border de la cabecera

        DefaultTableCellRenderer centerRenderer_center = new DefaultTableCellRenderer();
        centerRenderer_center.setHorizontalAlignment(JLabel.CENTER);
        tblContenido.getColumnModel().getColumn(0).setCellRenderer(centerRenderer_center);
        tblContenido.getColumnModel().getColumn(2).setCellRenderer(centerRenderer_center);

        DefaultTableCellRenderer centerRenderer_left = new DefaultTableCellRenderer();
        centerRenderer_left.setHorizontalAlignment(JLabel.LEFT);
        tblContenido.getColumnModel().getColumn(1).setCellRenderer(centerRenderer_left);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContenido = new javax.swing.JTable();
        cmdRefrescar = (JButton)sb.createComponents1();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(440, 440));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MOSTRAR DATOS EN UN JTABLE");
        lblTitulo.setOpaque(true);

        tblContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblContenido);

        cmdRefrescar.setBackground(new java.awt.Color(51, 51, 255));
        cmdRefrescar.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        cmdRefrescar.setForeground(new java.awt.Color(255, 255, 255));
        cmdRefrescar.setText("REFRESCAR");
        cmdRefrescar.setOpaque(false);
        cmdRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdRefrescar)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(cmdRefrescar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRefrescarActionPerformed
        cargarDatosTable();
    }//GEN-LAST:event_cmdRefrescarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdRefrescar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblContenido;
    // End of variables declaration//GEN-END:variables
}
