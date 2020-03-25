package view;

import javax.swing.*;
import java.awt.*;

public class StartWindow extends JFrame{

    public JButton AboutButton;
    public JButton PlayButton;
    private JLabel background;
    public JFrame frame;

    public StartWindow(){
        initializeView();
    }
    public void initializeView(){

        frame = new JFrame();
        frame.setBounds(100,100,710,530);
        frame.getContentPane().setLayout(null);
        Image icon = Toolkit.getDefaultToolkit().createImage("pictures\\icon.jfif");
        this.frame.setResizable(false);
        this.frame.setIconImage(icon);
        this.frame.setTitle("Pokemon");

        AboutButton = new JButton("About");
        {
            AboutButton.setBounds(300,250,100,32);
            frame.getContentPane().add(AboutButton);
        }
        PlayButton = new JButton("Play");
        {
            PlayButton.setBounds(300,200,100,32);
            frame.getContentPane().add(PlayButton);
        }
        background = new JLabel();
        {
            background.setIcon(new ImageIcon("pictures\\StartWindow.jpg"));
            background.setBounds(0,0,700,500);
            frame.getContentPane().add(background);
        }
    }

    public JButton getPlayButton(){ return PlayButton; }

    public JButton getAboutButton(){ return AboutButton; }
}
