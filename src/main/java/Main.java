import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){
        JFrame frame = new MyFrame();
        frame.setBounds(100, 100, 800, 600);
        frame.setLayout(null);

        JPanel panel = new MyPanel();
        panel.setBackground(Color.RED);
        panel.setBounds(50, 50, 700, 500);

        frame.add(panel);

        frame.setVisible(true);
    }

}
