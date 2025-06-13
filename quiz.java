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

        JLabel titulo = new JLabel("<html>Portu<span style='color: yellow;'>Quiz</span></html>");
        titulo.setFont(Fontes.Sans_serif_bold());
        titulo.setForeground(Color.WHITE);

        header.add(titulo);

        // Main
        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));

        JLabel subtitle = new JLabel("Teste seus conhecimentos sobre plurais");
        subtitle.setFont(Fontes.Sans_serif());
        subtitle.setForeground(Cores.Amarelo01());
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        subtitle.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        // Criando os retângulos de perguntas e adicionando o estilo a eles
        JPanel question1 = new JPanel();
        Styles.questionStyle(question1);

        JPanel question2 = new JPanel();
        Styles.questionStyle(question2);

        // Separando os retângulos em duas partes
        JPanel textArea = new JPanel();
        Panels.TextArea(textArea);
    
        JPanel optionsArea1 = new JPanel();
        Panels.OptionsArea(optionsArea1);

        // Textos das perguntas
        JLabel texto1 = new JLabel("O plural de degrau é degraus?");
        JLabel texto2 = new JLabel("O plural de gravidez é gravidezes?");
        
        // Adição do estilo ao texto
        Styles.fontStyle(texto1);
        Styles.fontStyle(texto2);

        textArea.add(texto1);

        // Criando os botões de opções e adicionando as configurações correspondentes
        JButton question1_option1 = new JButton("Verdadeiro");
        Btn.TrueButton(question1_option1);
        
        JButton question1_option2 = new JButton("Falso");
        Btn.FalseButton(question1_option2);

        // Adicionando as dependências aos retângulos de perguntas
        optionsArea1.add(question1_option1);
        optionsArea1.add(question1_option2);

        question1.add(textArea);
        question1.add(optionsArea1);

        question2.add(texto2);

        // Adicionando as perguntas ao main com espaçamento entre elas
        main.add(subtitle);
        main.add(Box.createVerticalStrut(20)); 
        main.add(question1); main.add(Box.createVerticalStrut(20)); 
        main.add(question2); main.add(Box.createVerticalStrut(20));

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

// Classes auxiliares para cores e estilos

class Cores{
    public static Color Azul01(){
        return new Color(0, 0, 100);
    }
    public static Color Amarelo01(){
        return new Color(220, 220, 0);
    }
    public static Color Cinza01(){
        return new Color(200, 200, 200);
    }
    public static Color Verde01(){
        return new Color(0,200,0);
    }
}

class Styles {
    public static void questionStyle(JComponent component){
        Dimension size = new Dimension(900, 100);
        component.setPreferredSize(size);
        component.setMaximumSize(size);
        component.setMinimumSize(size);
        component.setAlignmentX(Component.CENTER_ALIGNMENT);
        component.setBackground(Cores.Cinza01());
    }

    public static void fontStyle(JLabel label){
        label.setFont(Fontes.Sans_serif());
        label.setForeground(Color.BLACK);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    public static void buttonStyle(JButton button){
        button.setSize(500,300);
        button.setBackground(Cores.Azul01());
        button.setForeground(Color.WHITE);
        button.setFocusable(false);
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

class Btn extends JButton{
    // Configurações para as alternativas corretas
    public static void TrueButton(JButton button){
        Styles.buttonStyle(button);
        button.addActionListener(e -> {
            button.setBackground(Cores.Verde01());
            System.out.println("[Evento] Usuário clicou no botão correto");
        });
    }

    // Configurações para as alternativas incorretas
    public static void FalseButton(JButton button){
        Styles.buttonStyle(button);
        button.addActionListener(e -> {
            button.setBackground(Color.RED);
            System.out.println("[Evento] Usuário clicou no botão errado");
        });
    }
}
class Panels extends JPanel{
    public static void TextArea(JPanel panel) {
        Dimension size = new Dimension(900, 50);
        panel.setPreferredSize(size);
        panel.setMaximumSize(size);
        panel.setMinimumSize(size);

        panel.setBackground(Color.GREEN);
        panel.setForeground(Color.WHITE);
    }
    public static void OptionsArea(JPanel panel) {
        Dimension size = new Dimension(900, 50);
        panel.setPreferredSize(size);
        panel.setMaximumSize(size);
        panel.setMinimumSize(size);

        panel.setForeground(Color.GRAY);
        panel.setBackground(Cores.Cinza01);
    }
}