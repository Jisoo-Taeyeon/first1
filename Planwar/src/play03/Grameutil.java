package play03;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Grameutil {
    public static Image getImage(String path){
        BufferedImage img = null ;
        Grameutil.class.getClassLoader().getResource(path);
        try {
           img= ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }

    public static void main(String[] args) {
        Image  img=Grameutil.getImage("images/plane.png");
        System.out.println(img);
    }

}
