package be.leanderonline.adarkroom.gui.panels;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class NotificationsPanel extends JPanel {

    public static final long serialVersionUID = 1L;

    public NotificationsPanel() {
        this.setPreferredSize(new Dimension(250, 1100));
        this.setBackground(Color.WHITE);
        this.setLayout(new GridLayout(1, 2));
    }
}
