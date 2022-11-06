package n5.n2;

import javax.swing.*;
import java.awt.*;

public class Colors {
    static class ShapeDrawing extends JComponent {
        public void paint(Graphics g) {
            Graphics2D graphics2D = (Graphics2D) g;
            Color[] colors = new Color[5];
            colors[0] = Color.RED;
            colors[1] = Color.GREEN;
            colors[2] = Color.YELLOW;
            colors[3] = Color.BLUE;
            colors[4] = Color.PINK;

            for (int i = 0; i < 20; ++i) {
                Color first = colors[(int) (Math.random()*5)];
                Color second = colors[(int) (Math.random()*5)];
                while (first==second)
                    second = colors[(int) (Math.random()*5)];
                graphics2D.setPaint(new GradientPaint(0,0,first,100, 0,second));
                graphics2D.fill(new Rectangle(new Point((int) (Math.random() * 1000), (int) (Math.random() * 500)), new Dimension((int) (Math.random() * 300), 100)));
            }

        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Colors figures");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new ShapeDrawing());
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
