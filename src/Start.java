package src;


import javax.swing.JFrame;


public class Start {

    public static JFrame window;
    public static PlanetPanel pp = new PlanetPanel();
    
    public static void main(String[] args){
        window = new JFrame();
        window.add(pp);
        window.pack();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pp.update();
        //pp.paintComponent(Graphics g);
    } 
}
