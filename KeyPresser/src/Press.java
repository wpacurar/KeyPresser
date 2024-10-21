import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.TimerTask;

public class Press extends TimerTask {
    @Override
    public void run() {
        Robot r = null;
        try {
            r = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        //first key press
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        //wait for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //second key press
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
    }
}