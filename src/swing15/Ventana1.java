package swing15;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import swing11.Ventana;

public class Ventana1 extends javax.swing.JFrame {

    String[] cabecera = {"ID OBRERO", "NOMBRE", "HORAS"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);
    String nra = "src/swing15/obrero.csv";
    List<Obrero> obreros_al = Controlador.leer(nra);

    public Ventana1() {
        initComponents();
        personalizar_JFrame();
        personalizar_JTable();
        cargarDatoTable();
    }

    public void cargarDatoTable() {
        int nf = obreros_al.size();
        String[] datos = {"", "", ""};
        for (int i = 0; i < nf; i++) {
            Obrero obrero = obreros_al.get(i);
            dtm.addRow(datos);
            dtm.setValueAt(obrero.getIdObrero(), i, 0);
            dtm.setValueAt(obrero.getNombre(), i, 1);
            dtm.setValueAt(obrero.getCantidadHorasSemana(), i, 2);
        }
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUI");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void personalizar_JTable() {
        tblContenido.setModel(dtm);

        tblContenido.setShowGrid(true);
        //tblContenido.setShowVerticalLines(true);
        //tblContenido.setShowHorizontalLines(false);
        

        tblContenido.getTableHeader().setBackground(Color.BLACK); // Cambia el color de fondo de la cabecera
        tblContenido.getTableHeader().setForeground(Color.WHITE); // Cambia el color de letra de la cabecera
        tblContenido.getTableHeader().setFont(new java.awt.Font("Lucida Console", 0, 14)); // Cambia la fuente, estilo y tamaño de letra de la cabecera
        tblContenido.getTableHeader().setBorder(new LineBorder(new Color(255, 162, 232))); // Cambia de color el border de la cabecera

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContenido = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MOSTRAR DATOS EN JTABLE");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblContenido;
    // End of variables declaration//GEN-END:variables
}
