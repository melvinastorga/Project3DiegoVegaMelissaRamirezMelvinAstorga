
package domain;

import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.JPanel;


public class Maze{

  private int row;
  private int colums;
  private BufferedImage imageWall;  
  private int [][] mazeItems;
  private boolean hardMode;

    public Maze(int row, int colums, BufferedImage imageWall,boolean hardMode) {
        this.row = row;
        this.colums = colums;
        this.imageWall = imageWall;
        this.mazeItems = new int[row][colums];
        this.hardMode= hardMode;
    }
    public Maze() {
        this.row = 0;
        this.colums = 0;
        this.imageWall = null;
        this.mazeItems = null;
        this.hardMode = false;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColums() {
        return colums;
    }

    public void setColums(int colums) {
        this.colums = colums;
    }

    public BufferedImage getImageWall() {
        return imageWall;
    }

    public void setImageWall(BufferedImage imageWall) {
        this.imageWall = imageWall;
    }

    public int[][] getMazeItems() {
        return mazeItems;
    }

    public void setMazeItems(int[][] mazeItems) {
        this.mazeItems = mazeItems;
    }

    public boolean isHardMode() {
        return hardMode;
    }

    public void setHardMode(boolean hardMode) {
        this.hardMode = hardMode;
    }

     
 

    
    public int [][] fillMaze (){
        
        int [][] mazeFilled= new int [mazeItems.length][mazeItems.length];
        Random r = new Random();
        
        for (int i = 0; i < mazeFilled.length; i++) {
            for (int j = 0; j < mazeFilled[0].length; j++) {
                
                mazeFilled[i][j]= r.nextInt(2);
          
            }
            
        }
       
        
        
        if(hardMode==true){
        mazeFilled[0][0]=3;
        mazeFilled[0][mazeItems.length-1]=3;
        
        mazeFilled[mazeItems.length-1][mazeItems.length-5]=4;
        mazeFilled[mazeItems.length-1][mazeItems.length-8]=4;
        
        }else{
        mazeFilled[0][0]=3;
        mazeFilled[mazeItems.length-1][mazeItems.length-1]=4;
            
        }
        
        return mazeFilled;
    }
    
}
