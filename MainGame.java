import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGame extends JFrame
{
    private Trainer trainer;

    public MainGame(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;

        
        Container c = getContentPane();
        JLabel trainerNameLabel = new JLabel();
        c.add(trainerNameLabel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }
}