// made by Wąsik Dariusz(github.com/dariusz202)
package pl.dariusz202.controller;

import pl.dariusz202.model.Pokemon;
import pl.dariusz202.model.Trainer;
import pl.dariusz202.view.Application;
import pl.dariusz202.view.TextAreaOutputStream;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;


public class Controller implements ActionListener {

    public Application gui;
    public Trainer player1;
    public Trainer player2;
    public TextAreaOutputStream taOutputStream;

    public Controller() {
        this.gui = new Application();
    }

    private void addActionListenerStartWindow() {
        gui.getPlayButton().addActionListener(e -> {
            switchView(GameView.PLAY);
        });
    }

    private void addActionListenercreatewindow() {
        gui.getReadyButton().addActionListener(this);
    }

    private void addActionListenergamewindow() {

        gui.getReviveButton1().addActionListener(this);
        gui.getPotionButton1().addActionListener(this);
        gui.getAttackButton1().addActionListener(this);
        gui.getReviveButton2().addActionListener(this);
        gui.getPotionButton2().addActionListener(this);
        gui.getAttackButton2().addActionListener(this);
        gui.getSelectlvl1Button1().addActionListener(this);
        gui.getSelectlvl2Button1().addActionListener(this);
        gui.getSelectlvl3Button1().addActionListener(this);
        gui.getSelectlvl1Button2().addActionListener(this);
        gui.getSelectlvl2Button2().addActionListener(this);
        gui.getSelectlvl3Button2().addActionListener(this);
    }

