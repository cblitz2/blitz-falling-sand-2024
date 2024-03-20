package blitz.fallingsand;

import javax.swing.*;
import java.awt.*;

public class SandComponent extends JComponent {
    private final Sand sand;

    public SandComponent(Sand sand) {
        this.sand = sand;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int[][] field = sand.getField();

        sand.fall();
        repaint();

        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; x++) {
                if (sand.get(x, y) == 1) {
                    g.fillRect(x * 4, y, 5, 5);
                }
            }
        }
    }
}
