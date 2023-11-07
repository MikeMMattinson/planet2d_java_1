import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class PlanetPanel extends JPanel {

    public PlanetPanel(){
        this.setPreferredSize(new Dimension(800,800));
        this.setBackground(Color.BLACK);
        //this.setDoubleBuffered(true);
        this.setFocusable(true);  
    }
  
    
}
