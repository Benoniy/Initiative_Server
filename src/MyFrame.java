import UI_ELEMENTS.MyLabel;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private JPanel content_panel;
    static Color backgroundColor = new Color(240,240,240);

    MyFrame(){
        setTitle("Initiative server");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);

        content_panel = new JPanel();
        content_panel.setBackground(backgroundColor);
        content_panel.setLayout(new GridBagLayout());
        add(content_panel);
        generate_content();
    }

    private void generate_content(){
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        content_panel.add(new MyLabel("A"), gbc);
    }
}
