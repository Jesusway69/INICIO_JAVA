package archivo_serial_uno_a_muchos;

import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VentanaAsignatura extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();

    public VentanaAsignatura() {
        initComponents();
        personalizar_JFrame();
        lstIdAlumno.setModel(dlm);
        cargar_cboIdAsignatura();
        cargar_lstAlumno();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(swing03.Ventana1.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUI");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void cargar_cboIdAsignatura() {
        String nra = "src/archivo_serial_uno_a_muchos/idasignaturas.csv";
        List<String> idasignaturas_al = Controlador.leerIdAsignatura(nra);
        for (String s : idasignaturas_al) {
            String[] parte = s.split(";");
            cboIdAsignatura.addItem(parte[0]);
        }
    }

    public void cargar_lstAlumno() {
        dlm.clear();
        String nra = "src/archivo_serial_uno_a_muchos/alumno.ser";
        String idAsignatura = (String) cboIdAsignatura.getSelectedItem();
        List<Alumno> alumnos_al = Controlador.leerAlumno(nra);
        String s = "";
        if (alumnos_al.size() > 0) {
            for (Alumno alumno : alumnos_al) {
                if (alumno.getIdAsignatura().equalsIgnoreCase(idAsignatura)) {
                    s = alumno.getIdAlumno() + " - "
                            + alumno.getNombre() + " - "
                            + alumno.getEdad() + " - "
                            + alumno.getIdAsignatura() + " - "
                            + alumno.getNota();
                    dlm.addElement(s);
                }
            }
        } else {
            System.out.println("LISTA VACIA");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        cboIdAsignatura = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstIdAlumno = new javax.swing.JList<>();
        cmdGrabar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("REGISTRAR ASIGNATURA CON SUS ALUMNOS");
        lblTitulo.setOpaque(true);

        cboIdAsignatura.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboIdAsignaturaItemStateChanged(evt);
            }
        });

        jLabel1.setText("Id Asignatura");

        jScrollPane1.setViewportView(lstIdAlumno);

        cmdGrabar.setText("GRABAR");
        cmdGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGrabarActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de Alumnos");

        lblDescripcion.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(204, 51, 0));
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcion.setText("Descripción");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cboIdAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdGrabar)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboIdAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(lblDescripcion))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(cmdGrabar)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboIdAsignaturaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboIdAsignaturaItemStateChanged
        dlm.clear();
        String idAsignatura = (String) cboIdAsignatura.getSelectedItem();
        String descripcion = Controlador.getDescripcionAsignatura(idAsignatura);
        //txtDescripcionAsignatura.setText(descripcion);
        lblDescripcion.setText(descripcion);
        cargar_lstAlumno();
    }//GEN-LAST:event_cboIdAsignaturaItemStateChanged

    private void cmdGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGrabarActionPerformed
        String idAsignatura = (String) cboIdAsignatura.getSelectedItem();
        String descripcion = lblDescripcion.getText();
        List<Alumno> alumnos_al = new ArrayList<Alumno>();
        for (int i = 0; i < dlm.getSize(); i++) {
            String a = (String) dlm.getElementAt(i);
            String[] campo = a.split(" - ");
            Alumno alumno = new Alumno(campo[0],
                    campo[1],
                    Integer.parseInt(campo[2]),
                    campo[3],
                    Integer.parseInt(campo[4]));

            alumnos_al.add(alumno);
            System.out.println(alumno);
        }
        Asignatura asignatura = new Asignatura(idAsignatura, descripcion, alumnos_al);
        System.out.println(asignatura);
        String nra = "src/archivo_serial_uno_a_muchos/asignatura.ser";
        File f = new File(nra);
        if (!f.exists()) {
            if (Controlador.crear(nra)) {
                JOptionPane.showMessageDialog(this, "OK CREAR ARCHIVO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "ERROR CREAR ARCHIVO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "ARCHIVO YA EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
        if(Controlador.escribirAsignatura(nra, asignatura)) {
           JOptionPane.showMessageDialog(this, "OK GRABACION", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }else {
           JOptionPane.showMessageDialog(this, "ERROR GRABACION", "INFORMACION", JOptionPane.INFORMATION_MESSAGE); 
        }

    }//GEN-LAST:event_cmdGrabarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAsignatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboIdAsignatura;
    private javax.swing.JButton cmdGrabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstIdAlumno;
    // End of variables declaration//GEN-END:variables
}
