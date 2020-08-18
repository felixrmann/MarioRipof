package Mario.Model.Player;

import Mario.Model.Block.BlockPlayer;

import java.awt.*;
import java.util.Vector;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-22
 */

public class Player {
    private String name;
    private int xPosBlock, yPosBlock, xPosPixel, yPosPixel;
    private Vector<BlockPlayer> surroundingBlocks;
    private Color[][] colorCode;
    private Color black, red;

    public Player(String name, int startX, int startY){
        this.name = name;
        surroundingBlocks = new Vector<>();

        xPosBlock = startX;
        yPosBlock = startY;

        xPosPixel = 0;
        yPosPixel = 0;

        black = new Color(0,0,0);
        red = new Color(255, 0, 0);

        colorCode = new Color[][]{
                {black, red},
                {red, black}
        };
    }

    public void setSurroundingBlocks(Vector<BlockPlayer> surroundingBlocks){
        this.surroundingBlocks.clear();
        this.surroundingBlocks = surroundingBlocks;
    }

    public Vector<BlockPlayer> getSurroungdingBlocks(){
        return surroundingBlocks;
    }

    public Color[][] getColorCode(){
        return colorCode;
    }

    public String getName(){
        return name;
    }

    public int getXPosBlock(){
        return xPosBlock;
    }

    public int getYPosBlock(){
        return yPosBlock;
    }

    public int getXPosPixel() {
        return xPosPixel;
    }

    public void setXPosPixel(int xPosPixel) {
        this.xPosPixel = xPosPixel;
    }

    public int getYPosPixel() {
        return yPosPixel;
    }

    public void setYPosPixel(int yPosPixel) {
        this.yPosPixel = yPosPixel;
    }
}
