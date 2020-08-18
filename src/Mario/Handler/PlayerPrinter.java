package Mario.Handler;

import Mario.Model.Block.BlockPlayer;
import Mario.Model.Player.Player;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-23
 */

public class PlayerPrinter extends JPanel {
    private Player player;
    private BlockPlayer behindblock;

    public PlayerPrinter(Player player){
        this.player = player;
    }

    public PlayerPrinter(Player player, BlockPlayer behindBlock){
        this.player = player;
        this.behindblock = behindBlock;
    }

    private static final int PLAYER_WIDTH = 96;
    private static final int PLAYER_HEIGHT = 96;
    private static final int PIXEL_SIZE = 6;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Color[][] colorCode = player.getColorCode();


        for (int i = 0; i < PLAYER_HEIGHT; i += PIXEL_SIZE) {
            for (int j = 0; j < PLAYER_WIDTH; j += PIXEL_SIZE) {
                g.setColor(colorCode[i / PIXEL_SIZE][j / PIXEL_SIZE]);
                g.fillRect(j,i,PIXEL_SIZE,PIXEL_SIZE);
            }
        }
    }
}
