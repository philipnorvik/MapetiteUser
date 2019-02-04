package UserGUI;

import javax.swing.*;

public class Text extends JLabel {

    public Text(String text, int x, int y, int width, int height) {
        setText(text);
        setBounds(x, y, width, height);
    }
}
