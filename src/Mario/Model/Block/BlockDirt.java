package Mario.Model.Block;

import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-22
 */

public class BlockDirt extends Block {
    private Color brown;

    public BlockDirt() {
        super("dirt", 'd');

        brown = new Color(158, 111, 39);

        colorCode = new Color[][]{
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
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
                {brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown, brown},
        };
    }
}
