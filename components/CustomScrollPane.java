package components;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class CustomScrollPane extends JScrollPane{
    public CustomScrollPane(Component component){
        super(component);

        // Garantindo que seja opaco por segurança de design
        getViewport().setOpaque(false);
        setOpaque(false);
        
        getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            // Configurando a cor da barra de rolagem
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = Cores.Azul02(); // Colocando uma cor personalizada NA barra de rolagem 
                this.trackColor = Color.WHITE; // Cor do FUNDO da barra de rolagem
            }

            // Tirando os botões para subir e descer da barra (são feios ;-;)
            @Override
            protected JButton createDecreaseButton(int orientation){
                return createZeroButton();
            }

            @Override
            protected JButton createIncreaseButton(int orientation){
                return createZeroButton();
            }

            private JButton createZeroButton(){
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(0, 0));
                button.setMinimumSize(new Dimension(0, 0));
                button.setMaximumSize(new Dimension(0, 0));
                return button;
            }
        });
    }
}
