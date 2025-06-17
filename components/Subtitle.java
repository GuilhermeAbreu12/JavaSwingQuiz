package components;

import java.awt.*;
import javax.swing.*;

class SubtitleText extends JLabel {
    public SubtitleText(){
        super("Teste seus conhecimentos sobre plurais");
        setFont(Fontes.Sans_serif());
        setForeground(Cores.Verde01());
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 2, 0));
    }
}

public class Subtitle extends JPanel{
    public Subtitle(){
        Dimension size = new Dimension(500, 40);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);

        add(new SubtitleText());
    }
}
