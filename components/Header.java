package components;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

class Titulo extends JLabel{
    public Titulo(){
        // Criando e adicionando um título ao header
        JLabel titulo = new JLabel("<html>Portu<span style='color: yellow;'>Quiz</span></html>");
        titulo.setFont(Fontes.Sans_serif_bold());
        titulo.setForeground(Color.WHITE);
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
