package view;

import javax.swing.*;
import java.awt.*;

public class CreateWindow {

    public JFrame frame;
    private JButton ReadyButton;
    private JLabel background;
    private JLabel player1;
    private JLabel trainerlabel1;
    public JTextField trainername1;
    private JLabel pokemonlabellvl1;
    private JLabel pokemonnamelabellvl1;
    public JTextField pokemonnamelvl1;
    private JLabel pokemontypelabellvl1;
    public JComboBox pokemontypelvl1;
    private JLabel pokemonlabellvl2;
    private JLabel pokemonnamelabellvl2;
    public JTextField pokemonnamelvl2;
    private JLabel pokemontypelabellvl2;
    public JComboBox pokemontypelvl2;
    private JLabel pokemonlabellvl3;
    private JLabel pokemonnamelabellvl3;
    public JTextField pokemonnamelvl3;
    private JLabel pokemontypelabellvl3;
    public JComboBox pokemontypelvl3;


    private JLabel player2;
    private JLabel trainerlabel1v2;
    public JTextField trainername1v2;
    private JLabel pokemonlabellvl1v2;
    private JLabel pokemonnamelabellvl1v2;
    public JTextField pokemonnamelvl1v2;
    private JLabel pokemontypelabellvl1v2;
    public JComboBox pokemontypelvl1v2;
    private JLabel pokemonlabellvl2v2;
    private JLabel pokemonnamelabellvl2v2;
    public JTextField pokemonnamelvl2v2;
    private JLabel pokemontypelabellvl2v2;
    public JComboBox pokemontypelvl2v2;
    private JLabel pokemonlabellvl3v2;
    private JLabel pokemonnamelabellvl3v2;
    public JTextField pokemonnamelvl3v2;
    private JLabel pokemontypelabellvl3v2;
    public JComboBox pokemontypelvl3v2;





    public CreateWindow() {
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
        trainerlabel1v2 = new JLabel(" name :");
        {
            trainerlabel1v2.setForeground(Color.white);
            trainerlabel1v2.setBounds(500,130,100,20);
            frame.getContentPane().add(trainerlabel1v2);
        }
        trainername1v2 = new JTextField();
        {
            trainername1v2.setBounds(550,130,80,20);
            trainername1v2.setDocument(new JTextFieldLimit(10));
            frame.getContentPane().add(trainername1v2);
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

        ReadyButton = new JButton("Ready");
        {
            ReadyButton.setBounds(280,430,100,32);
            frame.getContentPane().add(ReadyButton);
        }
        background = new JLabel();
        {
            background.setIcon(new ImageIcon("pictures\\PlayWindow.jpg"));
            background.setBounds(0,0,700,500);
            frame.getContentPane().add(background);
        }
    }

    public JButton getReadyButton(){return ReadyButton;}
}