    public void updateViewForPlayerWithIndex(int playerIndex) {
        boolean enable = playerIndex == Trainer.PLAYER_1_INDEX;
        gui.Selectlvl1Button1.setEnabled(enable);
        gui.Selectlvl2Button1.setEnabled(enable);
        gui.Selectlvl3Button1.setEnabled(enable);
        gui.ReviveButton1.setEnabled(enable);
        gui.PotionButton1.setEnabled(enable);
        gui.AttackButton1.setEnabled(enable);
        gui.Selectlvl1Button2.setEnabled(!enable);
        gui.Selectlvl2Button2.setEnabled(!enable);
        gui.Selectlvl3Button2.setEnabled(!enable);
        gui.ReviveButton2.setEnabled(!enable);
        gui.PotionButton2.setEnabled(!enable);
        gui.AttackButton2.setEnabled(!enable);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (((e.getSource() == gui.getReadyButton()))) {
                switchView(GameView.GAME);
            }
            if (((e.getSource() == gui.getReviveButton1()))) {
                reviveButton1();
            }
            if (((e.getSource() == gui.getPotionButton1()))) {
                PotionButton1();
            }
            if (((e.getSource() == gui.getAttackButton1()))) {
                try {
                    attackButton1();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            if (((e.getSource() == gui.getReviveButton2()))) {
                try {
                    ReviveButton2();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            if (((e.getSource() == gui.getPotionButton2()))) {
                try {
                    PotionButton2();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            if (((e.getSource() == gui.getAttackButton2()))) {
                try {
                    AttackButton2();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            if (((e.getSource() == gui.getSelectlvl1Button1()))) {
                try {
                    Selectlvl1Button1();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            if (((e.getSource() == gui.getSelectlvl2Button1()))) {
                try {
                    Selectlvl2Button1();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            if (((e.getSource() == gui.getSelectlvl3Button1()))) {
                try {
                    Selectlvl3Button1();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            if (((e.getSource() == gui.getSelectlvl1Button2()))) {
                try {
                    Selectlvl1Button2();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            if (((e.getSource() == gui.getSelectlvl2Button2()))) {
                try {
                    Selectlvl2Button2();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            if (((e.getSource() == gui.getSelectlvl3Button2()))) {
                try {
                    Selectlvl3Button2();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public Trainer player1() {
        Pokemon a = new Pokemon(gui.pokemonnamelvl1.getText(), 1, gui.pokemontypelvl1.getSelectedItem().toString());
        Pokemon b = new Pokemon(gui.pokemonnamelvl2.getText(), 2, gui.pokemontypelvl2.getSelectedItem().toString());
        Pokemon c = new Pokemon(gui.pokemonnamelvl3.getText(), 3, gui.pokemontypelvl3.getSelectedItem().toString());
        player1 = new Trainer(Trainer.PLAYER_1_INDEX, gui.trainername1.getText(), new Pokemon[]{a, b, c});
        return player1;
    }

    public Trainer player2() {

        Pokemon d = new Pokemon(gui.pokemonnamelvl1v2.getText(), 1, gui.pokemontypelvl1v2.getSelectedItem().toString());
        Pokemon e = new Pokemon(gui.pokemonnamelvl2v2.getText(), 2, gui.pokemontypelvl2v2.getSelectedItem().toString());
        Pokemon f = new Pokemon(gui.pokemonnamelvl3v2.getText(), 3, gui.pokemontypelvl3v2.getSelectedItem().toString());
        player2 = new Trainer(Trainer.PLAYER_2_INDEX, gui.trainername2.getText(), new Pokemon[]{d, e, f});
        return player2;
    }

    private Trainer Selectlvl1Button1() {
        if (player1.currentlypokemon == 0) {
            System.out.println(player1.trainername + " you already have chosen this pokemon !");
            return player1;
        } else {
            player1.changepokemon(0);
            gui.currentpokemonname1.setText("Currently pokemon :" + (player1.pokemons[player1.currentlypokemon].name));
            return player1;
        }
    }

    private Trainer Selectlvl2Button1() {
        if (player1.currentlypokemon == 1) {
            System.out.println(player1.trainername + " you already have chosen this pokemon !");
            return player1;
        } else {
            player1.changepokemon(1);
            gui.currentpokemonname1.setText("Currently pokemon :" + (player1.pokemons[player1.currentlypokemon].name));
            return player1;
        }
    }

    private Trainer Selectlvl3Button1() {
        if (player1.currentlypokemon == 2) {
            System.out.println(player1.trainername + " you already have chosen this pokemon !");
            return player1;
        } else {
            player1.changepokemon(2);
            gui.currentpokemonname1.setText("Currently pokemon :" + (player1.pokemons[player1.currentlypokemon].name));
            return player1;
        }
    }

    private Trainer reviveButton1() {
        if (player1.possiblerevive > 0 && player1.pokemons[player1.currentlypokemon].current_health == 0) {
            if (player1.pokemons[player1.currentlypokemon] == player1.pokemons[0]) {
                player1.revive();
                gui.possiblerevive1.setText("Possible revive :" + player1.possiblerevive);
                gui.pokemonlvl1currenthealth.setText("Current health : " + player1.pokemons[0].current_health);
                return player1;
            }
            if (player1.pokemons[player1.currentlypokemon] == player1.pokemons[1]) {
                player1.revive();
                gui.possiblerevive1.setText("Possible revive :" + player1.possiblerevive);
                gui.pokemonlvl2currenthealth.setText("Current health : " + player1.pokemons[1].current_health);
                return player1;
            }
            if (player1.pokemons[player1.currentlypokemon] == player1.pokemons[2]) {
                player1.revive();
                gui.possiblerevive1.setText("Possible revive :" + player1.possiblerevive);
                gui.pokemonlvl3currenthealth.setText("Current health : " + player1.pokemons[2].current_health);
                return player1;
            }
        }
        if (player1.possiblerevive > 0 && checkCurrentTrainerPokemonHP(player1, 0)) {
            System.out.println(player1.trainername + "wanted to revive his current pokemon (" + player1.pokemons[player1.currentlypokemon].name + ") who is still alive !");
            return player1;
        } else {
            System.out.println(player1.trainername + " can't revive any more pokemons");
            return player1;
        }
    }

    private Trainer PotionButton1() {

        if (player1.numberofpotion > 0) {
            if (checkCurrentTrainerPokemonHP(player1, 100) && checkCurrentTrainerPokemonHP(player1, 0)) {
                if (player1.pokemons[player1.currentlypokemon] == player1.pokemons[0]) {
                    player1.potion();
                    gui.numberofpotion1.setText("Number of potion :" + player1.numberofpotion);
                    gui.pokemonlvl1currenthealth.setText("Current health : " + player1.pokemons[0].current_health);
                    return player1;
                }
                if (player1.pokemons[player1.currentlypokemon] == player1.pokemons[1]) {
                    player1.potion();
                    gui.numberofpotion2.setText("Number of potion :" + player1.numberofpotion);
                    gui.pokemonlvl2currenthealth.setText("Current health : " + player1.pokemons[1].current_health);
                    return player1;
                }
                if (player1.pokemons[player1.currentlypokemon] == player1.pokemons[2]) {
                    player1.potion();
                    gui.numberofpotion1.setText("Number of potion :" + player1.numberofpotion);
                    gui.pokemonlvl3currenthealth.setText("Current health : " + player1.pokemons[2].current_health);
                    return player1;
                }
            }
            if (player1.pokemons[player1.currentlypokemon].current_health == 0) {
                System.out.println(player1.trainername + " wanted to use the potion on the current pokemon which is knocked down");
                return player1;
            } else {
                System.out.println(player1.trainername + " wanted to use the potion on the current pokemon which is in full health");
                return player1;
            }
        } else {
            System.out.println(player1.trainername + " has already exhausted his potion limit");
            return player1;
        }
    }

    public void attackButton1() {
        attack(player1, player2);
    }

    private void AttackButton2() {
        attack(player2, player1);
    }

    private void attack(Trainer attackingTrainer, Trainer defendingTrainer) {
        if (checkCurrentTrainerPokemonHP(attackingTrainer, 0)) {
            attackingTrainer.attackOtherTrainer(defendingTrainer);

            for (int i = 0; i < 3; i++) {
                if (defendingTrainer.pokemons[defendingTrainer.currentlypokemon] == defendingTrainer.pokemons[i]) {
                    JLabel healthLabel = gui.getHealthLabel(attackingTrainer.getIndex(), i);
                    healthLabel.setText("Current health : " + defendingTrainer.pokemons[i].current_health);
                }
            }

            updateViewForPlayerWithIndex(defendingTrainer.getIndex());

        } else {
            System.out.println(defendingTrainer.trainername + " need to change his current pokemon");
        }
    }

    private boolean checkCurrentTrainerPokemonHP(Trainer trainer, int hp) {
        return trainer.pokemons[trainer.currentlypokemon].current_health != hp;
    }

    private Trainer Selectlvl1Button2() {
        if (player2.currentlypokemon == 0) {
            System.out.println(player2.trainername + " you already have chosen this pokemon !");
            return player2;
        } else {
            player2.changepokemon(0);
            gui.currentpokemonname2.setText("Currently pokemon :" + (player2.pokemons[player2.currentlypokemon].name));
            return player2;
        }
    }

    private Trainer Selectlvl2Button2() {
        if (player2.currentlypokemon == 1) {
            System.out.println(player2.trainername + " you already have chosen this pokemon !");
            return player2;
        } else {
            player2.changepokemon(1);
            gui.currentpokemonname2.setText("Currently pokemon :" + (player2.pokemons[player2.currentlypokemon].name));
            return player2;
        }
    }

    private Trainer Selectlvl3Button2() {
        if (player2.currentlypokemon == 2) {
            System.out.println(player2.trainername + " you already have chosen this pokemon !");
            return player2;
        } else {
            player2.changepokemon(2);
            gui.currentpokemonname2.setText("Currently pokemon :" + (player2.pokemons[player2.currentlypokemon].name));
            return player2;
        }
    }

    private Trainer ReviveButton2() {
        if (player2.possiblerevive > 0 && player2.pokemons[player2.currentlypokemon].current_health == 0) {
            if (player2.pokemons[player2.currentlypokemon] == player2.pokemons[0]) {
                player2.revive();
                gui.possiblerevive2.setText("Possible revive :" + player2.possiblerevive);
                gui.pokemonlvl1currenthealthv2.setText("Current health : " + player2.pokemons[0].current_health);
                return player2;
            }
            if (player2.pokemons[player2.currentlypokemon] == player2.pokemons[1]) {
                player2.revive();
                gui.possiblerevive2.setText("Possible revive :" + player2.possiblerevive);
                gui.pokemonlvl2currenthealthv2.setText("Current health : " + player2.pokemons[1].current_health);
                return player2;
            }
            if (player2.pokemons[player2.currentlypokemon] == player2.pokemons[2]) {
                player2.revive();
                gui.possiblerevive2.setText("Possible revive :" + player2.possiblerevive);
                gui.pokemonlvl3currenthealthv2.setText("Current health : " + player2.pokemons[2].current_health);
                return player2;
            }

        }
        if (player2.possiblerevive > 0 && checkCurrentTrainerPokemonHP(player2, 0)) {
            System.out.println(player2.trainername + "wanted to revive his current pokemon (" + player2.pokemons[player2.currentlypokemon].name + ") who is still alive !");
            return player2;
        } else {
            System.out.println(player2.trainername + " can't revive any more pokemons");
            return player2;
        }

    }

    private Trainer PotionButton2() {
        if (player2.numberofpotion > 0) {
            if (checkCurrentTrainerPokemonHP(player2, 100) && checkCurrentTrainerPokemonHP(player2, 0)) {
                if (player2.pokemons[player2.currentlypokemon] == player2.pokemons[0]) {
                    player2.potion();
                    gui.numberofpotion2.setText("Number of potion :" + player2.numberofpotion);
                    gui.pokemonlvl1currenthealthv2.setText("Current health : " + player2.pokemons[0].current_health);
                    return player2;
                }
                if (player2.pokemons[player2.currentlypokemon] == player2.pokemons[1]) {
                    player2.potion();
                    gui.numberofpotion2.setText("Number of potion :" + player2.numberofpotion);
                    gui.pokemonlvl2currenthealthv2.setText("Current health : " + player2.pokemons[1].current_health);
                    return player2;
                }
                if (player2.pokemons[player2.currentlypokemon] == player2.pokemons[2]) {
                    player2.potion();
                    gui.numberofpotion2.setText("Number of potion :" + player2.numberofpotion);
                    gui.pokemonlvl3currenthealthv2.setText("Current health : " + player2.pokemons[2].current_health);
                    return player2;
                }

            }
            if (player2.pokemons[player2.currentlypokemon].current_health == 0) {
                System.out.println(player2.trainername + " wanted to use the potion on the current pokemon which is knocked down");
                return player2;
            } else {
                System.out.println(player2.trainername + " wanted to use the potion on the current pokemon which is in full health");
                return player2;
            }
        } else {
            System.out.println(player2.trainername + " has already exhausted his potion limit");
            return player2;
        }
    }


    private void switchView(GameView targetView) {
        switch (targetView) {
            case PLAY:
                gui.frame.getContentPane().removeAll();
                gui.frame.repaint();
                gui.createwindowbuttons();
                addActionListenercreatewindow();
                gui.createwindow();
                break;
            case GAME:
                player1();
                player2();
                gui.frame.getContentPane().removeAll();
                gui.frame.repaint();

                gui.gamewindowbuttons();
                addActionListenergamewindow();
                gui.gamewindow();
                gui.textpanel.add(gui.scrollPane);
                taOutputStream = new TextAreaOutputStream(gui.textArea, "");
                System.setOut(new PrintStream(taOutputStream));

                gui.numberofpotion1.setText("Number of potion :" + player1.numberofpotion);
                gui.trainerlabel1.setText("Name :" + player1.trainername);
                gui.currentpokemonname1.setText("Currently pokemon :" + (player1.pokemons[player1.currentlypokemon].name));
                gui.possiblerevive1.setText("Possible revive :" + (player1.possiblerevive));

                gui.Selectlvl1Button1.setText(" Select " + player1.pokemons[0].name);
                gui.pokemontypelabellvl1.setText("Type : " + player1.pokemons[0].type);
                gui.pokemonlvl1currenthealth.setText("Current health : " + player1.pokemons[0].current_health);

                gui.Selectlvl2Button1.setText(" Select " + player1.pokemons[1].name);
                gui.pokemontypelabellvl2.setText("Type :" + player1.pokemons[1].type);
                gui.pokemonlvl2currenthealth.setText("Current health : " + player1.pokemons[1].current_health);

                gui.Selectlvl3Button1.setText(" Select " + player1.pokemons[2].name);
                gui.pokemontypelabellvl3.setText("Type : " + player1.pokemons[2].type);
                gui.pokemonlvl3currenthealth.setText("Current health : " + player1.pokemons[2].current_health);

                gui.numberofpotion2.setText("Number of potion :" + player2.numberofpotion);
                gui.trainerlabel2.setText("Name :" + player2.trainername);
                gui.currentpokemonname2.setText("Currently pokemon :" + (player2.pokemons[player2.currentlypokemon].name));
                gui.possiblerevive2.setText("Possible revive :" + (player2.possiblerevive));

                gui.Selectlvl1Button2.setText(" Select " + player2.pokemons[0].name);
                gui.pokemontypelabellvl1v2.setText("Type : " + player2.pokemons[0].type);
                gui.pokemonlvl1currenthealthv2.setText("Current health : " + player2.pokemons[0].current_health);

                gui.Selectlvl2Button2.setText(" Select " + player2.pokemons[1].name);
                gui.pokemontypelabellvl2v2.setText("Type :" + player2.pokemons[1].type);
                gui.pokemonlvl2currenthealthv2.setText("Current health : " + player1.pokemons[1].current_health);

                gui.Selectlvl3Button2.setText(" Select " + player2.pokemons[2].name);
                gui.pokemontypelabellvl3v2.setText("Type : " + player2.pokemons[2].type);
                gui.pokemonlvl3currenthealthv2.setText("Current health : " + player2.pokemons[2].current_health);

                updateViewForPlayerWithIndex(0);
                break;

        }
    }

    public void start() {
        this.gui.frame.setVisible(true);
        addActionListenerStartWindow();
    }
}
