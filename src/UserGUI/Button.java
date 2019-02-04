package UserGUI;

import javax.swing.*;

public class Button extends JButton {

    public Button(String text, int x, int y, int width, int height) {
        setText(text);
        setBounds(x, y, width, height);
    }
}
