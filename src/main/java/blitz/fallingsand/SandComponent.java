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

        sand.fall();
        repaint();

        for (int y = 0; y < sand.getField().length; y++) {
            for (int x = 0; x < sand.getField()[y].length; x++) {
                if (sand.get(x, y) == 1) {
                    g.fillRect(x * 4, y, 5, 5);
                }
            }
        }
    }
}
