import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.LayoutStyle.ComponentPlacement;

public class failPanel extends JPanel implements ActionListener {

    public JLabel failLabel;
    public JButton tryAgainButton;

    public failPanel() {
        this.setFocusable(true);
        this.setPreferredSize(new Dimension(340, 250));

        tryAgainButton = new JButton("Try Again");
        tryAgainButton.addActionListener(this);

        failLabel = new JLabel("Login Failed. Try Again.");
        failLabel.setFont(failLabel.getFont().deriveFont(16.0f));
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(79)
                                .addComponent(failLabel)
                                .addContainerGap(91, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(101)
                                .addComponent(tryAgainButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(115))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(113)
                                .addComponent(failLabel)
                                .addGap(18)
                                .addComponent(tryAgainButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(49, Short.MAX_VALUE))
        );
        setLayout(groupLayout);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new loginFrame();
    }
}