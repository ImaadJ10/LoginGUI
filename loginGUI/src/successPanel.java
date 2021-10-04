import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class successPanel extends JPanel {

    public JLabel successLabel;

    public successPanel() {

        this.setFocusable(true);
        this.setPreferredSize(new Dimension(340, 250));

        successLabel = new JLabel("Successfully logged in!");
        successLabel.setFont(successLabel.getFont().deriveFont(16.0f));
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(77)
                                .addComponent(successLabel)
                                .addContainerGap(104, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(113)
                                .addComponent(successLabel)
                                .addContainerGap(117, Short.MAX_VALUE))
        );
        setLayout(groupLayout);


    }

}

