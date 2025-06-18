package components.questions;
import javax.swing.*;
import components.*;

public class Question03 extends JPanel{
    public Question03(){
        Styles.questionStyle(this);
        
        // Adicionando as áreas de texto e opções às perguntas
        add(new TextArea03());
        add(new OptionsArea03());
        add(Box.createVerticalStrut(20));
    }
}

// Separando os retângulos em duas partes
class TextArea03 extends JPanel{
    public TextArea03(){
        new Panels().TextArea(this);
        setBackground(Cores.Cinza01());

        // Adicionando2 o texto à área de texto
        add(new Texto03());
    }
}

// Texto de pergunta
class Texto03 extends JLabel{ 
    public Texto03(){
        // Adicionando o texto ao Label
        super("O plural de militar é militares?");
        
        // Adicionando o estilo ao texto
        Styles.fontStyle(this);
    }
}


// Áreas de opções
class OptionsArea03 extends JPanel{
    public OptionsArea03(){
        new Panels().OptionsArea(this);
        setBackground(Cores.Cinza01());

        // Adicionando as dependências aos retângulos de perguntas
        add(new Question03Option01());
        add(new Question03Option02());
    }
}

// Opções
class Question03Option01 extends JButton{
    public Question03Option01(){
        // Criando os botões de opções e adicionando as configurações correspondentes
        super("Verdadeiro"); 
        Btn.TrueButton(this);
    }
}
class Question03Option02 extends JButton {
    public Question03Option02(){
        // Criando os botões de opções e adicionando as configurações correspondentes
        super("Falso"); 
        Btn.FalseButton(this);
    }
}