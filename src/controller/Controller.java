package controller;

import view.Application;

import java.awt.*;

public class Controller {

    private Application GUI;
    Image icon = Toolkit.getDefaultToolkit().createImage("pictures\\icon.jfif");
    public Controller(){
        this.GUI = new Application();
        this.GUI.frame.setVisible(true);
        this.GUI.frame.setResizable(false);
        this.GUI.frame.setIconImage(icon);
        this.GUI.frame.setTitle("Pokemon");
    }
}
