import javax.swing.*;
import java.awt.GridLayout;

public class JTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField Example");
        JPanel panel = new JPanel();
        JLabel fnameLabel = new JLabel("Primeiro nome: ");
        JLabel lnameLabel = new JLabel("Ultimo nome: ");
        JLabel ageLabel = new JLabel("Idade: ");
        JTextField fnameTf = new JTextField(20);
        JTextField lnameTf = new JTextField(20);
        JTextField ageTf = new JTextField(20);

        panel.setLayout(new GridLayout(10, 1));
        panel.add(fnameLabel);
        panel.add(fnameTf);
        panel.add(lnameLabel);
        panel.add(lnameTf);
        panel.add(ageLabel);
        panel.add(ageTf);

        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}