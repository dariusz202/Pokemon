package view;

import javax.swing.*;
import java.awt.*;

public class GameWindow {

    public JFrame frame;
    ImageIcon img = new ImageIcon("StartWindow.jpg");
    private JButton ReadyButton;


    public GameWindow() {
        initializeView();
    }

    public void initializeView() {
        frame = new JFrame();
        frame.setBounds(100,100,710,530);
        frame.getContentPane().setLayout(null);
        Image icon = Toolkit.getDefaultToolkit().createImage("pictures\\icon.jfif");
        this.frame.setResizable(false);
        this.frame.setIconImage(icon);
        this.frame.setTitle("Pokemon");


    }


}

