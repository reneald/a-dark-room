package be.leanderonline.adarkroom.gui.panels;

import be.leanderonline.adarkroom.util.Helper;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class TitlePanel extends JPanel {
    public static final long serialVersionUID = 1L;

    public TitlePanel() {
        this.setPreferredSize(new Dimension(500, 100));
        this.setLayout(new GridLayout(1, 1));
        JTextArea title = new JTextArea(Helper.TITLE);
        title.setFont(new Font("Monospaced", Font.PLAIN, 11));
        this.add(title);
    }
}
