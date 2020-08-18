package Mario.Model.Map;

import Mario.Model.Block.Block;

import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-14
 */

public class Map {
    protected char[][] mapData;
    protected int mapW, startX, startY;

    public Map(int mapW, int startX, int startY){
        this.mapW = mapW;
        this.startX = startX;
        this.startY = startY;
    }

    public char[][] getMapData(){
        return mapData;
    }

    public int getMapH(){
        return 10;
    }

    public int getMapW(){
        return mapW;
    }

    public int getStartX(){
        return startX;
    }

    public int getStartY(){
        return startY;
    }

    public void setBlock(int yPos, int xPos, Block block){
        mapData[yPos][xPos] = block.getCharCode();
    }
}
