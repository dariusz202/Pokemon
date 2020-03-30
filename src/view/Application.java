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
    public JFrame frame;

    public JLabel pokemonslabel1;
    public JButton ReviveButton1;
    public JButton PotionButton1;
    public JButton AttackButton1;
    public JButton Selectlvl1Button1;
    public JButton Selectlvl2Button1;
    public JButton Selectlvl3Button1;
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
    public JLabel pokemonlvl1currenthealth;
    public JLabel pokemonlvl2currenthealth;
    public JLabel pokemonlvl3currenthealth;
    public JLabel currentpokemonname1;

    public JLabel pokemonslabel2;
    public JButton ReviveButton2;
    public JButton PotionButton2;
    public JButton AttackButton2;
    public JButton Selectlvl1Button2;
    public JButton Selectlvl2Button2;
    public JButton Selectlvl3Button2;
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
    public JLabel pokemonlvl1currenthealthv2;
    public JLabel pokemonlvl2currenthealthv2;
    public JLabel pokemonlvl3currenthealthv2;
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
            PlayButton.setForeground(Color.black);
            PlayButton.setBounds(300,200,100,32);
            frame.getContentPane().add(PlayButton);
        }
        AboutButton = new JButton("About");
        {
            AboutButton.setForeground(Color.black);
            AboutButton.setBounds(300,250,100,32);
            frame.getContentPane().add(AboutButton);
        }
    }
    public void createwindowbuttons(){
        ReadyButton = new JButton("Ready");
        {
            ReadyButton.setForeground(Color.black);
            ReadyButton.setBounds(280,430,100,32);
            frame.getContentPane().add(ReadyButton);
        }
    }
    public void gamewindowbuttons(){
        ReviveButton1 = new JButton("Revive");
        {
            ReviveButton1.setForeground(Color.black);
            ReviveButton1.setBounds(10,430,80,32);
            frame.getContentPane().add(ReviveButton1);
        }
        PotionButton1 = new JButton("Potion");
        {
            PotionButton1.setForeground(Color.black);
            PotionButton1.setBounds(100,430,80,32);
            frame.getContentPane().add(PotionButton1);
        }
        AttackButton1 = new JButton("Attack");
        {
            AttackButton1.setForeground(Color.black);
            AttackButton1.setBounds(190,430,80,32);
            frame.getContentPane().add(AttackButton1);
        }

        ReviveButton2 = new JButton("Revive");
        {
            ReviveButton2.setForeground(Color.black);
            ReviveButton2.setBounds(420,430,80,32);
            frame.getContentPane().add(ReviveButton2);
        }
        PotionButton2 = new JButton("Potion");
        {
            PotionButton2.setForeground(Color.black);
            PotionButton2.setBounds(510,430,80,32);
            frame.getContentPane().add(PotionButton2);
        }
        AttackButton2 = new JButton("Attack");
        {
            AttackButton2.setForeground(Color.black);
            AttackButton2.setBounds(600,430,80,32);
            frame.getContentPane().add(AttackButton2);
        }
        Selectlvl1Button1 = new JButton();
        {
            Selectlvl1Button1.setForeground(Color.black);
            Selectlvl1Button1.setBounds(20,160,150,20);
            frame.getContentPane().add(Selectlvl1Button1);
        }
        Selectlvl2Button1 = new JButton();
        {
            Selectlvl2Button1.setForeground(Color.black);
            Selectlvl2Button1.setBounds(20,240,150,20);
            frame.getContentPane().add(Selectlvl2Button1);
        }
        Selectlvl3Button1 = new JButton();
        {
            Selectlvl3Button1.setForeground(Color.black);
            Selectlvl3Button1.setBounds(20,320,150,20);
            frame.getContentPane().add(Selectlvl3Button1);
        }
        Selectlvl1Button2 = new JButton();
        {
            Selectlvl1Button2.setForeground(Color.black);
            Selectlvl1Button2.setBounds(500,160,150,20);
            frame.getContentPane().add(Selectlvl1Button2);
        }
        Selectlvl2Button2 = new JButton();
        {
            Selectlvl2Button2.setForeground(Color.black);
            Selectlvl2Button2.setBounds(500,240,150,20);
            frame.getContentPane().add(Selectlvl2Button2);
        }
        Selectlvl3Button2 = new JButton();
        {
            Selectlvl3Button2.setForeground(Color.black);
            Selectlvl3Button2.setBounds(500,320,150,20);
            frame.getContentPane().add(Selectlvl3Button2);
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

        pokemonslabel1 = new JLabel(" Pokemons :");
        {
            pokemonslabel1.setForeground(Color.black);
            pokemonslabel1.setBounds(70,130,100,20);
            frame.getContentPane().add(pokemonslabel1);
        }
        player1 = new JLabel("Player 1");
        {
            player1.setForeground(Color.black);
            player1.setBounds(70,10,100,20);
            frame.getContentPane().add(player1);
        }

        trainerlabel1 = new JLabel();
        {
            trainerlabel1.setForeground(Color.black);
            trainerlabel1.setBounds(20,40,150,20);
            frame.getContentPane().add(trainerlabel1);
        }
        numberofpotion1 = new JLabel();
        {
            numberofpotion1.setForeground(Color.black);
            numberofpotion1.setBounds(20,60,150,20);
            frame.getContentPane().add(numberofpotion1);
        }
        possiblerevive1 = new JLabel();
        {
            possiblerevive1.setForeground(Color.black);
            possiblerevive1.setBounds(20,80,150,20);
            frame.getContentPane().add(possiblerevive1);
        }
        currentpokemonname1 = new JLabel();
        {
            currentpokemonname1.setForeground(Color.black);
            currentpokemonname1.setBounds(20,100,190,20);
            frame.getContentPane().add(currentpokemonname1);
        }
        pokemonlabellvl1 = new JLabel("LvL 1");
        {
            pokemonlabellvl1.setForeground(Color.black);
            pokemonlabellvl1.setBounds(80,180,100,20);
            frame.getContentPane().add(pokemonlabellvl1);
        }
        pokemontypelabellvl1 = new JLabel();
        {
            pokemontypelabellvl1.setForeground(Color.black);
            pokemontypelabellvl1.setBounds(60,200,80,20);
            frame.getContentPane().add(pokemontypelabellvl1);
        }
        pokemonlvl1currenthealth = new JLabel();
        {
            pokemonlvl1currenthealth.setForeground(Color.black);
            pokemonlvl1currenthealth.setBounds(40,220,150,20);
            frame.getContentPane().add(pokemonlvl1currenthealth);
        }

        pokemonlabellvl2 = new JLabel("LvL 2");
        {
            pokemonlabellvl2.setForeground(Color.black);
            pokemonlabellvl2.setBounds(80,260,100,20);
            frame.getContentPane().add(pokemonlabellvl2);
        }
        pokemontypelabellvl2 = new JLabel();
        {
            pokemontypelabellvl2.setForeground(Color.black);
            pokemontypelabellvl2.setBounds(60,280,80,20);
            frame.getContentPane().add(pokemontypelabellvl2);
        }
        pokemonlvl2currenthealth = new JLabel();
        {
            pokemonlvl2currenthealth.setForeground(Color.black);
            pokemonlvl2currenthealth.setBounds(30,300,150,20);
            frame.getContentPane().add(pokemonlvl2currenthealth);
        }
        pokemonlabellvl3 = new JLabel("LvL 3");
        {
            pokemonlabellvl3.setForeground(Color.black);
            pokemonlabellvl3.setBounds(80,340,100,20);
            frame.getContentPane().add(pokemonlabellvl3);
        }
        pokemontypelabellvl3 = new JLabel();
        {
            pokemontypelabellvl3.setForeground(Color.black);
            pokemontypelabellvl3.setBounds(60,360,80,20);
            frame.getContentPane().add(pokemontypelabellvl3);
        }
        pokemonlvl3currenthealth = new JLabel();
        {
            pokemonlvl3currenthealth.setForeground(Color.black);
            pokemonlvl3currenthealth.setBounds(40,380,150,20);
            frame.getContentPane().add(pokemonlvl3currenthealth);
        }




        pokemonslabel2 = new JLabel(" Pokemons :");
        {
            pokemonslabel2.setForeground(Color.black);
            pokemonslabel2.setBounds(550,130,100,20);
            frame.getContentPane().add(pokemonslabel2);
        }

        player2 = new JLabel("Player 2");
        {
            player2.setForeground(Color.black);
            player2.setBounds(550,10,100,20);
            frame.getContentPane().add(player2);
        }

        trainerlabel2 = new JLabel();
        {
            trainerlabel2.setForeground(Color.black);
            trainerlabel2.setBounds(500,40,150,20);
            frame.getContentPane().add(trainerlabel2);
        }
        numberofpotion2 = new JLabel();
        {
            numberofpotion2.setForeground(Color.black);
            numberofpotion2.setBounds(500,60,150,20);
            frame.getContentPane().add(numberofpotion2);
        }
        possiblerevive2 = new JLabel();
        {
            possiblerevive2.setForeground(Color.black);
            possiblerevive2.setBounds(500,80,150,20);
            frame.getContentPane().add(possiblerevive2);
        }
        currentpokemonname2 = new JLabel();
        {
            currentpokemonname2.setForeground(Color.black);
            currentpokemonname2.setBounds(500,100,190,20);
            frame.getContentPane().add(currentpokemonname2);
        }

        pokemonlabellvl1v2 = new JLabel("LvL 1");
        {
            pokemonlabellvl1v2.setForeground(Color.black);
            pokemonlabellvl1v2.setBounds(560,180,100,20);
            frame.getContentPane().add(pokemonlabellvl1v2);
        }
        pokemontypelabellvl1v2 = new JLabel();
        {
            pokemontypelabellvl1v2.setForeground(Color.black);
            pokemontypelabellvl1v2.setBounds(540,200,80,20);
            frame.getContentPane().add(pokemontypelabellvl1v2);
        }
        pokemonlvl1currenthealthv2 = new JLabel();
        {
            pokemonlvl1currenthealthv2.setForeground(Color.black);
            pokemonlvl1currenthealthv2.setBounds(520,220,150,20);
            frame.getContentPane().add(pokemonlvl1currenthealthv2);
        }

        pokemonlabellvl2v2 = new JLabel("LvL 2");
        {
            pokemonlabellvl2v2.setForeground(Color.black);
            pokemonlabellvl2v2.setBounds(560,260,100,20);
            frame.getContentPane().add(pokemonlabellvl2v2);
        }
        pokemontypelabellvl2v2 = new JLabel();
        {
            pokemontypelabellvl2v2.setForeground(Color.black);
            pokemontypelabellvl2v2.setBounds(540,280,80,20);
            frame.getContentPane().add(pokemontypelabellvl2v2);
        }
        pokemonlvl2currenthealthv2 = new JLabel();
        {
            pokemonlvl2currenthealthv2.setForeground(Color.black);
            pokemonlvl2currenthealthv2.setBounds(520,300,150,20);
            frame.getContentPane().add(pokemonlvl2currenthealthv2);
        }
        pokemonlabellvl3 = new JLabel("LvL 3");
        {
            pokemonlabellvl3.setForeground(Color.black);
            pokemonlabellvl3.setBounds(560,340,100,20);
            frame.getContentPane().add(pokemonlabellvl3);
        }
        pokemontypelabellvl3v2 = new JLabel();
        {
            pokemontypelabellvl3v2.setForeground(Color.black);
            pokemontypelabellvl3v2.setBounds(540,360,80,20);
            frame.getContentPane().add(pokemontypelabellvl3v2);
        }
        pokemonlvl3currenthealthv2 = new JLabel();
        {
            pokemonlvl3currenthealthv2.setForeground(Color.black);
            pokemonlvl3currenthealthv2.setBounds(520,380,150,20);
            frame.getContentPane().add(pokemonlvl3currenthealthv2);
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

    public JButton getSelectlvl1Button1(){return Selectlvl1Button1;}

    public JButton getSelectlvl2Button1(){return Selectlvl2Button1;}

    public JButton getSelectlvl3Button1(){return Selectlvl3Button1;}

    public JButton getSelectlvl1Button2(){return Selectlvl1Button2;}

    public JButton getSelectlvl2Button2(){return Selectlvl2Button2;}

    public JButton getSelectlvl3Button2(){return Selectlvl3Button2;}
}
