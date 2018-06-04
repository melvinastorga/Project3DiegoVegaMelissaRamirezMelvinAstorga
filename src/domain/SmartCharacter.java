
package domain;

import java.awt.Image;
import java.util.ArrayList;

public class SmartCharacter extends Character {
    
    boolean getItem;

    public SmartCharacter(boolean getItem, int positionX, int positionY, Image playerImage, ArrayList<Image> sprite, Object[][] path, String name, String type, int speed) {
        super(positionX, positionY, playerImage, sprite, path, name, type, speed);
        this.getItem = getItem;
    }

    public SmartCharacter(boolean getItem) {
        this.getItem = getItem;
    }
    
    

}
