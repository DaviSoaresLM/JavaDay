import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        JPanel panel = new JPanel();
        JButton btnPrimeiro = new JButton("Primeiro");
        JButton btnSegundo = new JButton("Segundo");
        JButton btnTerceiro = new JButton("Terceiro");
        JButton btnQuarto = new JButton("Quarto");
        JButton btnQuinto = new JButton("Quinto");
        JButton btnSexto = new JButton("Sexto");

        panel.setLayout(new java.awt.GridLayout(3, 3));
        panel.add(btnPrimeiro);
        panel.add(btnSegundo);
        panel.add(btnTerceiro);
        panel.add(btnQuarto);
        panel.add(btnQuinto);
        panel.add(btnSexto);
        frame.getContentPane().add(panel);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}