package mongdb_menu;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import static mongdb_menu.Menu.coleccion;
import org.bson.Document;

public class Ventana2 extends javax.swing.JFrame {

    String[] cabecera = {"IDEMPLEADO", "NOMBRE", "EDAD", "SUELDO", "CIUDAD", "JOBIS"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);

    static MongoClient cliente = new MongoClient("localhost", 27017);
    static MongoDatabase conexion = cliente.getDatabase("tienda");
    static MongoCollection<Document> coleccion = conexion.getCollection("empleado");

    public Ventana2() {
        initComponents();
        personalizar_JFrame();
        personalizar_JTable();
        cargarDatosTable();
    }

    private void cargarDatosTable() {
        limpiarTable();
        MongoCursor<Document> cursor = coleccion.find().iterator();
        String[] blanco = {"", "", "", "", "", ""};
        int i = 0;
        while (cursor.hasNext()) {
            dtm.addRow(blanco);
            Document documento = cursor.next();
            for (Map.Entry<String, Object> entrada : documento.entrySet()) {

                if (entrada.getKey().equalsIgnoreCase("idEmpleado")) {
                    int idEmpleado = (int) entrada.getValue();
                    dtm.setValueAt(idEmpleado, i, 0);
                }
                if (entrada.getKey().equalsIgnoreCase("nombre")) {
                    String nombre = (String) entrada.getValue();
                    dtm.setValueAt(nombre, i, 1);
                }
                if (entrada.getKey().equalsIgnoreCase("edad")) {
                    int edad = (int) entrada.getValue();
                    dtm.setValueAt(edad, i, 2);
                }
                if (entrada.getKey().equalsIgnoreCase("sueldo")) {
                    int sueldo = (int) entrada.getValue();
                    dtm.setValueAt(sueldo, i, 3);
                }
                List lista;
                if (entrada.getKey().equalsIgnoreCase("direccion")) {
                    Document docDireccion = (Document) entrada.getValue();
                    lista = new ArrayList(docDireccion.values());
                    String ciudad = (String) lista.get(2);
                    dtm.setValueAt(ciudad, i, 4);
                }
                if (entrada.getKey().equalsIgnoreCase("jobis")) {
                    List jobis_l = (List) entrada.getValue();
                    dtm.setValueAt(jobis_l, i, 5);
                    i++;
                }

            }
        }
    }

    public void limpiarTable() {
        int nf = dtm.getRowCount();
        for (int i = 0; i < nf; i++) {
            dtm.removeRow(0);
        }
    }

    private void personalizar_JTable() {
        tblMostrar.setModel(dtm);
        DefaultTableCellRenderer centerRenderer_right = new DefaultTableCellRenderer();
        centerRenderer_right.setHorizontalAlignment(JLabel.RIGHT);
        tblMostrar.getColumnModel().getColumn(0).setCellRenderer(centerRenderer_right);
        tblMostrar.getColumnModel().getColumn(2).setCellRenderer(centerRenderer_right);
        tblMostrar.getColumnModel().getColumn(3).setCellRenderer(centerRenderer_right);
    }

    private void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana2.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUI");
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        cmdRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MOSTRAR DATOS EN UN JTABLE");
        lblTitulo.setOpaque(true);

        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMostrar);

        cmdRefrescar.setText("REFRESCAR");
        cmdRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addComponent(cmdRefrescar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(cmdRefrescar)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRefrescarActionPerformed
        cargarDatosTable();
    }//GEN-LAST:event_cmdRefrescarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdRefrescar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblMostrar;
    // End of variables declaration//GEN-END:variables
}
