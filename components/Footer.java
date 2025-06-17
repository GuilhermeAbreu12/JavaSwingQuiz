package components;
import javax.swing.*;
import java.awt.*;

// Texto do footer
class FooterText extends JLabel{
    public FooterText(){
        // Texto (literalmente) do Footer
        super("<html><p>Desenvolvido por Guilherme S.Abreu, Heitor e João Pedro &copy; 2025</p></html>");
        
        // Configurando o texto do Footer
        setFont(Fontes.Sans_serif_light());
        setForeground(Color.WHITE);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
    }
}

// Criando o Footer
public class Footer extends JPanel{
    public Footer() {
        // Configurando o Footer
        setBackground(Cores.Azul01());
        setPreferredSize(new Dimension(400, 60));
        setOpaque(true);
        
        // Adicionando o FooterText
        add(new FooterText());
    }
}