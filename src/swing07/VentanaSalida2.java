package swing07;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class VentanaSalida2 extends JFrame {

    Border br = BorderFactory.createLineBorder(Color.RED);
    JTextArea txaContenido = new JTextArea();
    Container c = getContentPane();
    JScrollPane scrollPane = new JScrollPane();

    // VARIABLES DE INSTANCIA
    String titulo;

    // CONSTRUCTORES
    VentanaSalida2(String titulo) {
        this.titulo = titulo;

        personalizar_JTextArea();

        personalizar_JFrame();
    }

    // METODOS
    public void personalizar_JTextArea() {
        txaContenido.setBorder(br);
        txaContenido.setBackground(Color.BLACK);
        txaContenido.setFont(new Font("Lucida Console", Font.PLAIN, 14));
        txaContenido.setForeground(Color.WHITE);
        txaContenido.setLineWrap(true);
        txaContenido.setWrapStyleWord(true);
        txaContenido.setColumns(20);
        txaContenido.setRows(5);

        scrollPane.setViewportView(txaContenido);
        c.add(scrollPane);
    }

    public void personalizar_JFrame() {
        this.setSize(400, 400);
        this.setTitle(this.titulo);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public JTextArea getTextArea() {
        return this.txaContenido;
    }

}
