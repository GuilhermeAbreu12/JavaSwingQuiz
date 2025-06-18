package components;
import java.awt.*;
import javax.swing.*;

// Texto de subtítulo
class SubtitleText extends JLabel {
    public SubtitleText(){
        // Texto do subtítulo
        super("Teste seus conhecimentos sobre plurais");
        
        // Configurações do texto de subtítulo
        setFont(Fontes.Sans_serif());
        setForeground(Cores.Verde01());
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 2, 0));
    }
}

// Criando o subtítulo
public class Subtitle extends JPanel{
    public Subtitle(){
        Dimension size = new Dimension(500, 40);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);
        
        setOpaque(false);

        // Adicionando o texto
        add(new SubtitleText());
    }
}
