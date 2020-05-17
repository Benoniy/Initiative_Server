import javax.swing.*;

public class MyFrame extends JFrame {
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

    }
}
