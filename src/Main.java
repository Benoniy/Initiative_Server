import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args){
        setup();
        MyFrame f = new MyFrame();
        //new Server();
    }

    public static void setup(){
        try{
            URL whatismyip = new URL("http://checkip.amazonaws.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    whatismyip.openStream()));

            Constants.ipv4 = in.readLine();
        }
        catch (Exception e){}


    }
}
