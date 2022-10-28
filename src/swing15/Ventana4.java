package swing15;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Ventana4 extends javax.swing.JFrame {

    String[] cabecera = {"ID OBRERO", "NOMBRE", "HORAS", "H. EXTRAS", "SUELDO"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);
    String nra = "src/swing15/obrero.csv";
    List<Obrero> obreros_al = Controlador.leer(nra);

    public Ventana4() {
        initComponents();
        personalizar_JFrame();
        personalizar_JTable();
        cargarDatoTable();
    }

    public void cargarDatoTable() {
        int nf = obreros_al.size();
        String[] datos = {"", "", "", "", ""};
        for (int i = 0; i < nf; i++) {
            Obrero obrero = obreros_al.get(i);
            dtm.addRow(datos);
            dtm.setValueAt(obrero.getIdObrero(), i, 0);
            dtm.setValueAt(obrero.getNombre(), i, 1);
            dtm.setValueAt(obrero.getCantidadHorasSemana(), i, 2);
            dtm.setValueAt(obrero.getHorasExtras(), i, 3);
            dtm.setValueAt(obrero.getSueldo(), i, 4);

        }
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana4.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUI");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void limpiar() {
        int nf = dtm.getRowCount();
        for (int i = 0; i < nf; i++) {
            dtm.removeRow(0);
        }
    }

    public void personalizar_JTable() {
        tblContenido.setModel(dtm);

        tblContenido.setShowGrid(true);
        //tblContenido.setShowVerticalLines(true);
        //tblContenido.setShowHorizontalLines(false);
        tblContenido.setGridColor(Color.BLUE);
        tblContenido.setRowHeight(30);

        tblContenido.setEnabled(false);

        tblContenido.getTableHeader().setBackground(Color.BLACK); // Cambia el color de fondo de la cabecera
        tblContenido.getTableHeader().setForeground(Color.WHITE); // Cambia el color de letra de la cabecera
        tblContenido.getTableHeader().setFont(new java.awt.Font("Lucida Console", 0, 14)); // Cambia la fuente, estilo y tamaño de letra de la cabecera
        tblContenido.getTableHeader().setBorder(new LineBorder(new Color(255, 162, 232))); // Cambia de color el border de la cabecera

        tblContenido.setRowSelectionAllowed(true); // Permite la selección de fila
        tblContenido.setColumnSelectionAllowed(false); // Permite la seleccion de columna
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContenido = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        cmdBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("BUSCAR DATOS EN JTABLE");
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

        txtNombre.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblNombre.setText("BUSCAR POR NOMBRE");

        cmdBuscar.setText("BUSCAR");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(lblNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(cmdBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cmdBuscar)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        String nombreBuscar = txtNombre.getText();
        int nf = dtm.getRowCount();
        List<Obrero> obreros_al = Controlador.leer(nra);

        limpiar();
        String[] datos = {"", "", "", "", ""};
        int k = 0;
        
        for (int i = 0; i < obreros_al.size(); i++) {
            Obrero obrero = obreros_al.get(i);
            if (obrero.getNombre().equalsIgnoreCase(nombreBuscar)) {
                dtm.addRow(datos);
                
                dtm.setValueAt(obrero.getIdObrero(), k, 0);
                dtm.setValueAt(obrero.getNombre(), k, 1);
                dtm.setValueAt(obrero.getCantidadHorasSemana(), k, 2);
                dtm.setValueAt(obrero.getHorasExtras(), k, 3);
                dtm.setValueAt(obrero.getSueldo(), k, 4);
                k = k + 1;
            }
        }
        if(k == 0)
           JOptionPane.showMessageDialog(this, "NO EXISTE OBRERO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_cmdBuscarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblContenido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
