package components;

import javax.swing.*;
import java.awt.*;

public class Panels extends JPanel{
    public void TextArea(JPanel panel) {
        Dimension size = new Dimension(900, 40);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);

        setBackground(null);
        setForeground(Color.WHITE);
    }
    public void OptionsArea(JPanel panel) {
        Dimension size = new Dimension(900, 50);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);

        setForeground(null);
        setBackground(Cores.Cinza01());
    }
}

