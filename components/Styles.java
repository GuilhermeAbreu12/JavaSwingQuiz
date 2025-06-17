package components;
import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Styles {
    // Estilo dos retângulos de questões
    public static void questionStyle(JComponent component){
        Dimension size = new Dimension(900, 100);
        component.setPreferredSize(size);
        component.setMaximumSize(size);
        component.setMinimumSize(size);
        component.setAlignmentX(Component.CENTER_ALIGNMENT);
        component.setBackground(Cores.Cinza01());
    }
    // Estilo de texto padrão
    public static void fontStyle(JLabel label){
        label.setFont(Fontes.Sans_serif());
        label.setForeground(Color.BLACK);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
    // Estilo dos botões
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