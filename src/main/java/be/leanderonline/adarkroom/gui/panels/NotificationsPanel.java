package be.leanderonline.adarkroom.gui.panels;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class NotificationsPanel extends JPanel {

    public static final long serialVersionUID = 1L;

    public NotificationsPanel() {
        this.setPreferredSize(new Dimension(250, 1100));
        this.setLayout(new GridLayout(1, 1));
        this.add(new JTextArea("notification"));
    }
}
