import controller.Controller;
import model.Pokemon;
import model.Trainer;

import java.awt.*;

import model.Trainer;
import controller.Controller;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;

public class Main{

    public static void main(String[] args)
    {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                try{

                    Controller cont = new Controller();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });



    }


}