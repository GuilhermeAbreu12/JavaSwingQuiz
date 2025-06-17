package components.questions;
import javax.swing.*;
import components.*;

public class Question01 extends JPanel{
    public Question01(){
        Styles.questionStyle(this);
        // Adicionando as áreas de texto e opções às perguntas
        add(new TextArea01());
        add(new OptionsArea01());
        add(Box.createVerticalStrut(20));
    }
}

// Separando os retângulos em duas partes
class TextArea01 extends JPanel{
    public TextArea01(){
        new Panels().TextArea(new TextArea01());
        
        // Adicionando o texto à área de texto
        add(new Texto01());
    }
}

// Texto de pergunta
class Texto01 extends JLabel{ 
    public Texto01(){
        // Adicionando o texto ao Label
        super("O plural de degraus é degrais?");
        
        // Adicionando o estilo ao texto
        Styles.fontStyle(this);
    }
}


// Áreas de opções
class OptionsArea01 extends JPanel{
    public OptionsArea01(){
        new Panels().OptionsArea(new OptionsArea01());

        // Adicionando as dependências aos retângulos de perguntas
        add(new Question01Option01());
        add(new Question01Option02());
    }
}

// Opções
class Question01Option01 extends JButton{
    public Question01Option01(){
        // Criando os botões de opções e adicionando as configurações correspondentes
        super("Verdadeiro"); 
        Btn.FalseButton(this);
    }
}
class Question01Option02 extends JButton {
    public Question01Option02(){
        // Criando os botões de opções e adicionando as configurações correspondentes
        super("Falso"); 
        Btn.TrueButton(this);
    }
}