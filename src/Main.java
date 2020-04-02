// made by Wąsik Dariusz(github.com/dariusz202)
import controller.Controller;
import java.awt.*;


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