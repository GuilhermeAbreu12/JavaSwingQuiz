import javax.swing.*;
import java.awt.*;

public class quiz{
    public static void main(String[] args){

        // Configurações da janela
        JFrame frame = new JFrame();
        frame.setSize(1000,830);
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

        JPanel question3 = new JPanel();
        Styles.questionStyle(question3);

        JPanel question4 = new JPanel();
        Styles.questionStyle(question4);

        JPanel question5 = new JPanel();
        Styles.questionStyle(question5);

        // Separando os retângulos em duas partes
        JPanel textArea1 = new JPanel();
        Panels.TextArea(textArea1);
        JPanel optionsArea1 = new JPanel();
        Panels.OptionsArea(optionsArea1);

        JPanel textArea2 = new JPanel();
        Panels.TextArea(textArea2);
        JPanel optionsArea2 = new JPanel();
        Panels.OptionsArea(optionsArea2);

        JPanel textArea3 = new JPanel();
        Panels.TextArea(textArea3);
        JPanel optionsArea3 = new JPanel();
        Panels.OptionsArea(optionsArea3);

        JPanel textArea4 = new JPanel();
        Panels.TextArea(textArea4);
        JPanel optionsArea4 = new JPanel();
        Panels.OptionsArea(optionsArea4);

        JPanel textArea5 = new JPanel();
        Panels.TextArea(textArea5);
        JPanel optionsArea5 = new JPanel();
        Panels.OptionsArea(optionsArea5);

        // Textos das perguntas
        JLabel texto1 = new JLabel("O plural de degraus é degrais?");
        JLabel texto2 = new JLabel("O plural de bem-estar é bem-estares?");
        JLabel texto3 = new JLabel("O plural de militar é militares?");
        JLabel texto4 = new JLabel("O plural de anzol é anzois?"); 
        JLabel texto5 = new JLabel("O plural de segunda-feira é segundas-feiras?");
        
        // Adição do estilo ao texto
        Styles.fontStyle(texto1);
        Styles.fontStyle(texto2);
        Styles.fontStyle(texto3);
        Styles.fontStyle(texto4);
        Styles.fontStyle(texto5);
        // Adicionando os textos às áreas de texto

        textArea1.add(texto1);
        textArea2.add(texto2);
        textArea3.add(texto3);
        textArea4.add(texto4);
        textArea5.add(texto5);

        // Criando os botões de opções e adicionando as configurações correspondentes
        JButton question1_option1 = new JButton("Verdadeiro"); Btn.FalseButton(question1_option1);
        JButton question1_option2 = new JButton("Falso"); Btn.TrueButton(question1_option2);

        JButton question2_option1 = new JButton("Verdadeiro"); Btn.TrueButton(question2_option1);
        JButton question2_option2 = new JButton("Falso"); Btn.FalseButton(question2_option2);

        JButton question3_option1 = new JButton("Verdadeiro"); Btn.TrueButton(question3_option1);
        JButton question3_option2 = new JButton("Falso"); Btn.FalseButton(question3_option2);

        JButton question4_option1 = new JButton("Verdadeiro"); Btn.FalseButton(question4_option1);
        JButton question4_option2 = new JButton("Falso"); Btn.TrueButton(question4_option2);

        JButton question5_option1 = new JButton("Verdadeiro"); Btn.TrueButton(question5_option1);
        JButton question5_option2 = new JButton("Falso"); Btn.FalseButton(question5_option2);

        // Adicionando as dependências aos retângulos de perguntas
        optionsArea1.add(question1_option1);
        optionsArea1.add(question1_option2);

        optionsArea2.add(question2_option1);
        optionsArea2.add(question2_option2);

        optionsArea3.add(question3_option1);
        optionsArea3.add(question3_option2);

        optionsArea4.add(question4_option1);
        optionsArea4.add(question4_option2);

        optionsArea5.add(question5_option1);
        optionsArea5.add(question5_option2);

        // Adicionando as áreas de texto e opções às perguntas

        question1.add(textArea1);
        question1.add(optionsArea1);

        question2.add(textArea2);
        question2.add(optionsArea2);

        question3.add(textArea3);
        question3.add(optionsArea3);

        question4.add(textArea4);
        question4.add(optionsArea4);

        question5.add(textArea5);
        question5.add(optionsArea5);

        // Adicionando as perguntas ao main com espaçamento entre elas
        main.add(subtitle);
        main.add(Box.createVerticalStrut(20)); 
        
        main.add(question1); main.add(Box.createVerticalStrut(20)); 
        main.add(question2); main.add(Box.createVerticalStrut(20));
        main.add(question3); main.add(Box.createVerticalStrut(20));
        main.add(question4); main.add(Box.createVerticalStrut(20));
        main.add(question5); main.add(Box.createVerticalStrut(20));
        
        main.add(Box.createVerticalStrut(20));

        // Footer
        JLabel footerText = new JLabel("Desenvolvido por Guilherme.Abreu, João Pedro e Heitor");
        footerText.setFont(Fontes.Sans_serif_light());
        footerText.setForeground(Color.WHITE);
        footerText.setAlignmentX(Component.CENTER_ALIGNMENT);
        footerText.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        JPanel footer = new JPanel();
        footer.setBackground(Cores.Azul01());
        footer.setPreferredSize(new Dimension(400, 60));
        footer.add(footerText);

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
    public static Font Sans_serif_light(){
        return new Font("SansSerif", Font.PLAIN, 18);
    }
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
        button.addActionListener(_-> {
            button.setBackground(Cores.Verde01());
            System.out.println("[Evento] Usuário clicou no botão correto");
        });
    }
    // Configurações para as alternativas incorretas
    public static void FalseButton(JButton button){
        Styles.buttonStyle(button);
        button.addActionListener(_-> {
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