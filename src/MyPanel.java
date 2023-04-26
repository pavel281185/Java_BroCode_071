import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5));

//        g2D.drawLine(0,0,500,500);

//        g2D.drawRect(0,0,100,200);

//        g2D.fillRect(0,0,100,200);

//        g2D.drawOval(100,100,100,100);

//        g2D.fillOval(100,100,100,100);

//        g2D.drawArc(0,0,100,100,0,180);

        g2D.setFont(new Font("Ink Free", Font.BOLD, 32));
        g2D.drawString("BLA BLA", 50, 50);
    }
}
