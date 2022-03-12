package SpaceRocket;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class main extends JPanel {
    int panelHeight, panelWidth;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        SpaceRocket rocket = new SpaceRocket();
        frame.add(rocket);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Space Rocket");
        frame.setUndecorated(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(true);
        frame.setVisible(true);
        
    }
}
