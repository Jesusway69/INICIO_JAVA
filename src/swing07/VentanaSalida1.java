package swing07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class VentanaSalida1 extends JFrame {

    Border br = BorderFactory.createLineBorder(Color.RED);
    DefaultListModel dlm = new DefaultListModel();
    JList lista = new JList();
    Container c = getContentPane();
    JScrollPane scrollPane = new JScrollPane();

    // VARIABLES DE INSTANCIA
    String titulo;

    // CONSTRUCTORES
    VentanaSalida1(String titulo) {
        this.titulo = titulo;

        personalizar_JList();

        personalizar_JFrame();
    }

    // METODOS
    public void personalizar_JList() {
        lista.setModel(dlm);
        lista.setBorder(br);
        lista.setSelectionBackground(Color.CYAN);
        lista.setSelectionForeground(Color.RED);
        lista.setBackground(Color.BLACK);
        lista.setForeground(Color.WHITE);

        scrollPane.setViewportView(lista);
        c.add(scrollPane);
    }

    public void personalizar_JFrame() {
        this.setSize(400, 400);
        this.setTitle(this.titulo);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public DefaultListModel getModelo() {
        return this.dlm;
    }

}
