import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class javax {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setBounds(100, 0, 100, 100);
        panel.setBackground(Color.ORANGE);
        panel.setLayout(null);

        JLabel label = new JLabel("Aaryan");
        label.setBounds(0,0, 100, 100);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setForeground(Color.RED);
        label.setLayout(null);

        JButton button = new JButton("Ok");
        button.setBounds(100, 150, 100, 50);
        button.setFont(new Font("MV Boli", Font.PLAIN, 20));
        button.setBackground(Color.green);
        button.setFocusable(false);
        button.setLayout(null);
        button.addActionListener(e -> button.setBackground(Color.red));

        JFrame frame = new JFrame("My Frame");
        frame.setDefaultCloseOperation(3); // close
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.add(panel);
        frame.add(label);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}
