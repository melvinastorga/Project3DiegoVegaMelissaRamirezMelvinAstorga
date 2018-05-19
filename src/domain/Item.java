
package domain;

import java.awt.Image;

public class Item {
    
    private int positionX;
    private int positionY;
    private int speed;
    private Image imageItem;
    private Object [][] path;

    public Item(int positionX, int positionY, int speed, Image imageItem, Object[][] path) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
        this.imageItem = imageItem;
        this.path = path;
    }

    public Item() {
        this.positionX = 0;
        this.positionY = 0;
        this.speed = 0;
        this.imageItem = null;
        this.path=null;
        
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Image getImageItem() {
        return imageItem;
    }

    public void setImageItem(Image imageItem) {
        this.imageItem = imageItem;
    }

    public Object[][] getPath() {
        return path;
    }

    public void setPath(Object[][] path) {
        this.path = path;
    }
    
}