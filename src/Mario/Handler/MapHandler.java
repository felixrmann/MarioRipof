package Mario.Handler;

import Mario.Model.Block.*;
import Mario.Model.Map.Map;

import javax.swing.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-14
 */

public class MapHandler {
    private Map map;
    private JPanel mapPanel;

    public MapHandler(Map map, JPanel mapPanel){
        this.map = map;
        this.mapPanel = mapPanel;
    }
    
    public void render(){
        for (int i = 0; i < map.getMapH(); i++) {
            for (int j = 0; j < map.getMapW(); j++) {
                if (map.getMapData()[i][j] == ' '){
                    mapPanel.add(new BlockHandler(new BlockAir()));
                } else if (map.getMapData()[i][j] == 'g'){
                    mapPanel.add(new BlockHandler(new BlockGrass()));
                } else if (map.getMapData()[i][j] == 'd'){
                    mapPanel.add(new BlockHandler(new BlockDirt()));
                } else if (map.getMapData()[i][j] == 's'){
                    mapPanel.add(new BlockHandler(new BlockSand()));
                } else if (map.getMapData()[i][j] == 't'){
                    mapPanel.add(new BlockHandler(new BlockPlayer()));
                }
            }
        }
    }
}
