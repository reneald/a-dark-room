package be.leanderonline.adarkroom.gui.frame;

import be.leanderonline.adarkroom.gui.panels.NotificationsPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@Component
public class DarkRoomFrame extends JFrame {

    public static final long serialVersionUID = 1L;
    @Autowired
    private NotificationsPanel notificationsPanel;
    private JPanel mainPanel;

    @PostConstruct
    public void createMainGui() {
        this.setBounds(100, 70, 1100, 500);
        this.setResizable(false);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(notificationsPanel, BorderLayout.WEST);
        this.add(mainPanel);
        this.setVisible(true);
    }
}
