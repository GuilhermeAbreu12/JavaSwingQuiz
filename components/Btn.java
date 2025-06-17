package components;
import javax.swing.*;
import java.awt.*;

public class Btn extends JButton{
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
        button.addActionListener(e-> {
            button.setBackground(Color.RED);
            System.out.println("[Evento] Usuário clicou no botão errado");
        });
    }
}
