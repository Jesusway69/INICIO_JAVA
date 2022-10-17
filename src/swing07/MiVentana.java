package swing07;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class MiVentana extends JFrame {

    JTextArea ta = new JTextArea();
    Container c = getContentPane();
    JScrollPane sp = new JScrollPane();
    Border br = BorderFactory.createLineBorder(Color.RED);

    MiVentana() {
        personalizar_JFrame();
        personalizar_JTextArea();
    }

    public void personalizar_JFrame() {
        this.setSize(400, 400);
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("SALIDA");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public void personalizar_JTextArea() {
        ta.setBorder(br);
        ta.setBackground(Color.BLACK);
        ta.setForeground(Color.WHITE);
        ta.setFont(new Font("Lucida Console", Font.PLAIN, 14));

        sp.setViewportView(ta);
        c.add(sp);
    }

    public JTextArea getTextArea() {
        return ta;
    }

}


