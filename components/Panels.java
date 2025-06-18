package components;

import javax.swing.*;
import java.awt.*;

public class Panels extends JPanel{
    public void TextArea(JPanel panel) {
        Dimension size = new Dimension(900, 40);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);

        setForeground(null);
    }
    public void OptionsArea(JPanel panel) {
        Dimension size = new Dimension(900, 50);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);

        setForeground(null);
    }
}

