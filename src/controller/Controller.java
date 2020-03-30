package controller;

import model.Pokemon;
import model.Trainer;
import view.Application;

import javax.swing.*;
import java.awt.event.*;




public class Controller implements ActionListener{

    public Application GUI;
    public Trainer player1;
    public Trainer player2;


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

        GUI.getReviveButton1().addActionListener(this);
        GUI.getPotionButton1().addActionListener(this);
        GUI.getAttackButton1().addActionListener(this);
        GUI.getReviveButton2().addActionListener(this);
        GUI.getPotionButton2().addActionListener(this);
        GUI.getAttackButton2().addActionListener(this);
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
        if((((JButton) e.getSource() == GUI.getReviveButton1()))){
            try{
                ReviveButton1();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
        if((((JButton) e.getSource() == GUI.getPotionButton1()))){
            try{
                PotionButton1();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
        if((((JButton) e.getSource() == GUI.getAttackButton1()))){
            try{
                AttackButton1();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
        if((((JButton) e.getSource() == GUI.getReviveButton2()))){
            try{
                ReviveButton2();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
        if((((JButton) e.getSource() == GUI.getPotionButton2()))){
            try{
                PotionButton2();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
        if((((JButton) e.getSource() == GUI.getAttackButton2()))){
            try{
                AttackButton2();
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
    public void ReadyButton() throws Exception{
        view("GameView");
    }
    public Trainer player1(){
        Pokemon a = new Pokemon(GUI.pokemonnamelvl1.getText(),1,GUI.pokemontypelvl1.getSelectedItem().toString());
        Pokemon b = new Pokemon(GUI.pokemonnamelvl2.getText(),2,GUI.pokemontypelvl2.getSelectedItem().toString());
        Pokemon c = new Pokemon(GUI.pokemonnamelvl3.getText(),3,GUI.pokemontypelvl3.getSelectedItem().toString());
        player1 = new Trainer(GUI.trainername1.getText(),new Pokemon[] {a,b,c});
        return player1;
    }
    public Trainer player2(){

        Pokemon d = new Pokemon(GUI.pokemonnamelvl1v2.getText(),1,GUI.pokemontypelvl1v2.getSelectedItem().toString());
        Pokemon e = new Pokemon(GUI.pokemonnamelvl2v2.getText(),2,GUI.pokemontypelvl2v2.getSelectedItem().toString());
        Pokemon f = new Pokemon(GUI.pokemonnamelvl3v2.getText(),3,GUI.pokemontypelvl3v2.getSelectedItem().toString());
        player2 = new Trainer(GUI.trainername2.getText(),new Pokemon[] {d,e,f});
        return player2;
    }

    private Trainer ReviveButton1() throws Exception{
        player1.revive();
        GUI.possiblerevive1.setText("Possible revive :"+ player1.possiblerevive);
        return player1;
    }
    private Trainer PotionButton1() throws Exception{
        player1.potion();
        GUI.numberofpotion1.setText("Number of potion :" + player1.numberofpotion );
        return player1;
    }
    public Trainer AttackButton1() throws Exception{
        if(player1.pokemons[player1.currentlypokemon].current_health != 0){
            player1.attack_other_trainer(player2);
            return player2;
        }
        else{
            System.out.println(player1.trainername +" need to change his current pokemon");
            return player2;
        }
    }
    private Trainer ReviveButton2() throws Exception{
        player2.revive();
        GUI.possiblerevive2.setText("Possible revive :"+ player2.possiblerevive);
        return player2;
    }
    private Trainer PotionButton2() throws Exception{
        player2.potion();
        GUI.numberofpotion2.setText("Number of potion :" + player2.numberofpotion );
        return player2;
    }
    private Trainer AttackButton2() throws Exception{
        if(player2.pokemons[player2.currentlypokemon].current_health != 0) {
            player2.attack_other_trainer(player1);
            return player1;
        }
        else{
            System.out.println(player2.trainername +" need to change his current pokemon");
            return player1;
        }
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
                player1();
                player2();
                System.out.println(player1().numberofpotion);
                GUI.frame.getContentPane().removeAll();
                GUI.frame.repaint();
                GUI.gamewindowbuttons();
                addActionListenergamewindow();
                GUI.gamewindow();
                GUI.numberofpotion1.setText("Number of potion :" + player1.numberofpotion );
                GUI.trainerlabel1.setText("Name :" + player1.trainername);
                GUI.currentpokemonname1.setText("Currently pokemon :" + (player1.pokemons[player1.currentlypokemon].name ));
                GUI.possiblerevive1.setText("Possible revive :"+ (player1.possiblerevive));
                break;

        }
    }
}
