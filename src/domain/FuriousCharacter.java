/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.awt.Image;
import java.util.ArrayList;

public class FuriousCharacter extends Character {

    private boolean attack;

    
    
//    public FuriousCharacter(boolean attack) {
//        this.attack = attack;
//    }
//
    public boolean isAttack() {
        return attack;
    }
//
    public void setAttack(boolean attack) {
        this.attack = attack;
    }

    public FuriousCharacter(boolean attack, int positionX, int positionY, Image playerImage, ArrayList<Image> sprite, Object[][] path, String name, String type, int speed) {
        super(positionX, positionY, playerImage, sprite, path, name, type, speed);
        this.attack = attack;
    }

    public FuriousCharacter(boolean attack) {
        this.attack = attack;
    }

}
