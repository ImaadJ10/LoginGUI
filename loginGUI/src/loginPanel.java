import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class loginPanel extends JPanel implements ActionListener {

    public userInfo[] myUsers = {new userInfo("imaadj10", "Sh4rkK1ll"),
            new userInfo("lance210", "bingobongo2"),
            new userInfo("liza.junaidi", "d32355761")};
    public JLabel usernameText;
    public JLabel passwordText;
    public JTextField usernameInput;
    public JPasswordField passwordInput;
    public JButton loginButton;

    public loginPanel() {
        usernameText = new JLabel("Username:");
        passwordText = new JLabel("Password:");

        usernameInput = new JTextField();
        passwordInput = new JPasswordField();

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        this.setFocusable(true);
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.setPreferredSize(new Dimension(340, 250));
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(usernameText, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameInput, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordText, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordInput, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addComponent(usernameText, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(usernameInput, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(passwordText, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(passwordInput, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(97))
        );
        setLayout(groupLayout);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String givenUsername = usernameInput.getText();
        char[] givenPassword = passwordInput.getPassword();

        for (int i = 0; i < myUsers.length; i++) {
            if (givenUsername.equals(myUsers[i].username)) {
                checkPassword(givenPassword, i);
                break;
            }
            else if (i == myUsers.length - 1 && givenUsername != myUsers[i].username.intern()) {
                fail();
            }
        }

    }

    private void checkPassword(char[] password, int index) {
        char[] myUserPassword = myUsers[index].password.toCharArray();

        if (Arrays.equals(myUserPassword, password)) {
            success();
        }
        else {
            fail();
        }
    }

    private void success() {
        new successFrame();
    }

    private void fail() {
        new failFrame();
    }

}

