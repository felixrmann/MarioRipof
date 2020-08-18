package Mario.Handler;

import Mario.Model.Block.Block;

import javax.swing.*;
import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-14
 */

public class BlockHandler extends JPanel {
    private Block block;

    public BlockHandler(Block block){
        this.block = block;
    }

    private static final int BLOCK_WIDTH = 96;
    private static final int BLOCK_HEIGHT = 96;
    private static final int PIXEL_SIZE = 6;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Color[][] colorCode = block.getColorCode();

        for (int i = 0; i < BLOCK_HEIGHT; i += PIXEL_SIZE) {
            for (int j = 0; j < BLOCK_WIDTH; j += PIXEL_SIZE) {
                g.setColor(colorCode[i / PIXEL_SIZE][j / PIXEL_SIZE]);
                g.fillRect(j,i,PIXEL_SIZE,PIXEL_SIZE);
            }
        }
    }
}
