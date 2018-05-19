
package domain;

import java.awt.Image;
import java.util.ArrayList;

public class Character extends Thread{

 int positionX;
 int positionY;        
 Image playerImage;
 ArrayList<Image> sprite;
 Object [][] path;
 String playerName;
 String type;
 int speed;  

    public Character(int positionX, int positionY, Image playerImage, ArrayList<Image> sprite, Object[][] path, String name, String type, int speed) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.playerImage = playerImage;
        this.sprite = sprite;
        this.path = path;
        this.playerName = name;
        this.type = type;
        this.speed = speed;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public Image getPlayerImage() {
        return playerImage;
    }

    public void setPlayerImage(Image playerImage) {
        this.playerImage = playerImage;
    }

    public ArrayList<Image> getSprite() {
        return sprite;
    }

    public void setSprite(ArrayList<Image> sprite) {
        this.sprite = sprite;
    }

    public Object[][] getPath() {
        return path;
    }

    public void setPath(Object[][] path) {
        this.path = path;
    }

    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        this.playerName = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
}