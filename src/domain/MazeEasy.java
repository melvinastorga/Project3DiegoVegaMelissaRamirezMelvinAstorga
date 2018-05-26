package domain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class MazeEasy extends JPanel {

    Maze mazeLevels= new Maze();
    Rectangle2D[][] mazeStructure; 
 
    public MazeEasy(Maze maze, String level) {
        this.setSize(800, 800);
        this.mazeLevels = maze;
        this.mazeStructure=new Rectangle2D[mazeLevels.getColums()][mazeLevels.getRow()];
        this.setVisible(true);
        this.repaint();
    }

    
    
    public void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;
//      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//      g2.clearRect(0, 0, this.getWidth(), this.getHeight());
      this.draw(g2);
      
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.black);
        int calculateY = mazeLevels.getImageWall().getHeight(null);
        int calculateX = mazeLevels.getImageWall().getHeight(null);
        int startY = 0;
        int startX = 0;
        int[][] num = mazeLevels.fillMaze();
        
        
       

        for (int i = 0; i < mazeLevels.fillMaze().length; i++) {
          
            for (int j = 0; j < mazeLevels.fillMaze()[0].length; j++) {
               
                mazeStructure[i][j] = new Rectangle2D.Double(startX, startY, calculateX, calculateY);
                
                g2.draw(mazeStructure[i][j]);
                g2.setPaint(Color.black);
                g2.fill(mazeStructure[i][j]);
               

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
