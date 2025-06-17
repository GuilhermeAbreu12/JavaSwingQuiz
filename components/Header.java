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
public class Header extends JPanel{
    public Header(){
        new GridBagLayout();
        setBackground(Cores.Azul01());
        setPreferredSize(new Dimension(400, 60));

        add(new Titulo());
    }
}
