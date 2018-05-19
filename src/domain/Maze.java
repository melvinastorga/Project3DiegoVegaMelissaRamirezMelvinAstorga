
package domain;

import java.awt.Image;
import java.awt.geom.Rectangle2D;

public class Maze {

  private int row;
  private int colums;
  private Image imageWall;  
  private Rectangle2D mazeMatrix;

    public Maze(int row, int colums, Image imageWall, Rectangle2D mazeMatrix) {
        this.row = row;
        this.colums = colums;
        this.imageWall = imageWall;
        this.mazeMatrix = mazeMatrix;
    }
    public Maze() {
        this.row = 0;
        this.colums =0;
        this.imageWall =null;
        this.mazeMatrix = null;
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
  
    
}
