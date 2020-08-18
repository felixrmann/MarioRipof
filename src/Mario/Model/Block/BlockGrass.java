package Mario.Model.Block;

import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-18
 */

public class BlockGrass extends Block {
    private Color green, brown;

    public BlockGrass() {
        super("grass", 'g');

        green = new Color(102, 220, 59);
        brown = new Color(158, 111, 39);

        colorCode = new Color[][]{
                {green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green},
                {green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green},
                {green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green},
                {green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
        };
    }
}