package domain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MazeLevels extends JPanel implements MouseListener {
    
    Maze mazeBuilder = new Maze();
    Rectangle2D[][] mazeStructure;
    int[][] num;
    int mazeLevel;
    
    

    public MazeLevels(Maze maze, int level, int width, int hight) {
        addMouseListener(this);
        
        mazeLevel = level;
        this.setSize(width, hight);
        this.mazeBuilder = maze;
        this.mazeStructure = new Rectangle2D[mazeBuilder.getColums()][mazeBuilder.getRow()];
        num = mazeBuilder.fillMaze();
        this.setVisible(true);
        this.repaint();
    }

    //pinta los componentes
    public void paintComponent(Graphics g) {
       
        Graphics2D g2 = (Graphics2D) g;
        try {
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.clearRect(0, 0, this.getWidth(), this.getHeight());
            this.draw(g2);
        } catch (IOException ex) {
            Logger.getLogger(MazeLevels.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //crea los componentes
    public void draw(Graphics2D g2) throws IOException {
        
        g2.setColor(Color.black);
        int calculateY = mazeBuilder.getImageWall().getHeight(null) + mazeLevel;
        int calculateX = mazeBuilder.getImageWall().getHeight(null) + mazeLevel;
        int startY = 0;
        int startX = 0;

      

        for (int i = 0; i < mazeBuilder.fillMaze().length; i++) {

            for (int j = 0; j < mazeBuilder.fillMaze()[0].length; j++) {

                mazeStructure[i][j] = new Rectangle2D.Double(startX, startY, calculateX, calculateY);

                g2.draw(mazeStructure[i][j]);
                g2.setPaint(Color.black);
                g2.fill(mazeStructure[i][j]);
              

                if (num[i][j] == 1) {

                    g2.drawImage(mazeBuilder.getImageWall(), startX, startY, calculateX, calculateY, this);

                }

                if (num[i][j] == 3) {

                    g2.drawImage(mazeBuilder.getDoor(), startX, startY, calculateX, calculateY, this);
                }

                if (num[i][j] == 4) {

                    g2.drawImage(mazeBuilder.getExit(), startX, startY, calculateX, calculateY, this);
                }

                startX = startX + calculateX;
            }

            startY = startY + calculateY;
            startX = 0;
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int cordenatesX = e.getX();
        int cordenatesY = e.getY();
        System.out.println(e.getX());
        for (int i = 0; i < mazeStructure.length; i++) {
            for (int j = 0; j < mazeStructure.length; j++) {
                System.out.println(num);
                if (mazeStructure[i][j].contains(cordenatesX, cordenatesY)) {

                    if (num[i][j] == 1) {

                        num[i][j] = 0;
                    } else if (num[i][j] == 0) {
                        num[i][j] = 1;
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
