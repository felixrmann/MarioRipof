package Mario.Model.Block;

import javax.swing.*;
import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-Juni-14
 */

public abstract class Block extends JPanel {
    protected String name;
    protected Color[][] colorCode;
    protected char charCode;

    Block(String name, char charCode){
        this.name = name;
        this.charCode = charCode;
    }

    public Color[][] getColorCode() {
        return colorCode;
    }

    public String getName(){
        return name;
    }

    public char getCharCode(){
        return charCode;
    }
}
