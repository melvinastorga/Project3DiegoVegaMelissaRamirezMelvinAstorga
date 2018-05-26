package domain;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class MazeEasy extends JPanel {

    Maze mazeLevels;

    public MazeEasy(Maze maze) {

        mazeLevels = maze;

    }

    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

    }

    public void draw(Graphics2D g2) {

        int calculateY = mazeLevels.getImageWall().getHeight(null);
        int calculateX = mazeLevels.getImageWall().getHeight(null);
        int startY = 0;
        int startX = 0;

        Rectangle2D[][] mazeStructure = new Rectangle[mazeLevels.getColums()][mazeLevels.getRow()];

        for (int i = 0; i < mazeLevels.fillMaze().length; i++) {
            for (int j = 0; j < mazeLevels.fillMaze().length; j++) {

                mazeStructure[i][j] = new Rectangle2D.Double(startX, startY, calculateX, calculateY);
                g2.draw(mazeStructure[i][j]);

                int[][] num = mazeLevels.fillMaze();

                if (num[i][j] == 1) {

                    g2.drawImage(mazeLevels.getImageWall(), startX, startY, calculateX, calculateY, this);

                }

                startX = startX + calculateX;
            }

            startY = startY + calculateY;
            startX = 0;
        }

    }

}
