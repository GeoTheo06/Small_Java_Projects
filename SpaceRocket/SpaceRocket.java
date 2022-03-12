/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceRocket;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author user
 */
public class SpaceRocket extends JPanel implements KeyListener, ActionListener, MouseListener{
    
    //βαλε εχθρους (διαστημοπλοια) να πυροβολουν το space ship ή προς τυχεες κατευθυνσεις και να πεφτουν πανω στο ιδιο το space ship
    // βαλε μια random π.χ. απο το 1 εως το 5 και καθε αριθμος θα σημαινει και διαφορετικη τακτικη που θα ακολουθουν τα διαστημοπλοια (θα εμφανιζονται με διαφορετικο σχηματισμο)
    //βαλε bosses οταν σκοτωσει 10 διαστημοπλοια π.χ.
    //βαλε ειδικες δυναμεις π.χ. να πυροβολαει πιο γρηγορα αμα σκοτωσει ενα boss
    
    //variables
    int panelWidth = 1919, panelHeight = 1079;
    
    boolean play = false, game = false, pause = false;
    
    boolean UP, DOWN, RIGHT, LEFT;
    
    int score;
    
    // η θεση του παικτη 1
    int playerposX = 464, playerposY = 464;
    int playerdirX1 = 0, playerdirX2 = 0, playerdirY1 = 0, playerdirY2 = 0;
    
    //θεση του background
    int backgroundX1 = 0, backgroundX2 = backgroundX1 + 1768, backgroundX3 = backgroundX1 + 3536;
    
    //χρονος στον οποιο ανανεωνονται τα γραφικα
    Timer timer;
    int delay = 8;
    
    Random rand1 = new Random();
    
    //tactic 1
    int enemies = 0;
    //θεση των εχθρων
    int enemyPosX1 = 1900, enemyPosY1 = 0;
    
    
    
    public void setpanel (int panelHeight, int panelWidth) {
        this.panelHeight = panelHeight;
        this.panelWidth = panelWidth;
    }
    public int getPanelHeight () {
        return panelHeight;
    }
    public int getPanelWidth () {
        return panelWidth;
    }
    
    public SpaceRocket() {
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true);
        timer = new Timer(delay, this);
        timer.start();
    }
    
    public void paint(Graphics g){
        super.paint(g);
        //background
        ImageIcon image2 = new ImageIcon(getClass().getClassLoader().getResource("space.jpg"));
        image2.paintIcon(this, g, backgroundX1, 0);
        image2.paintIcon(this, g, backgroundX2, 0);
        image2.paintIcon(this, g, backgroundX3, 0);
        
        if (backgroundX2 <= 0) {
            backgroundX1 = 0;
            backgroundX2 = backgroundX1 + 1768;
            backgroundX3 = backgroundX1 + 3536;
        }
        
        //player
        ImageIcon image1 = new ImageIcon(getClass().getClassLoader().getResource("spaceShip.png"));
        image1.paintIcon(this, g, playerposX, playerposY);
        
        Rectangle player = new Rectangle(playerposX, playerposY, 155, 45);
        
        //player Movement
        if (UP == true) {
            if (playerposY <= 0) {
                playerposY = 0;
            } else  {
                moveUp();
            }
        }
        if (DOWN == true) {
            if (playerposY >= 1020) {
                playerposY = 1020;
            } else {
                moveDown();
            }
        }
        if (LEFT == true) {
            if (playerposX <= 0) {
                playerposX = 0;
            } else {
                moveLeft();
            }
        }
        if (RIGHT == true) {
            if (playerposX >= 1850) {
                playerposX = 1850;
            } else {
                moveRight();
            }
        }
        
        //ENEMIES
        ImageIcon image3 = new ImageIcon(getClass().getClassLoader().getResource("enemy.png"));
        
        //tactic 1
        
        for (int i = 0; i < 11; i++) {
            image3.paintIcon(this, g, enemyPosX1, enemyPosY1);
            enemyPosY1 = enemyPosY1 + 100;
        }
        
        //exit
        g.setFont(new Font("Times New Roman", Font.BOLD, 90));
        g.setColor(Color.red);
        g.drawString("EXIT", 1700, 1070);
        
        repaint();
    }
    
    public void keyTyped(KeyEvent e) {}

    
    public void keyPressed(KeyEvent e) {
        //Player Movement
        if (e.getKeyCode() == KeyEvent.VK_UP) UP = true;
        if(e.getKeyCode() == KeyEvent.VK_DOWN) DOWN = true;
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) RIGHT = true;
        if(e.getKeyCode() == KeyEvent.VK_LEFT) LEFT = true;
        
        if (e.getKeyCode() == KeyEvent.VK_0) {
            System.out.println(enemyPosX1);
        }
    }
    
    public void moveUp() {
        play = true;
        playerposY -= 1;
    }
    public void moveDown() {
        play = true;
        playerposY += 1;
    }
    
    public void moveRight() {
        play = true;
        playerposX += 1;
    }
    public void moveLeft() {
        play = true;
        playerposX -= 1;
    }

    
    public void keyReleased(KeyEvent e) {
        //Player Movement
        if (e.getKeyCode() == KeyEvent.VK_UP) UP = false;
        if(e.getKeyCode() == KeyEvent.VK_DOWN) DOWN = false;
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) RIGHT = false;
        if(e.getKeyCode() == KeyEvent.VK_LEFT) LEFT = false;
    }
    
    public void actionPerformed(ActionEvent e) {
        timer.start();
        
        //Background Movement
        backgroundX1  = backgroundX1 - 3;
        backgroundX2  = backgroundX2 - 3;
        backgroundX3  = backgroundX3 - 3;
        
        //Enemy Movement
        if (enemyPosX1 > 1500) {
            enemyPosX1 = enemyPosX1 - 3;
        }
        
        repaint();
    }
    
    public void mousePressed(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        if (mouseX >= 1700 && mouseX <= 1919 && mouseY >= 1006 && mouseY <= 1074) {
            System.exit(0);
        }
    }
    
    public void mouseClicked(MouseEvent e) {}
    
    public void mouseReleased(MouseEvent e) {}
    
    public void mouseEntered(MouseEvent e) {}
    
    public void mouseExited(MouseEvent e) {}
}
