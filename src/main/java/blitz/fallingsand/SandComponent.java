package blitz.fallingsand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SandComponent extends JComponent {
    private final Sand sand;

    public SandComponent(Sand sand) {
        this.sand = sand;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int y = 0; y < sand.getField().length; y++) {
            for (int x = 0; x < sand.getField()[y].length; x++) {
                if (sand.get(x, y) == 1) {
                    g.fillRect(x * 5, y * 5, 5, 5);
                }
            }
        }
        int delay = 200;
        ActionListener animationListener = e -> {
            sand.fall();
            repaint();
        };
        new Timer(delay, animationListener).start();
    }

}
