package components.questions;
import javax.swing.*;
import components.*;

public class Question05 extends JPanel{
    public Question05(){
        Styles.questionStyle(this);
        // Adicionando as áreas de texto e opções às perguntas
        add(new TextArea05());
        add(new OptionsArea05());
        add(Box.createVerticalStrut(20));
    }
}

// Separando os retângulos em duas partes
class TextArea05 extends JPanel{
    public TextArea05(){
        new Panels().TextArea(this);
        // Adicionando2 o texto à área de texto
        add(new Texto05());
    }
}

// Texto de pergunta
class Texto05 extends JLabel{ 
    public Texto05(){
        // Adicionando o texto ao Label
        super("O plural de segunda-feira é segundas-feiras?");
        
        // Adicionando o estilo ao texto
        Styles.fontStyle(this);
    }
}


// Áreas de opções
class OptionsArea05 extends JPanel{
    public OptionsArea05(){
        new Panels().OptionsArea(this);

        // Adicionando as dependências aos retângulos de perguntas
        add(new Question05Option01());
        add(new Question05Option02());
    }
}

// Opções
class Question05Option01 extends JButton{
    public Question05Option01(){
        // Criando os botões de opções e adicionando as configurações correspondentes
        super("Verdadeiro"); 
        Btn.TrueButton(this);
    }
}
class Question05Option02 extends JButton {
    public Question05Option02(){
        // Criando os botões de opções e adicionando as configurações correspondentes
        super("Falso"); 
        Btn.FalseButton(this);
    }
}