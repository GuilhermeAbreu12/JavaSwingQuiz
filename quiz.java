import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;

import components.*;

public class quiz{
    public static void main(String[] args){
        // Criando os retângulos de perguntas e adicionando o estilo a eles
        JPanel question2 = new JPanel();
        Styles.questionStyle(question2);

        JPanel question3 = new JPanel();
        Styles.questionStyle(question3);

        JPanel question4 = new JPanel();
        Styles.questionStyle(question4);

        JPanel question5 = new JPanel();
        Styles.questionStyle(question5);

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
        
        JLabel texto2 = new JLabel("O plural de bem-estar é bem-estares?");
        JLabel texto3 = new JLabel("O plural de militar é militares?");
        JLabel texto4 = new JLabel("O plural de anzol é anzois?"); 
        JLabel texto5 = new JLabel("O plural de segunda-feira é segundas-feiras?");
        
        // Adição do estilo ao texto
        Styles.fontStyle(texto2);
        Styles.fontStyle(texto3);
        Styles.fontStyle(texto4);
        Styles.fontStyle(texto5);

        // Adicionando os textos às áreas de texto
        textArea2.add(texto2);
        textArea3.add(texto3);
        textArea4.add(texto4);
        textArea5.add(texto5);

        // Criando os botões de opções e adicionando as configurações correspondentes

        JButton question2_option1 = new JButton("Verdadeiro"); Btn.TrueButton(question2_option1);
        JButton question2_option2 = new JButton("Falso"); Btn.FalseButton(question2_option2);

        JButton question3_option1 = new JButton("Verdadeiro"); Btn.TrueButton(question3_option1);
        JButton question3_option2 = new JButton("Falso"); Btn.FalseButton(question3_option2);

        JButton question4_option1 = new JButton("Verdadeiro"); Btn.FalseButton(question4_option1);
        JButton question4_option2 = new JButton("Falso"); Btn.TrueButton(question4_option2);

        JButton question5_option1 = new JButton("Verdadeiro"); Btn.TrueButton(question5_option1);
        JButton question5_option2 = new JButton("Falso"); Btn.FalseButton(question5_option2);

        // Adicionando as dependências aos retângulos de perguntas
        optionsArea2.add(question2_option1);
        optionsArea2.add(question2_option2);

        optionsArea3.add(question3_option1);
        optionsArea3.add(question3_option2);

        optionsArea4.add(question4_option1);
        optionsArea4.add(question4_option2);

        optionsArea5.add(question5_option1);
        optionsArea5.add(question5_option2);

        // Adicionando as áreas de texto e opções às perguntas
        question2.add(textArea2);
        question2.add(optionsArea2);

        question3.add(textArea3);
        question3.add(optionsArea3);

        question4.add(textArea4);
        question4.add(optionsArea4);

        question5.add(textArea5);
        question5.add(optionsArea5);
    }
}