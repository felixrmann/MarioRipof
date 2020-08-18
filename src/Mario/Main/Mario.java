package Mario.Main;

import Mario.Frame.GameFrame;
import Mario.Model.Map.TestMap;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-14
 */

public class Mario {
    public static void main(String[] args) {
        new GameFrame(new TestMap());
    }
}
