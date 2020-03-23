package view;
import javax.swing.*;
import java.awt.*;

public class Application extends JFrame{

    public JFrame frame;
    Image img = Toolkit.getDefaultToolkit().createImage("MainScreen.jpg");
    Graphics g;

    private JButton Play;
    private JButton About;
    private JButton Ready;
    private JButton Attack;
    private JButton Heal;
    private JButton Revive;
    private JButton ChangePokemon;
    private JLabel StartWindow;

    public Application(){

        StartWindow();


    }
    public void draw(Graphics g){
        super.paintComponents(g);
        g.drawImage(img,0,0,null);
        pack();


    }
    public void StartWindow() {
        frame = new JFrame();
        frame.setBounds(100,100,700,500);




    }
}




