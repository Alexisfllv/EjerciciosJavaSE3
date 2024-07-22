package SE46Hilos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FormularioBusqueda extends JFrame implements ActionListener {
    JTextArea textarea1;
    JScrollPane scrollpane1;
    JButton boton1;

    FormularioBusqueda() {
        setLayout(null);
        textarea1 = new JTextArea();
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 30, 760, 300);
        add(scrollpane1);

        boton1 = new JButton("Salir");
        boton1.addActionListener(this);
        boton1.setBounds(320, 350, 100, 30);
        add(boton1);

        textarea1.setText("");
        HiloBusqueda hb = new HiloBusqueda("c:\\", textarea1);
        hb.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1)
            System.exit(0);

    }

    public static void main(String[] arguments) {
        FormularioBusqueda fb;
        fb = new FormularioBusqueda();
        fb.setBounds(0, 0, 800, 640);
        fb.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fb.setVisible(true);
    }
}

class HiloBusqueda extends Thread {
    String directorio;
    JTextArea ta;

    public HiloBusqueda(String directorio, JTextArea ta) {
        this.directorio = directorio;
        this.ta = ta;
    }

    @Override
    public void run() {
        leer(directorio);
    }

    private void leer(String inicio) {

        File ar = new File(inicio);
        String[] dir = ar.list();
        if (dir != null)
            for (int f = 0; f < dir.length; f++) {
                File ar2 = new File(inicio + dir[f]);
                if (ar2.isFile())
                    ta.append(inicio + dir[f] + "\n");
                if (ar2.isDirectory()) {
                    ta.append(inicio + dir[f].toUpperCase() + " --> [Directorio]\n");
                    leer(inicio + dir[f] + "\\");
                }

            }
    }
}
