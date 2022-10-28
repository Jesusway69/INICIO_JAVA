package archivo_serial_uno_a_muchos;

import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VentanaAlumno extends javax.swing.JFrame {

    public static List<Alumno> alumnos_al = new ArrayList<Alumno>();

    public VentanaAlumno() {
        initComponents();
        personalizar_JFrame();
        cargar_cboIdAsignatura();
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

    public void limpiar_JTextField() {
        txtIdAlumno.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtNota.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtIdAlumno = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmdGrabar = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        cboIdAsignatura = new javax.swing.JComboBox<>();
        cmdGrabarArchivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("REGISTRAR ALUMNO");
        lblTitulo.setOpaque(true);

        txtIdAlumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNota.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Id Alumno");

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Id Asignatura");

        jLabel5.setText("Nota");

        cmdGrabar.setText("GRABAR");
        cmdGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGrabarActionPerformed(evt);
            }
        });

        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });

        cmdSalir.setText("SALIR");

        cmdGrabarArchivo.setText("GRABAR ARCHIVO");
        cmdGrabarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGrabarArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboIdAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdAlumno)
                    .addComponent(txtNombre)
                    .addComponent(txtEdad)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cmdGrabar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(cmdNuevo)
                .addGap(68, 68, 68)
                .addComponent(cmdSalir)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdGrabarArchivo)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboIdAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdGrabar)
                    .addComponent(cmdNuevo)
                    .addComponent(cmdSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdGrabarArchivo)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGrabarActionPerformed

        String idAlumno = txtIdAlumno.getText();
        String nombre = txtNombre.getText();
        String edad = txtEdad.getText();
        String idAsignatura = (String) cboIdAsignatura.getSelectedItem();
        String nota = txtNota.getText();

        if (idAlumno.length() > 0 && nombre.length() > 0 && edad.length() > 0 && idAsignatura.length() > 0 && nota.length() > 0) {
            if (Controlador.validoIdAlumno(idAlumno)) {
                if (!Controlador.existe(idAlumno)) {
                    try {
                        Alumno a = new Alumno(idAlumno, nombre, Integer.parseInt(edad), idAsignatura, Integer.parseInt(nota));
                        alumnos_al.add(a);
                        JOptionPane.showMessageDialog(this, "ALUMNO SE AÑADIO CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                        limpiar_JTextField();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "ENTRADA INCORRECTA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "ALUMNO YA EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "ID NO VALIDO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "TIENE CAMPOS VACIOS", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cmdGrabarActionPerformed

    private void cmdGrabarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGrabarArchivoActionPerformed
        String nra = "src/archivo_serial_uno_a_muchos/alumno.ser";
        File f = new File(nra);
        if (!f.exists()) {
            if (Controlador.crear(nra)) {
                JOptionPane.showMessageDialog(this, "OK CREAR ARCHIVO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "ERROR CREAR ARCHIVO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(this, "ARCHIVO YA EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

        Alumno a = null;
        for (int i = 0; i < alumnos_al.size(); i++) {
            a = alumnos_al.get(i);
            if (Controlador.escribirAlumno(nra, a)) {
                System.out.println("OK");
            } else {
                System.out.println("ERROR");
            }
        }
        JOptionPane.showMessageDialog(this, "OK GRABAR ARCHIVO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        nra = "data/alumno.ser";
        List<Alumno> alumnos_al = Controlador.leerAlumno(nra);
        System.out.println("Tamaño: " + alumnos_al.size());

    }//GEN-LAST:event_cmdGrabarArchivoActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        limpiar_JTextField();
    }//GEN-LAST:event_cmdNuevoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboIdAsignatura;
    private javax.swing.JButton cmdGrabar;
    private javax.swing.JButton cmdGrabarArchivo;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
