package UserGUI;

import javax.swing.*;
import java.awt.*;

public class TextBox extends JTextPane {

    public TextBox(String text, int x, int y, int width, int height, Color color) {
        setText(text);
        setBounds(x, y, width, height);
        setBackground(color);
    }
}
