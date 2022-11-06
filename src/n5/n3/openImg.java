package n5.n3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class openImg {
    private static JFrame frame;
    public static void main(String args[]) throws IOException {
        frame = new JFrame("openImg");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(866, 866);
        //BufferedImage bufferedImage = ImageIO.read(new File(openImg.class.getResource("testImg.jpg").getPath()));
        BufferedImage bufferedImage = ImageIO.read(new File(args[0]));
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bufferedImage, 0, 0, null);
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }
}
