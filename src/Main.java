import javax.swing.*;

public class Main extends JFrame {
    MyPanel panel;

    Main() {
        panel = new MyPanel();
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}