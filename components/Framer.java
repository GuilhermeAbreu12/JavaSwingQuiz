package components;
import java.awt.*;
import javax.swing.JFrame;

public class Framer extends JFrame{
    public Framer(){
        setSize(1000,830);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Adicionando filhos
        add(new Header(), BorderLayout.NORTH);
        add(new CustomScrollPane());
        add(new Footer(), BorderLayout.SOUTH);

        setVisible(true);
    }
}
