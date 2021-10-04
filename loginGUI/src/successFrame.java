import javax.swing.*;

public class successFrame extends JFrame {

    public successFrame() {
        this.add(new successPanel());
        this.setTitle("Successful Login");
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
