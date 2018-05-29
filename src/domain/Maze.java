package domain;

import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.JPanel;

public class Maze {

    private int row;
    private int colums;
    private BufferedImage imageWall;
    private int[][] mazeItems;
    private String MazeLevel;

    public Maze(int row, int colums, BufferedImage imageWall, String hardMode) {
        this.row = row;
        this.colums = colums;
        this.imageWall = imageWall;
        this.mazeItems = new int[row][colums];
        this.MazeLevel = hardMode;
    }

    public Maze() {
        this.row = 0;
        this.colums = 0;
        this.imageWall = null;
        this.mazeItems = null;
        this.MazeLevel = "";
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

    public String getMazeLevel() {
        return MazeLevel;
    }

    public void setMazeLevel(String MazeLevel) {
        this.MazeLevel = MazeLevel;
    }

    public int[][] fillMaze() {

        if (MazeLevel.equalsIgnoreCase("easy")) {
            int[][] mazeFilled = {
            {3, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 1, 1, 1, 1, 1, 1, 1, 0},
            {1, 0, 1, 1, 1, 1, 1, 1, 1, 0},
            {1, 0, 1, 0, 0, 0, 0, 1, 1, 0},
            {1, 0, 0, 0, 1, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 4}
            };

            return mazeFilled;
        }
        if (MazeLevel.equalsIgnoreCase("normal")) {
            int[][] mazeFilled = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

            return mazeFilled;
        }

        if (MazeLevel.equalsIgnoreCase("hard")) {

            int[][] mazeFilled = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

            mazeFilled[0][0] = 3;
            mazeFilled[0][mazeItems.length - 1] = 3;
            mazeFilled[mazeItems.length - 1][mazeItems.length - 5] = 4;
            mazeFilled[mazeItems.length - 1][mazeItems.length - 8] = 4;
            return mazeFilled;
        }
        return null;
    }

}
