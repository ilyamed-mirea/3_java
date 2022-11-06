package n5.n1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private static int milanScore = 0;
    private static int realScrore = 0;
    private static String lastScore = "";
    private static String winner = "";
    private static JPanel panel = new JPanel();
    private static JButton buttonMilan = new JButton("AC Milan");
    private static JButton buttonReal = new JButton("Real Madrid");
    private static JLabel resultLab = new JLabel("Result: 0 X 0");
    private static JLabel lastScorerLab = new JLabel("Last scorer: N/A");
    private static JLabel winnerLab = new JLabel("Winner: DRAW");

    private static void updateText(String lastScore) {
        resultLab.setText("Result: " + milanScore + " X " + realScrore);
        lastScorerLab.setText("Last Scorer: "+lastScore);
        winner = milanScore == realScrore ? "DRAW" : String.valueOf((Math.max(milanScore, realScrore))==milanScore?"AC Milan":"Real Madrid");
        winnerLab.setText("Winner: " + winner);
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("Match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBorder(new EmptyBorder(150, 150, 0, 0));
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(500, 500));
        panel.add(buttonMilan);
        panel.add(buttonReal);

        buttonMilan.addActionListener(e -> {
            milanScore++;
            updateText("AC Milan");
        });

        buttonReal.addActionListener(e -> {
            realScrore++;
            updateText("Real Madrid");
        });

        panel.add(resultLab);
        panel.add(lastScorerLab);
        panel.add(winnerLab);
        frame.getContentPane().add(panel);

        //упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
    }
}
