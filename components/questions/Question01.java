package components.questions;
import javax.swing.*;
import components.*;

public class Question01 extends JPanel{
    public Question01(){
        Styles.questionStyle(this);
        
        // Adicionando os filhos (pergunta e opções)
        add(new TextArea01());
        add(new OptionsArea01());

        add(Box.createVerticalStrut(20));
    }
}

// Separando os retângulos em duas partes
class TextArea01 extends JPanel{
    public TextArea01(){
        new Panels().TextArea(this);
        setBackground(Cores.Cinza01());
        
        // Adicionando o texto à área de texto
        add(new Texto01());
    }
}

// Texto de pergunta
class Texto01 extends JLabel{ 
    public Texto01(){
        // Criando o conteúdo do texto
        super("O plural de degrau é degrais?");  
        // Adicionando o estilo ao texto
        Styles.fontStyle(this);
    }
}

// Áreas de opções
class OptionsArea01 extends JPanel{
    public OptionsArea01(){
        new Panels().OptionsArea(this);
        setBackground(Cores.Cinza01());
        // Adicionando os filhos dos retângulos de perguntas
        add(new Question01Option01());
        add(new Question01Option02());
    }
}
// Opções
class Question01Option01 extends JButton{
    public Question01Option01(){
        super("Verdadeiro"); 
        Btn.FalseButton(this);
    }
}
class Question01Option02 extends JButton {
    public Question01Option02(){
        super("Falso"); 
        Btn.TrueButton(this);
    }
}
