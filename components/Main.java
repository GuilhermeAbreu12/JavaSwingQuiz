package components;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import components.questions.*;

public class Main extends JPanel{
    public Main(){
        setLayout(
            new BoxLayout(
                new Main(), 
                BoxLayout.Y_AXIS
            )
        );
        add(new Subtitle());
        add(Box.createVerticalStrut(20)); 
        
        add(new Question01()); 
        add(new Question02());
        add(new Question03());
        add(new Question04());
        add(new Question05());
        
        add(Box.createVerticalStrut(20));
    }
}
