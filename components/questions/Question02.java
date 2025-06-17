package components.questions;
import javax.swing.*;
import components.*;

public class Question02 extends JPanel{
    public Question02(){
        Styles.questionStyle(this);
        // Adicionando as áreas de texto e opções às perguntas
        add(new TextArea02());
        add(new OptionsArea02());
        add(Box.createVerticalStrut(20));
    }
}

// Separando os retângulos em duas partes
class TextArea02 extends JPanel{
    public TextArea02(){
        new Panels().TextArea(new TextArea02());
        
        // Adicionando2 o texto à área de texto
        add(new Texto02());
    }
}

// Texto de pergunta
class Texto02 extends JLabel{ 
    public Texto02(){
        // Adicionando o texto ao Label
        super("O plural de bem-estar é bem-estares?");
        
        // Adicionando o estilo ao texto
        Styles.fontStyle(this);
    }
}


// Áreas de opções
class OptionsArea02 extends JPanel{
    public OptionsArea02(){
        new Panels().OptionsArea(new OptionsArea02());

        // Adicionando as dependências aos retângulos de perguntas
        add(new Question02Option01());
        add(new Question02Option02());
    }
}

// Opções
class Question02Option01 extends JButton{
    public Question02Option01(){
        // Criando os botões de opções e adicionando as configurações correspondentes
        super("Verdadeiro"); 
        Btn.TrueButton(this);
    }
}
class Question02Option02 extends JButton {
    public Question02Option02(){
        // Criando os botões de opções e adicionando as configurações correspondentes
        super("Falso"); 
        Btn.FalseButton(this);
    }
}