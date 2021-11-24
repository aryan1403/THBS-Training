package TodoApp;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;

public class App {
    int frameX = 800;
    int frameY = 600;
    
    int counter = 0;
    JFrame frame = new JFrame();

    App() {
        JTextField tf = new JTextField();
        tf.setBounds(100, 100, 450, 50);
        tf.setFont(new Font("Aerial", Font.PLAIN, 18));
        tf.setLayout(null);

        JButton button = new JButton("Add Todo");
        button.setBounds(600, 100, 150, 50);
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        button.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        button.setFocusable(false);
        button.addActionListener(e -> addMeow(tf.getText(), frame));
        button.setLayout(null);

        frame.setDefaultCloseOperation(3);
        frame.setSize(frameX, frameY);
        frame.setLocationRelativeTo(null);
        frame.add(tf);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void addMeow(String todo, JFrame frame) {
        int y = counter * 70 + 200;
        int x = 100;


        frame.add(new addTodo(x, y, todo, frame));
        frame.repaint();
        
        counter++;
    }
}
