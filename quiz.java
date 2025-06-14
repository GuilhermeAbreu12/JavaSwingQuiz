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

        JPanel subtitle = new JPanel();
        Dimension size = new Dimension(500, 40);
        subtitle.setPreferredSize(size);
        subtitle.setMaximumSize(size);
        subtitle.setMinimumSize(size);

        JLabel subtitleText = new JLabel("Teste seus conhecimentos sobre plurais");
        subtitleText.setFont(Fontes.Sans_serif());
        subtitleText.setForeground(Cores.Verde01());
        subtitleText.setAlignmentX(Component.CENTER_ALIGNMENT);
        subtitleText.setBorder(BorderFactory.createEmptyBorder(0, 0, 2, 0));
        
        subtitle.add(subtitleText);
        // Criando os retângulos de perguntas e adicionando o estilo a eles
        JPanel question1 = new JPanel();
        Styles.questionStyle(question1);

        JPanel question2 = new JPanel();
        Styles.questionStyle(question2);

        // Separando os retângulos em duas partes
        JPanel textArea1 = new JPanel();
        Panels.TextArea(textArea1);
        JPanel optionsArea1 = new JPanel();
        Panels.OptionsArea(optionsArea1);

        JPanel textArea2 = new JPanel();
        Panels.TextArea(textArea2);
        JPanel optionsArea2 = new JPanel();
        Panels.OptionsArea(optionsArea2);

        // Textos das perguntas
        JLabel texto1 = new JLabel("O plural de degrau é degraus?");
        JLabel texto2 = new JLabel("O plural de gravidez é gravidezes?");
        
        // Adição do estilo ao texto
        Styles.fontStyle(texto1);
        Styles.fontStyle(texto2);

        textArea1.add(texto1);
        textArea2.add(texto2);

        // Criando os botões de opções e adicionando as configurações correspondentes
        JButton question1_option1 = new JButton("Verdadeiro"); Btn.TrueButton(question1_option1);
        JButton question1_option2 = new JButton("Falso"); Btn.FalseButton(question1_option2);

        JButton question2_option1 = new JButton("Verdadeiro"); Btn.FalseButton(question2_option1);
        JButton question2_option2 = new JButton("Falso"); Btn.TrueButton(question2_option2);

        // Adicionando as dependências aos retângulos de perguntas
        optionsArea1.add(question1_option1);
        optionsArea1.add(question1_option2);

        optionsArea2.add(question2_option1);
        optionsArea2.add(question2_option2);

        question1.add(textArea1);
        question1.add(optionsArea1);

        question2.add(textArea2);
        question2.add(optionsArea2);

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
        return new Color(0,140,0);
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
        Dimension size = new Dimension(150, 35);
        button.setPreferredSize(size);
        button.setMaximumSize(size);
        button.setMinimumSize(size);
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
        button.addActionListener(e-> {
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
        Dimension size = new Dimension(900, 40);
        panel.setPreferredSize(size);
        panel.setMaximumSize(size);
        panel.setMinimumSize(size);

        panel.setBackground(null);
        panel.setForeground(Color.WHITE);
    }
    public static void OptionsArea(JPanel panel) {
        Dimension size = new Dimension(900, 50);
        panel.setPreferredSize(size);
        panel.setMaximumSize(size);
        panel.setMinimumSize(size);

        panel.setForeground(null);
        panel.setBackground(Cores.Cinza01());
    }
}