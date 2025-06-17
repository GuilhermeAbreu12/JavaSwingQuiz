package components;
import javax.swing.*;
import java.awt.*;

class FooterText extends JLabel{
    public FooterText(){
        // Texto do footer
        super("<html><p>Desenvolvido por Guilherme S.Abreu, Heitor e João Pedro &copy; 2025</p></html>");
        
        setFont(Fontes.Sans_serif_light());
        setForeground(Color.WHITE);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
    }
}

public class Footer extends JPanel{
    public Footer() {
        setBackground(Color.BLUE);
        setPreferredSize(new Dimension(400, 60));
        setOpaque(true);
        // Adicionando o FooterText
        add(new FooterText());
    }
}