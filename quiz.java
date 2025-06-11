import javax.swing.*;
import java.awt.*;

public class quiz{
    public static void main(String[] args){

        // Configurações da janela
        JFrame frame = new JFrame();
        frame.setSize(1000,800);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Header
        JPanel header = new JPanel(new GridBagLayout());
        header.setBackground(Cores.Azul01());
        header.setPreferredSize(new Dimension(400, 60));

        JLabel titulo = new JLabel("<html>Portu<span style='color: blue;'>Quiz</span></html>");
        titulo.setFont(Fontes.Sans_serif_bold());
        titulo.setForeground(Color.WHITE);
        header.add(titulo);

        // Main
        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));

        JPanel question = new JPanel();
        JLabel texto = new JLabel("Texto geéosijdsfoisjfosijsoifjsdoijoijsgosigudhgsfiuhsdgpdfiuhfdgodiudshfiuhfiufdhiufhdsgiudhfsufhdfguuuu");
        question.add(texto);

        JPanel question2 = new JPanel();

        Styles.questionStyle(question);
        Styles.questionStyle(question2);

        main.add(question); 
        main.add(Box.createVerticalStrut(20));
        main.add(question2);
        main.add(Box.createVerticalStrut(20));

        // Footer
        JPanel footer = new JPanel();
        footer.setBackground(Cores.Azul01());
        footer.setPreferredSize(new Dimension(400, 60));

        // Configurações finais
        frame.add(header, BorderLayout.NORTH);
        frame.add(main);
        frame.add(footer, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}

class Cores{
    public static Color Azul01(){
        return new Color(0, 0, 100);
    }
}

class Fontes{
    public static Font Sans_serif(){
        return new Font("SansSerif", Font.PLAIN, 24);
    }
    public static Font Sans_serif_bold(){
        return new Font("SansSerif", Font.BOLD, 24);
    }
}

class Styles {
    public static void questionStyle(JComponent component){
        Dimension size = new Dimension(700, 100);
        component.setPreferredSize(size);
        component.setMaximumSize(size);
        component.setMinimumSize(size);
        component.setAlignmentX(Component.CENTER_ALIGNMENT);

        component.setBackground(Color.RED);
    }
}