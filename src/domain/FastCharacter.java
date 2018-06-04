/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author Melissa Ramírez R

 */



 public class FastCharacter extends Character {

   private int percentage;

   
   
//    public FastCharacter(int percentage) {
//        this.percentage = percentage;
//    }
//
//    public int getPercentage() {
//        return percentage;
//    }
//
//    public void setPercentage(int percentage) {
//        this.percentage = percentage;

    //}

    public FastCharacter(int percentage, int positionX, int positionY, Image playerImage, ArrayList<Image> sprite, Object[][] path, String name, String type, int speed) {
        super(positionX, positionY, playerImage, sprite, path, name, type, speed);
        this.percentage = percentage;
    }

    public FastCharacter(int percentage) {
        this.percentage = percentage;
        
        
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
    
    
}
    
