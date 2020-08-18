package Mario.Main;

import Mario.Handler.BlockHandler;
import Mario.Handler.PlayerHandler;
import Mario.Handler.PlayerPrinter;
import Mario.Model.Block.*;
import Mario.Model.Map.TestMap;
import Mario.Model.Player.Player;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-21
 */

public class TEst extends JFrame {
    private JPanel mainPanel;
    private TestMap testMap;
    private Player player;
    private PlayerHandler playerHandler;

    public TEst() {
        testMap = new TestMap();
        mainPanel = new JPanel(new GridLayout(10, 10));

        player = new Player("Felix", testMap.getStartX(), testMap.getStartY());
        playerHandler = new PlayerHandler(player);

        repeat();

        getContentPane().add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(960, 960);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    void repeat() {
        render();
        //setPlayerOnBlock();
        //setPlayerSurroundingBlocks();
        //new PlayerPrinter(player);
    }

    public void render(){
        //mainPanel.removeAll();
        for (int i = 0; i < testMap.getMapHeight(); i++) {
            for (int j = 0; j < testMap.getMapWidth(); j++) {
                if (testMap.getTestMap()[i][j] == ' '){
                    mainPanel.add(new BlockHandler(new BlockAir()));
                } else if (testMap.getTestMap()[i][j] == 'g'){
                    mainPanel.add(new BlockHandler(new BlockGrass()));
                } else if (testMap.getTestMap()[i][j] == 'd'){
                    mainPanel.add(new BlockHandler(new BlockDirt()));
                } else if (testMap.getTestMap()[i][j] == 's'){
                    mainPanel.add(new BlockHandler(new BlockSand()));
                } else if (testMap.getTestMap()[i][j] == 't'){
                    mainPanel.add(new BlockHandler(new BlockPlayer()));
                }
            }
        }
        mainPanel.repaint();
    }

    public void setPlayerOnBlock(){
        if (testMap.getTestMap()[player.getYPosPixel()][player.getXPosPixel()] == ' '){
            testMap.setBlock(player.getYPosPixel(), player.getXPosPixel(), new BlockPlayer(player.getYPosPixel(), player.getXPosPixel()));
        }
    }

    public Vector<BlockPlayer> setPlayerSurroundingBlocks(){
        Vector<BlockPlayer> temp = new Vector<>();

        if (testMap.getTestMap()[player.getYPosPixel()][player.getXPosPixel()] == ' '){

            int tempXcnt = player.getXPosPixel() - 1;
            int tempYcnt = player.getYPosPixel() - 1;

            System.out.println("tempX: " + tempXcnt);
            System.out.println("tempY: " + tempYcnt);

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (!(tempYcnt + i == player.getYPosPixel() && tempXcnt + j == player.getXPosPixel())){
                        System.out.println("y: " + (tempYcnt + i));
                        System.out.println("x: " + (tempXcnt + j));
                        switch (testMap.getTestMap()[tempYcnt + i][tempXcnt + j]){
                            case ' ':
                                temp.add(new BlockPlayer(tempYcnt + i, tempXcnt + j));
                                break;
                            case 'g':
                                temp.add(null);
                                System.out.println("nein g");
                                break;
                            case 'd':
                                temp.add(null);
                                System.out.println("nein d");
                                break;
                        }
                    }
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        new TEst();
    }
}
