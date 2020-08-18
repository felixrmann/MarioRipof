package Mario.Model.Block;

import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-14
 */

public class BlockSand extends Block {
    private Color yellow;
    //TODO charcode stein, sand

    public BlockSand(){
        super("sand", 's');

        yellow = new Color(255, 255, 153);

        colorCode = new Color[][]{
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
                {yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow, yellow},
        };
    }
}
