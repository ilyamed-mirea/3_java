package n12.n4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Animation {
    private static JFrame frame;
    private static String currentPanel = "doorClose";

    public static void main(String args[]) throws IOException, InterruptedException {
        frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 525);

        BufferedImage doorOpen = ImageIO.read(new File(Animation.class.getResource("doorOpen.png").getPath()));
        BufferedImage doorClose = ImageIO.read(new File(Animation.class.getResource("doorClose.png").getPath()));

        CardLayout cardLayout = new CardLayout();
        JPanel base = new JPanel(cardLayout);
        JPanel panelOpen = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(doorOpen, 0, 0, null);
            }
        };
        JPanel panelClose = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(doorClose, 0, 0, null);
            }
        };

        base.add(panelClose,"panelClose");
        base.add(panelOpen,"panelOpen");
        frame.add(base);
        frame.setVisible(true);

        for (int i = 0; true; i++) {
            currentPanel = i % 2 == 0 ? "panelClose" : "panelOpen";

            cardLayout.show(base,currentPanel);

            Thread.sleep(600);
        }
    }
}
