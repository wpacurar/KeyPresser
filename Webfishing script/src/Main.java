import java.awt.*;
import java.util.Timer;

public class Main {
    public static void main(String[] args) throws AWTException {
        Timer timer = new Timer();
        //start after 5 seconds, 15 seconds between actions
        timer.schedule(new Press(), 5000, 25000);
    }
}