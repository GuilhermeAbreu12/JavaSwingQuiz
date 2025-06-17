package components.questions;
import javax.swing.*;
import components.*;

public class Question04 extends JPanel{
    public Question04(){
        Styles.questionStyle(this);
        // Adicionando as áreas de texto e opções às perguntas
        add(new TextArea04());
        add(new OptionsArea04());
        add(Box.createVerticalStrut(20));
    }
}

// Separando os retângulos em duas partes
class TextArea04 extends JPanel{
    public TextArea04(){
        new Panels().TextArea(new TextArea04());
        
        // Adicionando2 o texto à área de texto
        add(new Texto04());
    }
}

// Texto de pergunta
class Texto04 extends JLabel{ 
    public Texto04(){
        // Adicionando o texto ao Label
        super("O plural de anzol é anzois?");
        
        // Adicionando o estilo ao texto
        Styles.fontStyle(this);
    }
}


// Áreas de opções
class OptionsArea04 extends JPanel{
    public OptionsArea04(){
        new Panels().OptionsArea(new OptionsArea04());

        // Adicionando as dependências aos retângulos de perguntas
        add(new Question04Option01());
        add(new Question04Option02());
    }
}

// Opções
class Question04Option01 extends JButton{
    public Question04Option01(){
        // Criando os botões de opções e adicionando as configurações correspondentes
        super("Verdadeiro"); 
        Btn.FalseButton(this);
    }
}
class Question04Option02 extends JButton {
    public Question04Option02(){
        // Criando os botões de opções e adicionando as configurações correspondentes
        super("Falso"); 
        Btn.TrueButton(this);
    }
}