import java.awt.*;
import java.awt.event.InputEvent;
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

    //PRESS & RELEASE E 3 TIMES
        //first key press
        r.keyPress(KeyEvent.VK_E);
        try {
            Thread.sleep(212);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        r.keyRelease(KeyEvent.VK_E);
        //wait for 2 seconds
        try {
            Thread.sleep(3010);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //second key press
        r.keyPress(KeyEvent.VK_E);
        try {
            Thread.sleep(212);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        r.keyRelease(KeyEvent.VK_E);
        //wait for 2 seconds
        try {
            Thread.sleep(3010);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //third key press
        r.keyPress(KeyEvent.VK_E);
        try {
            Thread.sleep(212);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        r.keyRelease(KeyEvent.VK_E);

    //WAIT
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    //MOVE FORWARD
        //press W
        r.keyPress(KeyEvent.VK_W);
        //wait for 1 seconds
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //release D
        r.keyRelease(KeyEvent.VK_W);

    //WAIT
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    //PRESS & RELEASE E 3 TIMES
        //first key press
        r.keyPress(KeyEvent.VK_E);
        try {
            Thread.sleep(212);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        r.keyRelease(KeyEvent.VK_E);
        //wait for 2 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //second key press
        r.keyPress(KeyEvent.VK_E);
        try {
            Thread.sleep(212);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        r.keyRelease(KeyEvent.VK_E);
        //wait for 2 seconds
        try {
            Thread.sleep(3010);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //third key press
        r.keyPress(KeyEvent.VK_E);
        try {
            Thread.sleep(212);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        r.keyRelease(KeyEvent.VK_E);

    //WAIT
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    //RESET
        //escape
        r.keyPress(KeyEvent.VK_ESCAPE);
        try {
            Thread.sleep(212);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        r.keyRelease(KeyEvent.VK_ESCAPE);
        try {
            Thread.sleep(512);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //click
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        try {
            Thread.sleep(212);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        try {
            Thread.sleep(512);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //exit menu
        r.keyPress(KeyEvent.VK_E);
        try {
            Thread.sleep(212);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        r.keyRelease(KeyEvent.VK_E);
    }
}