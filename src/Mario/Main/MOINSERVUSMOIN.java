package Mario.Main;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-22
 */

public class MOINSERVUSMOIN {
    public static void main(String[] args) {
        TEst tEst = new TEst();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                tEst.repeat();
            }
        }, 1000, 1000);
    }
}