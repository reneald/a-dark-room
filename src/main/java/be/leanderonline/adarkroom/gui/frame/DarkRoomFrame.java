package be.leanderonline.adarkroom.gui.frame;

import be.leanderonline.adarkroom.gui.panels.NotificationsPanel;
import be.leanderonline.adarkroom.gui.panels.TitlePanel;
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
    private TitlePanel titlePanel;
    @Autowired
    private NotificationsPanel notificationsPanel;
    private JPanel mainPanel;

    @PostConstruct
    public void createMainGui() {
        this.setBounds(100, 70, 1100, 500);
        this.setBackground(Color.WHITE);
        this.setResizable(false);
        this.addWindowListener(exitDarkRoomListener());
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new GridLayout(2, 3));
        this.mainPanel.add(new JPanel());
        this.mainPanel.add(titlePanel);
        this.mainPanel.add(new JPanel());
        this.mainPanel.add(notificationsPanel);
        this.mainPanel.add(new JPanel());
        this.mainPanel.add(new JPanel());
        this.add(mainPanel);
        this.setVisible(true);
    }

    private static WindowAdapter exitDarkRoomListener() {
        return new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        };
    }
}
