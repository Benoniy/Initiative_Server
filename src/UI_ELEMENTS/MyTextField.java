package UI_ELEMENTS;

import javax.swing.*;
import java.awt.*;

public class MyTextField extends JTextField{
    Font font = new Font("SansSerif", Font.BOLD, 12);

    public MyTextField(String text){
        super(text);
        this.setFont(font);
        this.setHorizontalAlignment(JTextField.CENTER);
        this.setPreferredSize(new Dimension(70,20));
    }
}
