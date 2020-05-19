import UI_ELEMENTS.MyLabel;
import UI_ELEMENTS.MyTextField;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private JPanel content_panel;
    static Color backgroundColor = new Color(240,240,240);
    public static MyTextField port_text = new MyTextField("");

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

        content_panel.add(new MyLabel("Server IP:"), gbc);

        gbc.gridx = 1;
        content_panel.add(Box.createHorizontalStrut(40), gbc);

        gbc.gridx = 2;
        content_panel.add(new MyLabel("Port:"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        content_panel.add(new MyLabel(Constants.ipv4), gbc);

        gbc.gridx = 2;
        content_panel.add(port_text, gbc);
        port_text.addKeyListener(new NumericKeyListener());

        this.validate();
    }
}
