package domain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MazeEasy extends JPanel implements MouseListener{

    Maze mazeLevels= new Maze();
    Rectangle2D[][] mazeStructure; 
    int[][] num;
    
    public MazeEasy(Maze maze, String level) {
        addMouseListener(this);
        this.setSize(800, 800);
        this.mazeLevels = maze;
        this.mazeStructure=new Rectangle2D[mazeLevels.getColums()][mazeLevels.getRow()];
        num= mazeLevels.fillMaze();
        this.setVisible(true);
        this.repaint();
    }

    
    
    public void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;
        try {
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.clearRect(0, 0, this.getWidth(), this.getHeight());
this.draw(g2);
        } catch (IOException ex) {
            Logger.getLogger(MazeEasy.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

    public void draw(Graphics2D g2) throws IOException {
        g2.setColor(Color.black);
        int calculateY = mazeLevels.getImageWall().getHeight(null)+10;
        int calculateX = mazeLevels.getImageWall().getHeight(null)+10;
        int startY = 0;
        int startX = 0;
        
        Image doors = ImageIO.read(new File("door.png"));

        for (int i = 0; i < mazeLevels.fillMaze().length; i++) {
          
            for (int j = 0; j < mazeLevels.fillMaze()[0].length; j++) {
               
                mazeStructure[i][j] = new Rectangle2D.Double(startX, startY, calculateX, calculateY);
                
                g2.draw(mazeStructure[i][j]);
                g2.setPaint(Color.black);
                g2.fill(mazeStructure[i][j]);
               

                if (num[i][j] == 1) {

                   g2.drawImage(mazeLevels.getImageWall(), startX, startY, calculateX, calculateY, this);
                    
                }
                
                if(num[i][j] == 3){
                   
                   g2.drawImage(doors, startX, startY, calculateX, calculateY, this);
                }

                startX = startX + calculateX;
            }

            startY = startY + calculateY;
            startX = 0;
        }
        
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int cordenatesX= e.getX();
        int cordenatesY= e.getY();
        System.out.println(e.getX());
       for (int i = 0; i < mazeStructure.length; i++) {
            for (int j = 0; j < mazeStructure.length; j++) {
                if (mazeStructure[i][j].contains(cordenatesX, cordenatesY)) {

                  if(num[i][j]==1){
                      
                      num[i][j]=0;
                  }
                  
                  else if(num[i][j]==0){
                      num[i][j]=1;
                  }
                    
                }
            }
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
    
    
}
