package src;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PlanetPanel extends JPanel {

    Planet planet = new Planet();

    public PlanetPanel(){
        this.setPreferredSize(new Dimension(800,800));
        this.setBackground(Color.BLACK);
        //this.setDoubleBuffered(true);
        this.setFocusable(true);  
    }

    public void update(){
        planet.update();

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 =(Graphics2D) g;
        planet.draw(g2);

    }
  
    
}
