import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(100,100, 100, 100);
    }

}
