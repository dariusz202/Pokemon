package view;

import model.Trainer;
import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class Application {

    public JButton AboutButton;
    public JButton PlayButton;
    public JButton ReadyButton;
    public JLabel background;
    public JLabel pokemons;
    public JFrame frame;

    public JButton ReviveButton1;
    public JButton PotionButton1;
    public JButton AttackButton1;
    public JLabel player1;
    public JLabel numberofpotion1;
    public JLabel possiblerevive1;
    public JLabel trainerlabel1;
    public JTextField trainername1;
    public JLabel pokemonlabellvl1;
    public JLabel pokemonnamelabellvl1;
    public JTextField pokemonnamelvl1;
    public JLabel pokemontypelabellvl1;
    public JComboBox pokemontypelvl1;
    public JLabel pokemonlabellvl2;
    public JLabel pokemonnamelabellvl2;
    public JTextField pokemonnamelvl2;
    public JLabel pokemontypelabellvl2;
    public JComboBox pokemontypelvl2;
    public JLabel pokemonlabellvl3;
    public JLabel pokemonnamelabellvl3;
    public JTextField pokemonnamelvl3;
    public JLabel pokemontypelabellvl3;
    public JComboBox pokemontypelvl3;
    public JLabel currentpokemonname1;

    public JButton ReviveButton2;
    public JButton PotionButton2;
    public JButton AttackButton2;
    public JLabel player2;
    public JLabel numberofpotion2;
    public JLabel possiblerevive2;
    public JLabel trainerlabel2;
    public JTextField trainername2;
    public JLabel pokemonlabellvl1v2;
    public JLabel pokemonnamelabellvl1v2;
    public JTextField pokemonnamelvl1v2;
    public JLabel pokemontypelabellvl1v2;
    public JComboBox pokemontypelvl1v2;
    public JLabel pokemonlabellvl2v2;
    public JLabel pokemonnamelabellvl2v2;
    public JTextField pokemonnamelvl2v2;
    public JLabel pokemontypelabellvl2v2;
    public JComboBox pokemontypelvl2v2;
    public JLabel pokemonlabellvl3v2;
    public JLabel pokemonnamelabellvl3v2;
    public JTextField pokemonnamelvl3v2;
    public JLabel pokemontypelabellvl3v2;
    public JComboBox pokemontypelvl3v2;
    public JLabel currentpokemonname2;





    public Application() {
        frame = new JFrame();
        frame.setBounds(100,100,710,530);
        frame.getContentPane().setLayout(null);
        Image icon = Toolkit.getDefaultToolkit().createImage("pictures\\icon.jfif");
        this.frame.setResizable(false);
        this.frame.setIconImage(icon);
        this.frame.setTitle("Pokemon");
        startwindowbuttons();
        startwindow();
    }

    public void startwindowbuttons(){
        PlayButton = new JButton("Play");
        {
            PlayButton.setBounds(300,200,100,32);
            frame.getContentPane().add(PlayButton);
        }
        AboutButton = new JButton("About");
        {
            AboutButton.setBounds(300,250,100,32);
            frame.getContentPane().add(AboutButton);
        }
    }
    public void createwindowbuttons(){
        ReadyButton = new JButton("Ready");
        {
            ReadyButton.setBounds(280,430,100,32);
            frame.getContentPane().add(ReadyButton);
        }
    }
    public void gamewindowbuttons(){
        ReviveButton1 = new JButton("Revive");
        {
            ReviveButton1.setBounds(10,430,80,32);
            frame.getContentPane().add(ReviveButton1);
        }
        PotionButton1 = new JButton("Potion");
        {
            PotionButton1.setBounds(100,430,80,32);
            frame.getContentPane().add(PotionButton1);
        }
        AttackButton1 = new JButton("Attack");
        {
            AttackButton1.setBounds(190,430,80,32);
            frame.getContentPane().add(AttackButton1);
        }

        ReviveButton2 = new JButton("Revive");
        {
            ReviveButton2.setBounds(420,430,80,32);
            frame.getContentPane().add(ReviveButton2);
        }
        PotionButton2 = new JButton("Potion");
        {
            PotionButton2.setBounds(510,430,80,32);
            frame.getContentPane().add(PotionButton2);
        }
        AttackButton2 = new JButton("Attack");
        {
            AttackButton2.setBounds(600,430,80,32);
            frame.getContentPane().add(AttackButton2);
        }
    }
    public void startwindow(){

        background = new JLabel();
        {
            background.setIcon(new ImageIcon("pictures\\StartWindow.jpg"));
            background.setBounds(0,0,700,500);
            frame.getContentPane().add(background);
        }
    }

    public void createwindow() {


        player1 = new JLabel("Player 1");
        {
            player1.setForeground(Color.white);
            player1.setBounds(80,100,100,20);
            frame.getContentPane().add(player1);
        }
        trainerlabel1 = new JLabel(" name :");
        {
            trainerlabel1.setForeground(Color.white);
            trainerlabel1.setBounds(50,130,100,20);
            frame.getContentPane().add(trainerlabel1);
        }
        trainername1 = new JTextField();
        {
            trainername1.setBounds(100,130,80,20);
            trainername1.setDocument(new JTextFieldLimit(10));
            frame.getContentPane().add(trainername1);
        }
        pokemonlabellvl1 = new JLabel("pokemon lvl 1");
        {
            pokemonlabellvl1.setForeground(Color.white);
            pokemonlabellvl1.setBounds(70,160,100,20);
            frame.getContentPane().add(pokemonlabellvl1);
        }
        pokemonnamelabellvl1 = new JLabel(" name :");
        {
            pokemonnamelabellvl1.setForeground(Color.white);
            pokemonnamelabellvl1.setBounds(50,180,100,20);
            frame.getContentPane().add(pokemonnamelabellvl1);
        }
        pokemonnamelvl1 = new JTextField();
        {
            pokemonnamelvl1.setBounds(100,180,80,20);
            pokemonnamelvl1.setDocument(new JTextFieldLimit(10));
            frame.getContentPane().add(pokemonnamelvl1);
        }
        pokemontypelabellvl1 = new JLabel(" type :");
        {
            pokemontypelabellvl1.setForeground(Color.white);
            pokemontypelabellvl1.setBounds(50,210,80,20);
            frame.getContentPane().add(pokemontypelabellvl1);
        }
        pokemontypelvl1 = new JComboBox();
        {
            pokemontypelvl1.setBounds(100,210,80,20);
            pokemontypelvl1.addItem("Fire");
            pokemontypelvl1.addItem("Water");
            pokemontypelvl1.addItem("Grass");
            frame.getContentPane().add(pokemontypelvl1);

        }

        pokemonlabellvl2 = new JLabel("pokemon lvl 2");
        {
            pokemonlabellvl2.setForeground(Color.white);
            pokemonlabellvl2.setBounds(70,250,100,20);
            frame.getContentPane().add(pokemonlabellvl2);
        }
        pokemonnamelabellvl2 = new JLabel(" name :");
        {
            pokemonnamelabellvl2.setForeground(Color.white);
            pokemonnamelabellvl2.setBounds(50,270,100,20);
            frame.getContentPane().add(pokemonnamelabellvl2);
        }
        pokemonnamelvl2 = new JTextField();
        {
            pokemonnamelvl2.setBounds(100,270,80,20);
            pokemonnamelvl2.setDocument(new JTextFieldLimit(10));
            frame.getContentPane().add(pokemonnamelvl2);
        }
        pokemontypelabellvl2 = new JLabel(" type :");
        {
            pokemontypelabellvl2.setForeground(Color.white);
            pokemontypelabellvl2.setBounds(50,300,80,20);
            frame.getContentPane().add(pokemontypelabellvl2);
        }
        pokemontypelvl2 = new JComboBox();
        {
            pokemontypelvl2.setBounds(100,300,80,20);
            pokemontypelvl2.addItem("Fire");
            pokemontypelvl2.addItem("Water");
            pokemontypelvl2.addItem("Grass");
            frame.getContentPane().add(pokemontypelvl2);
        }
        pokemonlabellvl3 = new JLabel("pokemon lvl 3");
        {
            pokemonlabellvl3.setForeground(Color.white);
            pokemonlabellvl3.setBounds(70,330,100,20);
            frame.getContentPane().add(pokemonlabellvl3);
        }
        pokemonnamelabellvl3 = new JLabel(" name :");
        {
            pokemonnamelabellvl3.setForeground(Color.white);
            pokemonnamelabellvl3.setBounds(50,350,100,20);
            frame.getContentPane().add(pokemonnamelabellvl3);
        }
        pokemonnamelvl3 = new JTextField();
        {
            pokemonnamelvl3.setBounds(100,350,80,20);
            pokemonnamelvl3.setDocument(new JTextFieldLimit(10));
            frame.getContentPane().add(pokemonnamelvl3);
        }
        pokemontypelabellvl3 = new JLabel(" type :");
        {
            pokemontypelabellvl3.setForeground(Color.white);
            pokemontypelabellvl3.setBounds(50,380,80,20);
            frame.getContentPane().add(pokemontypelabellvl3);
        }
        pokemontypelvl3 = new JComboBox();
        {
            pokemontypelvl3.setBounds(100,380,80,20);
            pokemontypelvl3.addItem("Fire");
            pokemontypelvl3.addItem("Water");
            pokemontypelvl3.addItem("Grass");
            frame.getContentPane().add(pokemontypelvl3);
        }



        player2 = new JLabel("Player 2");
        {
            player2.setForeground(Color.white);
            player2.setBounds(540,100,100,20);
            frame.getContentPane().add(player2);
        }
        trainerlabel2 = new JLabel(" name :");
        {
            trainerlabel2.setForeground(Color.white);
            trainerlabel2.setBounds(500,130,100,20);
            frame.getContentPane().add(trainerlabel2);
        }
        trainername2 = new JTextField();
        {
            trainername2.setBounds(550,130,80,20);
            trainername2.setDocument(new JTextFieldLimit(10));
            frame.getContentPane().add(trainername2);
        }
        pokemonlabellvl1v2 = new JLabel("pokemon lvl 1");
        {
            pokemonlabellvl1v2.setForeground(Color.white);
            pokemonlabellvl1v2.setBounds(530,160,100,20);
            frame.getContentPane().add(pokemonlabellvl1v2);
        }
        pokemonnamelabellvl1v2 = new JLabel(" name :");
        {
            pokemonnamelabellvl1v2.setForeground(Color.white);
            pokemonnamelabellvl1v2.setBounds(500,180,100,20);
            frame.getContentPane().add(pokemonnamelabellvl1v2);
        }
        pokemonnamelvl1v2 = new JTextField();
        {
            pokemonnamelvl1v2.setBounds(550,180,80,20);
            pokemonnamelvl1v2.setDocument(new JTextFieldLimit(10));
            frame.getContentPane().add(pokemonnamelvl1v2);
        }
        pokemontypelabellvl1v2 = new JLabel(" type :");
        {
            pokemontypelabellvl1v2.setForeground(Color.white);
            pokemontypelabellvl1v2.setBounds(500,210,80,20);
            frame.getContentPane().add(pokemontypelabellvl1v2);
        }
        pokemontypelvl1v2 = new JComboBox();
        {
            pokemontypelvl1v2.setBounds(550,210,80,20);
            pokemontypelvl1v2.addItem("Fire");
            pokemontypelvl1v2.addItem("Water");
            pokemontypelvl1v2.addItem("Grass");
            frame.getContentPane().add(pokemontypelvl1v2);

        }

        pokemonlabellvl2v2 = new JLabel("pokemon lvl 2");
        {
            pokemonlabellvl2v2.setForeground(Color.white);
            pokemonlabellvl2v2.setBounds(530,250,100,20);
            frame.getContentPane().add(pokemonlabellvl2v2);
        }
        pokemonnamelabellvl2v2 = new JLabel(" name :");
        {
            pokemonnamelabellvl2v2.setForeground(Color.white);
            pokemonnamelabellvl2v2.setBounds(500,270,100,20);
            frame.getContentPane().add(pokemonnamelabellvl2v2);
        }
        pokemonnamelvl2v2 = new JTextField();
        {
            pokemonnamelvl2v2.setBounds(550,270,80,20);
            pokemonnamelvl2v2.setDocument(new JTextFieldLimit(10));
            frame.getContentPane().add(pokemonnamelvl2v2);
        }
        pokemontypelabellvl2v2 = new JLabel(" type :");
        {
            pokemontypelabellvl2v2.setForeground(Color.white);
            pokemontypelabellvl2v2.setBounds(500,300,80,20);
            frame.getContentPane().add(pokemontypelabellvl2v2);
        }
        pokemontypelvl2v2 = new JComboBox();
        {
            pokemontypelvl2v2.setBounds(550,300,80,20);
            pokemontypelvl2v2.addItem("Fire");
            pokemontypelvl2v2.addItem("Water");
            pokemontypelvl2v2.addItem("Grass");
            frame.getContentPane().add(pokemontypelvl2v2);
        }
        pokemonlabellvl3v2 = new JLabel("pokemon lvl 3");
        {
            pokemonlabellvl3v2.setForeground(Color.white);
            pokemonlabellvl3v2.setBounds(530,330,100,20);
            frame.getContentPane().add(pokemonlabellvl3v2);
        }
        pokemonnamelabellvl3v2 = new JLabel(" name :");
        {
            pokemonnamelabellvl3v2.setForeground(Color.white);
            pokemonnamelabellvl3v2.setBounds(500,350,100,20);
            frame.getContentPane().add(pokemonnamelabellvl3v2);
        }
        pokemonnamelvl3v2 = new JTextField();
        {
            pokemonnamelvl3v2.setBounds(550,350,80,20);
            pokemonnamelvl3v2.setDocument(new JTextFieldLimit(10));
            frame.getContentPane().add(pokemonnamelvl3v2);
        }
        pokemontypelabellvl3v2 = new JLabel(" type :");
        {
            pokemontypelabellvl3v2.setForeground(Color.white);
            pokemontypelabellvl3v2.setBounds(500,380,80,20);
            frame.getContentPane().add(pokemontypelabellvl3v2);
        }
        pokemontypelvl3v2 = new JComboBox();
        {
            pokemontypelvl3v2.setBounds(550,380,80,20);
            pokemontypelvl3v2.addItem("Fire");
            pokemontypelvl3v2.addItem("Water");
            pokemontypelvl3v2.addItem("Grass");
            frame.getContentPane().add(pokemontypelvl3v2);
        }


        background = new JLabel();
        {
            background.setIcon(new ImageIcon("pictures\\PlayWindow.jpg"));
            background.setBounds(0,0,700,500);
            frame.getContentPane().add(background);
        }

    }

    public void gamewindow(){

        player1 = new JLabel("Player 1");
        {
            player1.setBounds(60,10,100,20);
            frame.getContentPane().add(player1);
        }

        trainerlabel1 = new JLabel();
        {
            trainerlabel1.setBounds(20,40,150,20);
            frame.getContentPane().add(trainerlabel1);
        }
        numberofpotion1 = new JLabel();
        {
            numberofpotion1.setBounds(20,60,150,20);
            frame.getContentPane().add(numberofpotion1);
        }
        possiblerevive1 = new JLabel();
        {
            possiblerevive1.setBounds(20,80,150,20);
            frame.getContentPane().add(possiblerevive1);
        }
        currentpokemonname1 = new JLabel();
        {
            currentpokemonname1.setBounds(20,100,190,20);
            frame.getContentPane().add(currentpokemonname1);
        }

        background = new JLabel();
        {
            background.setIcon(new ImageIcon("pictures\\GameWindow.jpg"));
            background.setBounds(0,0,700,500);
            frame.getContentPane().add(background);
        }



    }



    public JButton getPlayButton(){ return PlayButton; }

    public JButton getAboutButton(){ return AboutButton; }

    public JButton getReadyButton(){return ReadyButton;}

    public JButton getReviveButton1(){ return ReviveButton1; }

    public JButton getPotionButton1(){ return PotionButton1; }

    public JButton getAttackButton1(){return AttackButton1;}

    public JButton getReviveButton2(){ return ReviveButton2; }

    public JButton getPotionButton2(){ return PotionButton2; }

    public JButton getAttackButton2(){return AttackButton2;}
}
