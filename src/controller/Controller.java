package controller;

import model.Pokemon;
import model.Trainer;
import view.Application;

import javax.swing.*;
import java.awt.event.*;




public class Controller implements ActionListener{

    public Application GUI;

    public Controller() throws Exception{

        this.GUI = new Application();
        this.GUI.frame.setVisible(true);
        addActionListenerstartwindow();
    }
    private void addActionListenerstartwindow(){

        GUI.getPlayButton().addActionListener(this);
        GUI.getAboutButton().addActionListener(this);
    }
    private void addActionListenercreatewindow(){
        GUI.getReadyButton().addActionListener(this);
    }
    private void addActionListenergamewindow(){
        GUI.getReadyButton().addActionListener(this);
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
        if((((JButton) e.getSource() == GUI.getReadyButton()))){
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
        Pokemon a = new Pokemon(GUI.pokemonnamelvl1.getText(),1,GUI.pokemontypelvl1.getSelectedItem().toString());
        Pokemon b = new Pokemon(GUI.pokemonnamelvl2.getText(),2,GUI.pokemontypelvl2.getSelectedItem().toString());
        Pokemon c = new Pokemon(GUI.pokemonnamelvl3.getText(),3,GUI.pokemontypelvl3.getSelectedItem().toString());
        Trainer player1 = new Trainer(GUI.trainername1.getText(),new Pokemon[] {a,b,c});
        Pokemon d = new Pokemon(GUI.pokemonnamelvl1v2.getText(),1,GUI.pokemontypelvl1v2.getSelectedItem().toString());
        Pokemon e = new Pokemon(GUI.pokemonnamelvl2v2.getText(),2,GUI.pokemontypelvl2v2.getSelectedItem().toString());
        Pokemon f = new Pokemon(GUI.pokemonnamelvl3v2.getText(),3,GUI.pokemontypelvl3v2.getSelectedItem().toString());
        Trainer player2 = new Trainer(GUI.trainername2.getText(),new Pokemon[] {d,e,f});
        GUI.trainerlabel1.setText(" name :" + player1.trainername);
        GUI.numberofpotion1.setText(" Number of potion :" + player1.numberofpotion );
        GUI.numberofpotion1.setText(" Currently pokemon :" + (player1.pokemons[player1.currentlypokemon].name ));
        System.out.println(a.type);
    }


    private void view(String view){
        switch(view) {
            case "PlayView":
                GUI.frame.getContentPane().removeAll();
                GUI.frame.repaint();
                GUI.createwindowbuttons();
                addActionListenercreatewindow();
                GUI.createwindow();
                break;
            case "AboutView":
                break;
            case "GameView":
                GUI.frame.getContentPane().removeAll();
                GUI.frame.repaint();
                GUI.gamewindowbuttons();
                addActionListenergamewindow();
                GUI.gamewindow();
                break;

        }
    }
}
