package controller;

import model.Pokemon;
import model.Trainer;
import view.Application;
import view.TextAreaOutputStream;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.*;
import javax.swing.border.Border;


public class Controller implements ActionListener{

    public Application GUI;
    public Trainer player1;
    public Trainer player2;
    public TextAreaOutputStream taOutputStream;
    //public Border border;
    //public JTextArea textArea = new JTextArea();
    //public TextAreaOutputStream taOutputStream = new TextAreaOutputStream(
     //       textArea,"");



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
        GUI.getSelectlvl1Button1().addActionListener(this);
        GUI.getSelectlvl2Button1().addActionListener(this);
        GUI.getSelectlvl3Button1().addActionListener(this);
        GUI.getSelectlvl1Button2().addActionListener(this);
        GUI.getSelectlvl2Button2().addActionListener(this);
        GUI.getSelectlvl3Button2().addActionListener(this);
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
        if((((JButton) e.getSource() == GUI.getSelectlvl1Button1()))){
            try{
                Selectlvl1Button1();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
        if((((JButton) e.getSource() == GUI.getSelectlvl2Button1()))){
            try{
                Selectlvl2Button1();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
        if((((JButton) e.getSource() == GUI.getSelectlvl3Button1()))){
            try{
                Selectlvl3Button1();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
        if((((JButton) e.getSource() == GUI.getSelectlvl1Button2()))){
            try{
                Selectlvl1Button2();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
        if((((JButton) e.getSource() == GUI.getSelectlvl2Button2()))){
            try{
                Selectlvl2Button2();
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
        if((((JButton) e.getSource() == GUI.getSelectlvl3Button2()))){
            try{
                Selectlvl3Button2();
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

    private Trainer Selectlvl1Button1(){
        if(player1.currentlypokemon == 0) {
            System.out.println(player1.trainername + " you already have chosen this pokemon !");
            return player1;
        }
        else{
            player1.changepokemon(0);
            GUI.currentpokemonname1.setText("Currently pokemon :" + (player1.pokemons[player1.currentlypokemon].name ));
            return player1;
        }
    }
    private Trainer Selectlvl2Button1(){
        if(player1.currentlypokemon == 1) {
            System.out.println(player1.trainername + " you already have chosen this pokemon !");
            return player1;
        }
        else{
            player1.changepokemon(1);
            GUI.currentpokemonname1.setText("Currently pokemon :" + (player1.pokemons[player1.currentlypokemon].name ));
            return player1;
        }
    }
    private Trainer Selectlvl3Button1(){
        if(player1.currentlypokemon == 2) {
            System.out.println(player1.trainername + " you already have chosen this pokemon !");
            return player1;
        }
        else{
            player1.changepokemon(2);
            GUI.currentpokemonname1.setText("Currently pokemon :" + (player1.pokemons[player1.currentlypokemon].name ));
            return player1;
        }
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
        if(player1.pokemons[player1.currentlypokemon].current_health != 0) {
            if(player1.pokemons[player1.currentlypokemon] == player1.pokemons[0]) {
                player1.attack_other_trainer(player2);
                GUI.pokemonlvl1currenthealthv2.setText("Current health : " + player2.pokemons[0].current_health);
                return player2;
            }
            else if(player1.pokemons[player1.currentlypokemon] == player1.pokemons[1]) {
                player1.attack_other_trainer(player2);
                GUI.pokemonlvl2currenthealthv2.setText("Current health : " + player2.pokemons[1].current_health);
                return player2;
            }
            else {
                player1.attack_other_trainer(player2);
                GUI.pokemonlvl3currenthealthv2.setText("Current health : " + player2.pokemons[2].current_health);
                return player2;
            }
        }
        else{
            System.out.println(player2.trainername +" need to change his current pokemon");
            return player1;
        }
    }
    private Trainer Selectlvl1Button2(){
        if(player2.currentlypokemon == 0) {
            System.out.println(player2.trainername + " you already have chosen this pokemon !");
            return player2;
        }
        else{
            player2.changepokemon(0);
            GUI.currentpokemonname2.setText("Currently pokemon :" + (player2.pokemons[player2.currentlypokemon].name ));
            return player2;
        }
    }
    private Trainer Selectlvl2Button2(){
        if(player2.currentlypokemon == 1) {
            System.out.println(player2.trainername + " you already have chosen this pokemon !");
            return player2;
        }
        else{
            player2.changepokemon(1);
            GUI.currentpokemonname2.setText("Currently pokemon :" + (player2.pokemons[player2.currentlypokemon].name ));
            return player2;
        }
    }
    private Trainer Selectlvl3Button2(){
        if(player2.currentlypokemon == 2) {
            System.out.println(player2.trainername + " you already have chosen this pokemon !");
            return player2;
        }
        else{
            player2.changepokemon(2);
            GUI.currentpokemonname2.setText("Currently pokemon :" + (player2.pokemons[player2.currentlypokemon].name ));
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
            if(player2.pokemons[player2.currentlypokemon] == player2.pokemons[0]) {
                player2.attack_other_trainer(player1);
                GUI.pokemonlvl1currenthealth.setText("Current health : " + player1.pokemons[0].current_health);
                return player1;
            }
            else if(player2.pokemons[player2.currentlypokemon] == player2.pokemons[1]) {
                player2.attack_other_trainer(player1);
                GUI.pokemonlvl2currenthealth.setText("Current health : " + player1.pokemons[1].current_health);
                return player1;
            }
            else {
                player2.attack_other_trainer(player1);
                GUI.pokemonlvl3currenthealth.setText("Current health : " + player1.pokemons[2].current_health);
                return player1;
            }
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
                GUI.textpanel.add(GUI.scrollPane);
                //GUI.frame.pack();
                GUI.frame.setLocationRelativeTo(null);
                //textpanel.add(textArea);
                //scrollPane.setV
                //textArea.add(new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                //       JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
                //frame.add(textpanel);
                taOutputStream= new TextAreaOutputStream(GUI.textArea,"");
                System.setOut(new PrintStream(taOutputStream));

                GUI.numberofpotion1.setText("Number of potion :" + player1.numberofpotion );
                GUI.trainerlabel1.setText("Name :" + player1.trainername);
                GUI.currentpokemonname1.setText("Currently pokemon :" + (player1.pokemons[player1.currentlypokemon].name ));
                GUI.possiblerevive1.setText("Possible revive :"+ (player1.possiblerevive));

                GUI.Selectlvl1Button1.setText(" Select "+ player1.pokemons[0].name);
                GUI.pokemontypelabellvl1.setText("Type : " + player1.pokemons[0].type);
                GUI.pokemonlvl1currenthealth.setText("Current health : " + player1.pokemons[0].current_health);

                GUI.Selectlvl2Button1.setText(" Select "+ player1.pokemons[1].name);
                GUI.pokemontypelabellvl2.setText("Type :" + player1.pokemons[1].type);
                GUI.pokemonlvl2currenthealth.setText("Current health : " + player1.pokemons[1].current_health);

                GUI.Selectlvl3Button1.setText(" Select "+ player1.pokemons[2].name);
                GUI.pokemontypelabellvl3.setText("Type : " + player1.pokemons[2].type);
                GUI.pokemonlvl3currenthealth.setText("Current health : " + player1.pokemons[2].current_health);

                GUI.numberofpotion2.setText("Number of potion :" + player2.numberofpotion );
                GUI.trainerlabel2.setText("Name :" + player2.trainername);
                GUI.currentpokemonname2.setText("Currently pokemon :" + (player2.pokemons[player2.currentlypokemon].name ));
                GUI.possiblerevive2.setText("Possible revive :"+ (player2.possiblerevive));

                GUI.Selectlvl1Button2.setText(" Select "+ player2.pokemons[0].name);
                GUI.pokemontypelabellvl1v2.setText("Type : " + player2.pokemons[0].type);
                GUI.pokemonlvl1currenthealthv2.setText("Current health : " + player2.pokemons[0].current_health);

                GUI.Selectlvl2Button2.setText(" Select "+ player2.pokemons[1].name);
                GUI.pokemontypelabellvl2v2.setText("Type :" + player2.pokemons[1].type);
                GUI.pokemonlvl2currenthealthv2.setText("Current health : " + player1.pokemons[1].current_health);

                GUI.Selectlvl3Button2.setText(" Select "+ player2.pokemons[2].name);
                GUI.pokemontypelabellvl3v2.setText("Type : " + player2.pokemons[2].type);
                GUI.pokemonlvl3currenthealthv2.setText("Current health : " + player2.pokemons[2].current_health);
                break;

        }
    }
}
