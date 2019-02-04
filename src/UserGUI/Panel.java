package UserGUI;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Panel(int x, int y, int width, int height, Color color) {
        setLayout(null);
        setBounds(x, y, width, height);
        setBackground(color);
    }
}
