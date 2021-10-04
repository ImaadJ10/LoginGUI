import javax.swing.*;

public class failFrame extends JFrame {

    public failFrame() {
        this.add(new failPanel());
        this.setTitle("Failed Login");
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
