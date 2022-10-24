package swing14;

import com.toedter.calendar.JTextFieldDateEditor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Date;

import javax.swing.JTextField;

public class Ventana2 extends javax.swing.JFrame {

    public Ventana2() {
        initComponents();
        personalizar_JDateChooser();
    }

    public static LocalDate getObjetoLocalDate(String fecha) {//fecha="2010-10-15"
        String[] parte = fecha.split("-");
        LocalDate ld = LocalDate.of(Integer.parseInt(parte[0]), Integer.parseInt(parte[1]), Integer.parseInt(parte[2]));
        return ld;
    }

    public long getNumeroDiasEntreDosFechas(String fechaInicio, String fechaFin) { //Entrada = yyyy-MM-dd
        LocalDate ldInicio = getObjetoLocalDate(fechaInicio);
        LocalDate ldFin = getObjetoLocalDate(fechaFin);
        long dias = DAYS.between(ldInicio, ldFin);
        return dias;
    }

    public void personalizar_JDateChooser() {
        JTextFieldDateEditor dateEditor1 = (JTextFieldDateEditor) jdcFecha1.getComponent(1);
        dateEditor1.setHorizontalAlignment(JTextField.CENTER);
        jdcFecha1.setDateFormatString("dd/MM/yyyy");
        jdcFecha1.setDate(new Date());

        JTextFieldDateEditor dateEditor2 = (JTextFieldDateEditor) jdcFecha2.getComponent(1);
        dateEditor2.setHorizontalAlignment(JTextField.CENTER);
        jdcFecha2.setDateFormatString("dd/MM/yyyy");
        jdcFecha2.setDate(new Date());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdcFecha1 = new com.toedter.calendar.JDateChooser();
        jdcFecha2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FECHA IDA");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FECHA VUELTA");
        jLabel2.setOpaque(true);

        jButton1.setText("DIAS TRANSCURRIDOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(204, 0, 0));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdcFecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jButton1)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(139, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String formato1 = jdcFecha1.getDateFormatString(); // Recupera formato cajita fecha
        Date date1 = jdcFecha1.getDate(); // Recupera fecha cajita
        DateFormat f1 = new SimpleDateFormat(formato1);
        String fechax = f1.format(date1);
        String[] parte1 = fechax.split("/");
        String fecha1 = parte1[2] + "-" + parte1[1] + "-" + parte1[0]; //yyyy-MM-dd
        
        String formato2 = jdcFecha2.getDateFormatString(); // Recupera formato cajita fecha
        Date date2 = jdcFecha2.getDate(); // Recupera fecha cajita
        DateFormat f2 = new SimpleDateFormat(formato2);
        String fechay = f2.format(date2);
        String[] parte2 = fechay.split("/");
        String fecha2 = parte2[2] + "-" + parte2[1] + "-" + parte2[0]; //yyyy-MM-dd  
        
        long dias = this.getNumeroDiasEntreDosFechas(fecha1,fecha2);
        
        lblFecha.setText(String.valueOf(dias));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.toedter.calendar.JDateChooser jdcFecha1;
    private com.toedter.calendar.JDateChooser jdcFecha2;
    private javax.swing.JLabel lblFecha;
    // End of variables declaration//GEN-END:variables
}
