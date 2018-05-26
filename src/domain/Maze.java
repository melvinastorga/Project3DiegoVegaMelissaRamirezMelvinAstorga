
package domain;

import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.accessibility.AccessibleContext;
import javax.swing.JPanel;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

public class Maze extends JPanel{

  private int row;
  private int colums;
  private Image imageWall;  
  private Rectangle2D mazeMatrix;
  private int [][] mazeItems;

    public Maze(int row, int colums, Image imageWall, Rectangle2D mazeMatrix) {
        this.row = row;
        this.colums = colums;
        this.imageWall = imageWall;
        this.mazeMatrix = mazeMatrix;
        this.mazeItems = new int[row][colums];
    }
    public Maze() {
        this.row = 0;
        this.colums = 0;
        this.imageWall = null;
        this.mazeMatrix = null;
        this.mazeItems = null;
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

    public Image getImageWall() {
        return imageWall;
    }

    public void setImageWall(Image imageWall) {
        this.imageWall = imageWall;
    }

    public Rectangle2D getMazeMatrix() {
        return mazeMatrix;
    }

    public void setMazeMatrix(Rectangle2D mazeMatrix) {
        this.mazeMatrix = mazeMatrix;
    }

    public int[][] getMazeItems() {
        return mazeItems;
    }

    public void setMazeItems(int[][] mazeItems) {
        this.mazeItems = mazeItems;
    }

    

 

    
    public int [][] fillMaze (){
        
        int [][] mazeFilled= new int [mazeItems.length][mazeItems.length];
        Random r = new Random();
        
        for (int i = 0; i < mazeFilled.length; i++) {
            for (int j = 0; j < mazeFilled[0].length; j++) {
                
                mazeFilled[i][j]= r.nextInt(2);
          
            }
            
        }
       
        return mazeFilled;
    }
    
}
