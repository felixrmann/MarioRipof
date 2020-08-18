package Mario.Model.Block;

import Mario.Model.Player.Player;

import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-22
 */

public class BlockPlayer extends Block {
    private Color blue;
    private int yPos, xPos;

    public BlockPlayer(){
        super("playerBlock", 't');

        //blue = new Color(51, 255, 255);
        blue = new Color(51, 255, 0);

        setDefault();
    }

    public BlockPlayer(int yPos, int xPos) {
        super("playerBlock", 't');
        this.yPos = yPos;
        this.xPos = xPos;

        blue = new Color(51, 255, 255);

        setDefault();
    }

    public void setDefault(){
        colorCode = new Color[][]{
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
                {blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue, blue},
        };
    }

    public int getyPos() {
        return yPos;
    }

    public int getxPos() {
        return xPos;
    }
}
