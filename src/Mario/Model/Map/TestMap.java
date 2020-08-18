package Mario.Model.Map;

import Mario.Model.Block.Block;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-21
 */

public class TestMap extends Map{
    public TestMap() {
        super(10, 2, 7);
    }

    char[][] mapData = new char[][]{
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ','g','g',' ',' '},
            {' ',' ',' ',' ',' ',' ','d','d',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {'g','g','g','g','g','g','g','g','g','g'},
            {'d','d','d','d','d','d','d','d','d','d'}
    };

    public void setBlock(int yPos, int xPos, Block block){
        mapData[yPos][xPos] = block.getCharCode();
    }

    public char[][] getTestMap(){
        return mapData;
    }

    public int getMapHeight(){
        return 10;
    }

    public int getMapWidth(){
        return 10;
    }

    public int getStartX(){
        return 2;
    }

    public int getStartY(){
        return 7;
    }
}
