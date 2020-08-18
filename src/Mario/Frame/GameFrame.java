package Mario.Frame;

import Mario.Handler.MapHandler;
import Mario.Model.Block.Block;
import Mario.Model.Map.Map;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.Vector;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-14
 */

public class GameFrame extends JFrame {
    private JPanel mainPanel, mapPanel;
    private Map map;
    private MapHandler mapHandler;

    public GameFrame(Map map){
        this.map = map;

        mainPanel = new JPanel();
        mapPanel = new JPanel();
        mapHandler = new MapHandler(this.map, mapPanel);

        init();


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(350,350);
        //setResizable(false);
        setTitle("Mario von Felix");
        setVisible(true);
    }

    private void init() {
        getContentPane().add(mainPanel);

        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.add(mapPanel);

        mapPanel.setLayout(new GridLayout(10, 10));


    }

    private void updatePanel(){
        //mapHandler.
    }
}
