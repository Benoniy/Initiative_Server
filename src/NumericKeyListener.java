import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.regex.*;

public class NumericKeyListener implements KeyListener {


    public NumericKeyListener(){

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent){
        String a = MyFrame.port_text.getText().replaceAll("[^\\d.]", "");
        MyFrame.port_text.setText(a);

        try {
            int i = Integer.parseInt(MyFrame.port_text.getText());
            if (i > 65535) {
                MyFrame.port_text.setText("65535");
            }
        }
        catch (Exception ignored){}

    }
}
