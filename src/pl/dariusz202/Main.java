package pl.dariusz202;// made by Wąsik Dariusz(github.com/dariusz202)

import pl.dariusz202.controller.Controller;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Controller cont = new Controller();
                cont.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

}