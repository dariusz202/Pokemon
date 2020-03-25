package controller;

import view.StartWindow;
import view.PlayWindow;
import view.GameWindow;

import javax.swing.*;
import java.awt.event.*;




public class Controller implements ActionListener{

    private StartWindow GUI;
    private PlayWindow GUI2;
    private GameWindow GUI3;

    public Controller() throws Exception{

        this.GUI = new StartWindow();
        this.GUI.frame.setVisible(true);
        this.addActionListenerMainWindow();
    }
    private void addActionListenerMainWindow(){
        GUI.getPlayButton().addActionListener(this);
        GUI.getAboutButton().addActionListener(this);

    }
    private void addActionListenerPlayWindow(){
        GUI2.getReadyButton().addActionListener(this);
    }
    private void addActionListenerGameWindow(){
        GUI2.getReadyButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if((((JButton) e.getSource() == GUI.getPlayButton()))){
            try{
                PlayButton();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
        if((((JButton) e.getSource() == GUI.getAboutButton()))){
            try{
                AboutButton();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
        if((((JButton) e.getSource() == GUI2.getReadyButton()))){
            try{
                ReadyButton();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
    }

    private void PlayButton() throws Exception{
        view("PlayView");
    }
    private void AboutButton() throws Exception{
        view("AboutView");
    }
    private void ReadyButton() throws Exception{
        view("GameView");
    }
    private void view(String view){
        switch(view) {
            case "PlayView":
                this.GUI.frame.setVisible(false);
                this.GUI2 = new PlayWindow();
                this.addActionListenerPlayWindow();
                this.GUI2.frame.setVisible(true);
                break;
            case "AboutView":
                break;
            case "GameView":
                this.GUI2.frame.setVisible(false);
                this.GUI3 = new GameWindow();
                this.addActionListenerGameWindow();
                this.GUI3.frame.setVisible(true);









        }




    }
}
