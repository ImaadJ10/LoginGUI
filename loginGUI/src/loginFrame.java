import javax.swing.*;

public class loginFrame extends JFrame {

    public loginFrame() {
        this.add(new loginPanel());
        this.setTitle("User Login");
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
