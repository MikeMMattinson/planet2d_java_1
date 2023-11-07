package src;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Planet extends JPanel {
    
    BufferedImage pImage;
    private String pGroup;
    private String pImgName;
    private String pImgResource;

    public Planet() {
        this.pGroup ="Terrestrial";
        this.pImgResource = "images";
        this.pImgName = "earth_64.png";
        this.pImage = getImage();

    }

    private BufferedImage getImage() {
        BufferedImage img = null;
        String pImgResourcePath = String.format("/%s/%s", this.pImgResource, this.pImgName);
        try {
            img = ImageIO.read(getClass().getResourceAsStream(pImgResourcePath));

        } catch(IOException e) {
            e.printStackTrace();
        }
        return img;
    }

    public void update() {
    }

    public void draw(Graphics2D g2) {
        super.paint(g2);
        g2.drawImage(this.pImage, 400, 400, 100,100,null);

    }

    
    
}
