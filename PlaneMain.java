

import javax.swing.JFrame;


public class PlaneMain {

    public static JFrame window;
    public static PlanetPanel pp = new PlanetPanel();
    
    public static void main(String[] args){
        window = new JFrame();
        window.add(pp);
        window.pack();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    } 
}
