import controller.Controller;
import model.Pokemon;
import model.Trainer;

import java.awt.*;


public class Main{
    public static void main(String[] args)
    {
        /*
        Pokemon a = new Pokemon("baybe",3,"Fire");
        Pokemon b = new Pokemon("baybev2",3,"Grass");
        Pokemon c = new Pokemon("test",3,"Grass");
        Trainer first = new Trainer("dupav1", new Pokemon[] {a,c});
        Trainer secound = new Trainer("dupav2",new Pokemon[] {b}) ;
        first.attack_other_trainer(secound);
        first.changepokemon(1);
         */
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