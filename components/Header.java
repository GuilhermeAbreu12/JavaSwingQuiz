package components;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

// Título do Header
class Titulo extends JLabel{
    public Titulo(){
        super("<html>Portu<span style='color: yellow;'>Quiz</span></html>");
        setFont(Fontes.Sans_serif_bold());
        setForeground(Color.WHITE);
    }
}

// Classe Header
public class Header extends JPanel{
    public Header(){
        // Configurando o Header
        setLayout(new GridBagLayout());
        setBackground(Cores.Azul01());
        setPreferredSize(new Dimension(400, 60));

        // Adicionando o título ao Header
        add(new Titulo());
    }
}
